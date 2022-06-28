package com.test.gag.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.test.gag.R
import com.test.gag.app.App
import com.test.gag.app.BaseFragment
import com.test.gag.db.models.Gag
import com.test.gag.extensions.observeEvent
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.image_view_layout.*


@AndroidEntryPoint
class ViewImageFragment : BaseFragment() {

    private val viewImageViewModel: ViewImageViewModel by viewModels()
    private var adapter: CommentsAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(
            R.layout.image_view_layout,
            container,
            false
        ).apply { setupContentView() }

    private fun setupContentView() {
        observeEvent(viewImageViewModel.gag, ::setUpView)
    }

    override fun onResume() {
        (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        super.onResume()
    }

    private fun setUpView(gag: Gag?) {
        title.text = gag?.title
        glideWith(gag?.url)
    }

    private fun setupRecyclerView() {
        adapter = CommentsAdapter(viewImageViewModel.loadComments())
        commentsRv.layoutManager = LinearLayoutManager(context)
        commentsRv.adapter = adapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireActivity().application as App)
            .appComponent
            .inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let { bundle ->
            ViewImageFragmentArgs.fromBundle(bundle)
                .let {
                    viewImageViewModel.imageId(it.selectedImage)
                }
        }
        setupRecyclerView()
    }

    private fun glideWith(imageUrl: String?) {
        Glide
            .with(this)
            .load(imageUrl)
            .fallback(R.drawable.not_found_image)
            .apply(
                RequestOptions()
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            )
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(selectedImage)
    }

}
