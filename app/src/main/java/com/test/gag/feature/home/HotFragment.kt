package com.test.gag.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.gag.R
import com.test.gag.app.App
import com.test.gag.app.BaseFragment
import com.test.gag.db.models.Gag
import com.test.gag.extensions.observeEvent
import com.test.gag.util.view.setContentColorScheme
import kotlinx.android.synthetic.main.content_recycler_view.*
import javax.inject.Inject

class HotFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private var adapter: PagingAdapter? = null
    private val navController: NavController? get() = baseActivity?.navController

    private val mainViewModel: MainViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory)[MainViewModel::class.java]
    }

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
            .component()
            .inject(this)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRefreshLayout()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        adapter = context?.let { PagingAdapter({ loadNext() }, ::openSelectedImage, it) }
        contentView.layoutManager = LinearLayoutManager(context)
        contentView.adapter = adapter
    }

    private fun loadNext() {
        mainViewModel.callApiLoadNext()
    }

    private fun openSelectedImage(gag: Gag) {
        gag.let {
            MainFragmentDirections.actionHotFragmentToViewImageFragment(gag._id).let {
                navController?.navigate(it)
            }
        }
    }

    private fun setupRefreshLayout() {
        refresh.apply {
            setContentColorScheme()
            setOnRefreshListener { mainViewModel.callApi() }
        }
    }

    private fun setupContentView() {
        observeEvent(mainViewModel.list, ::updateData)
        observeEvent(mainViewModel.stopRefreshEvent) { stopRefreshing() }
        observeEvent(mainViewModel.contentLoadFail) { showToast() }
    }

    private fun stopRefreshing() {
        refresh.isRefreshing = false
    }

    override fun onResume() {
        mainViewModel.loadLocalContent()
        super.onResume()
    }

    private fun showToast() =
        Toast.makeText(context, getString(R.string.error), Toast.LENGTH_LONG).show()

    private fun updateData(gags: List<Gag?>?) {
        adapter?.submitList(gags)
    }

}
