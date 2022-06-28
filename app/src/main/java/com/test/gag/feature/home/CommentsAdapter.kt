package com.test.gag.feature.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.test.gag.R
import kotlinx.android.synthetic.main.comments_item.view.*

class CommentsAdapter(var loadComments: List<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CommentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.comments_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.commentText.text = loadComments[position]
    }

    override fun getItemCount(): Int = loadComments.size

    class CommentViewHolder internal constructor(v: View) : RecyclerView.ViewHolder(v) {
        var comment: TextView = v.findViewById(R.id.commentText)
    }
}
