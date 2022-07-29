package com.tlugovaya.firsttask_release.ui.repertory

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tlugovaya.firsttask_release.databinding.ItemTitleBinding
import com.tlugovaya.firsttask_release.model.Release


class ItemTitleAdapter : RecyclerView.Adapter<ItemTitleAdapter.ItemTitleViewHolder> {

    private val title: List<Release> = emptyList()

    override fun getItemCount() = title.size


    override fun onBindViewHolder(holder: ItemTitleViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemTitleViewHolder {
        TODO("Not yet implemented")
    }

    class ItemTitleViewHolder(
        val bindingItemTitle: ItemTitleBinding
    ) : RecyclerView.ViewHolder(bindingItemTitle.root) {
    }
}