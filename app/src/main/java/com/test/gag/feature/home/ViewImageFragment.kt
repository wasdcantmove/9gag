package com.test.gag.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.test.gag.R
import com.test.gag.app.App
import com.test.gag.app.BaseFragment
import com.test.gag.db.models.Gag
import com.test.gag.extensions.observeEvent
import kotlinx.android.synthetic.main.view_image_layout.*
import javax.inject.Inject


class ViewImageFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory


    private val viewImageViewModel: ViewImageViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory)[ViewImageViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(
            R.layout.view_image_layout,
            container,
            false
        ).apply { setupContentView() }

    private fun setupContentView() {
        observeEvent(viewImageViewModel.gag, ::setUpView)
    }

    private fun setUpView(gag: Gag?) {
        title.text = gag?.title
        glideWith(gag?.url)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireActivity().application as App)
            .component()
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
    }

    private fun glideWith(imageUrl: String?) {
        Glide
            .with(this)
            .load(imageUrl)
            .apply(
                RequestOptions()
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            )
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(contentImage)
    }

}
