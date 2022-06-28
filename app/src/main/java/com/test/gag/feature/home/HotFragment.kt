package com.test.gag.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.test.gag.R
import com.test.gag.app.App
import com.test.gag.app.BaseFragment
import com.test.gag.db.models.Gag
import com.test.gag.extensions.observeEvent
import com.test.gag.util.view.setContentColorScheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.content_recycler_view.*


@AndroidEntryPoint
class HotFragment : BaseFragment() {

    private val mainViewModel: MainViewModel by viewModels()
    private var adapter: PagingAdapter? = null
    private val navController: NavController? get() = baseActivity?.navController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(
            R.layout.content_recycler_view,
            container,
            false
        ).apply { setupContentView() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireActivity().application as App)
            .appComponent
            .inject(this)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRefreshLayout()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        adapter = context?.let { PagingAdapter(::openSelectedImage, it) }
        contentView.layoutManager = LinearLayoutManager(context)
        contentView.adapter = adapter
        contentView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollVertically(1) && newState == RecyclerView.SCROLL_STATE_IDLE) {
                    loadNext()
                }
            }
        })
    }

    private fun loadNext() = mainViewModel.callApiLoadNext()

    private fun openSelectedImage(gag: Gag) {
        gag.let {
            gag._id?.let { it1 ->
                MainFragmentDirections.actionHotFragmentToViewImageFragment(it1).let {
                    navController?.navigate(it)
                }
            }
        }
    }

    private fun setupRefreshLayout() {
        refresh.apply {
            setContentColorScheme()
            setOnRefreshListener { mainViewModel.clearAndReloadData() }
        }
    }

    private fun setupContentView() {
        observeEvent(mainViewModel.list, ::updateData)
        observeEvent(mainViewModel.stopRefreshEvent) { stopRefreshing() }
        observeEvent(mainViewModel.contentLoadFail) { showToast() }
        observeEvent(mainViewModel.databaseClearedEvent) { reloadList() }

        mainViewModel.savedList.observe(viewLifecycleOwner) {
            adapter?.submitList(it?.distinctBy { it?._id }?.sortedBy { it?._id })
        }
    }

    private fun reloadList() {
        adapter?.submitList(mainViewModel.dataList.distinctBy { it._id }.sortedBy { it._id })
        adapter?.notifyDataSetChanged()
        mainViewModel.callApiLoadNext()
    }

    private fun stopRefreshing() {
        refresh.isRefreshing = false
    }

    private fun showToast() =
        Toast.makeText(context, getString(R.string.error), Toast.LENGTH_LONG).show()

    private fun updateData(gags: List<Gag?>?) {
        gags?.forEach {
            it?.let { it1 -> mainViewModel.dataList.add(it1) }
        }
        adapter?.submitList(mainViewModel.dataList.distinctBy { it._id }.sortedBy { it._id })
        adapter?.notifyDataSetChanged()
        mainViewModel.updateLocalData()
        mainViewModel.saveListState()
    }

}
