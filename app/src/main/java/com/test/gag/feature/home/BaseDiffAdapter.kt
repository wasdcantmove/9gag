package com.test.gag.feature.home

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView


const val VIEW_TYPE_NORMAL = 0
const val VIEW_TYPE_VIDEO = 1
const val VIEW_TYPE_AD = 2

abstract class BaseDiffAdapter<T, ViewHolder : RecyclerView.ViewHolder>(diffCallback: DiffUtil.ItemCallback<T> = defaultCallback.defaultDiffCallback()) :
    ListAdapter<T, ViewHolder>(diffCallback) {

    override fun getItemViewType(position: Int): Int {
        return when {
            position % 5 == 0 && position != 0 -> VIEW_TYPE_AD
            position == 3 -> VIEW_TYPE_VIDEO
            else -> VIEW_TYPE_NORMAL
        }
    }

    object defaultCallback {
        fun <T> defaultDiffCallback(): DiffUtil.ItemCallback<T> {
            return object : DiffUtil.ItemCallback<T>() {
                override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
                    return oldItem == newItem
                }

                @SuppressLint("DiffUtilEquals")
                override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
                    return oldItem == newItem
                }
            }
        }
    }
}

