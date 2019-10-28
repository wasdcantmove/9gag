package com.test.gag.feature.home

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

const val VIEW_TYPE_NORMAL = 0
const val VIEW_TYPE_LOADING = 1
const val VIEW_TYPE_AD = 2

abstract class BaseDiffAdapter<T, ViewHolder : RecyclerView.ViewHolder>(diffCallback: DiffUtil.ItemCallback<T> = defaultCallback.defaultDiffCallback()) :
    ListAdapter<T, ViewHolder>(diffCallback) {

    var loading: Boolean = true
        set(value) {
            field = value
            if (!loading) {
                notifyDataSetChanged()
            }
        }

    protected inner class LoadingViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun getItemViewType(position: Int): Int {
        return when {
            position % 2 == 0 -> VIEW_TYPE_AD
            loading && position == itemCount - 1 -> VIEW_TYPE_LOADING
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

