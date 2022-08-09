package com.tlugovaya.firsttask_release.ui.main

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class BannersReleaseMargin : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val context = parent.context

        outRect.top = context.dp2px(8)
        outRect.bottom = context.dp2px(12)

        val lastPosition = (parent.adapter?.itemCount ?: 0) - 1

        when (parent.getChildAdapterPosition(view)) {
            0 -> {
                outRect.left = context.dp2px(16)
            }
            lastPosition -> {
                outRect.right = context.dp2px(16)
                outRect.left = context.dp2px(8)
            }
            else -> {
                outRect.left = context.dp2px(8)
            }
        }
    }


}