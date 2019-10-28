package com.test.gag.feature.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.google.android.material.card.MaterialCardView
import com.test.gag.R
import com.test.gag.db.models.Gag


class PagingAdapter(val loadNext: (Unit) -> Unit, val clickListener: (Gag) -> Unit, val context: Context) :
    BaseDiffAdapter<Gag, RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_NORMAL -> MainViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.content_item_layout, parent, false)
            )
            VIEW_TYPE_AD -> MainViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_ad_banner, parent, false)
            )
            else -> LoadingViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_loading, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when {
            getItemViewType(position) == VIEW_TYPE_NORMAL -> {
                bindContent(position, holder)
            }
            getItemViewType(position) == VIEW_TYPE_AD -> {
                bindContent(position, holder)
            }
            getItemViewType(position) == VIEW_TYPE_LOADING -> {
                loadNext.invoke(Unit)
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
        viewHolder.title.text = gags.title
        viewHolder.nsfwTag.text = setNsfwTag(gags.nsfw)
        viewHolder.contentCard.setOnClickListener { gags?.let { clickListener(gags) } }
    }

    private fun setNsfwTag(nsfw: String): String? {
        return when (nsfw) {
            "1" -> return "NSFW"
            else -> ""
        }
    }

    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val contentImage: ImageView by lazy { view.findViewById<ImageView>(R.id.contentImage) }
        val nsfwTag: TextView by lazy { view.findViewById<TextView>(R.id.nsfw) }
        val title: TextView by lazy { view.findViewById<TextView>(R.id.contentTitle) }
        val contentId: TextView by lazy { view.findViewById<TextView>(R.id.contentId) }
        val contentCard: MaterialCardView by lazy { view.findViewById<MaterialCardView>(R.id.contentCard) }
    }

    private fun glideWith(contentImage: ImageView?, imageUrl: String?) {
        if (contentImage != null) {
            Glide
                .with(context)
                .load(imageUrl)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(contentImage)
        }
    }

}
