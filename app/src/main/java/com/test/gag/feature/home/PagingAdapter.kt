package com.test.gag.feature.home

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.test.gag.R
import com.test.gag.db.models.Gag


class PagingAdapter(
    val clickListener: (Gag) -> Unit,
    val context: Context
) : BaseDiffAdapter<Gag, RecyclerView.ViewHolder>() {

    var videoList = mutableListOf<VideoView>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_NORMAL -> MainViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.content_item_layout, parent, false)
            )
            VIEW_TYPE_AD -> AdViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_ad_banner, parent, false)
            )
            VIEW_TYPE_VIDEO -> VideoViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_video_layout, parent, false)
            )
            else -> MainViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.content_item_layout, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when {
            getItemViewType(position) == VIEW_TYPE_NORMAL -> {
                bindContent(position, holder)
            }
            getItemViewType(position) == VIEW_TYPE_AD -> {
                bindAdContent(position, holder)
            }
            getItemViewType(position) == VIEW_TYPE_VIDEO -> {
                bindVideoContent(position, holder)
            }
        }
    }

    private fun bindContent(
        position: Int,
        holder: RecyclerView.ViewHolder
    ) {
        val gags = getItem(position)
        val viewHolder = holder as MainViewHolder
        glideWith(viewHolder.contentImage, gags?.url)
        viewHolder.contentId.text = gags?._id.toString()
        viewHolder.title.text = gags?.title
        viewHolder.nsfwTag.text = setNsfwTag(gags?.nsfw)
        viewHolder.contentCard.setOnClickListener { gags?.let { clickListener(gags) } }
    }

    private fun bindAdContent(
        position: Int,
        holder: RecyclerView.ViewHolder
    ) {
        val gags = getItem(position)
        val viewHolder = holder as AdViewHolder
        glideWith(viewHolder.contentImage, gags?.url)
        viewHolder.contentId.text = gags?._id.toString()
        viewHolder.title.text = gags?.title
        viewHolder.nsfwTag.text = setNsfwTag(gags?.nsfw)
        viewHolder.contentCard.setOnClickListener { gags?.let { clickListener(gags) } }
        viewHolder.adView.loadAd(AdRequest.Builder().build())
    }

    private fun bindVideoContent(
        position: Int,
        holder: RecyclerView.ViewHolder
    ) {
        val gags = getItem(position)
        val viewHolder = holder as VideoViewHolder
        val uri: Uri =
            Uri.parse("https://www.w3schools.com/tags/mov_bbb.mp4")
        viewHolder.videoView.setVideoURI(uri)
        viewHolder.videoView.setMediaController(null)
        viewHolder.videoView.start()
        viewHolder.contentId.text = gags?._id.toString()
        viewHolder.title.text = gags?.title
        viewHolder.nsfwTag.text = setNsfwTag(gags?.nsfw)
        viewHolder.title.setOnClickListener { gags?.let { clickListener(gags) } }
        videoList.add(viewHolder.videoView)
    }

    private fun setNsfwTag(nsfw: String?): String? {
        return when (nsfw) {
            "1" -> return "NSFW"
            else -> ""
        }
    }

    class VideoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val videoView: VideoView by lazy { view.findViewById<VideoView>(R.id.videoView) }
        val nsfwTag: TextView by lazy { view.findViewById<TextView>(R.id.nsfw) }
        val title: TextView by lazy { view.findViewById<TextView>(R.id.contentTitle) }
        val contentId: TextView by lazy { view.findViewById<TextView>(R.id.contentId) }
        val contentCard: CardView by lazy { view.findViewById<CardView>(R.id.contentCard) }
    }

    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val contentImage: ImageView by lazy { view.findViewById<ImageView>(R.id.contentImage) }
        val nsfwTag: TextView by lazy { view.findViewById<TextView>(R.id.nsfw) }
        val title: TextView by lazy { view.findViewById<TextView>(R.id.contentTitle) }
        val contentId: TextView by lazy { view.findViewById<TextView>(R.id.contentId) }
        val contentCard: CardView by lazy { view.findViewById<CardView>(R.id.contentCard) }
    }

    class AdViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val contentImage: ImageView by lazy { view.findViewById<ImageView>(R.id.contentImage) }
        val nsfwTag: TextView by lazy { view.findViewById<TextView>(R.id.nsfw) }
        val title: TextView by lazy { view.findViewById<TextView>(R.id.contentTitle) }
        val contentId: TextView by lazy { view.findViewById<TextView>(R.id.contentId) }
        val contentCard: CardView by lazy { view.findViewById<CardView>(R.id.contentCard) }
        val adView: AdView by lazy { view.findViewById<AdView>(R.id.adView) }
    }

    private fun glideWith(contentImage: ImageView?, imageUrl: String?) {
        if (contentImage != null) {
            Glide
                .with(context)
                .load(imageUrl)
                .fallback(R.drawable.not_found_image)
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(contentImage)
        }
    }

}
