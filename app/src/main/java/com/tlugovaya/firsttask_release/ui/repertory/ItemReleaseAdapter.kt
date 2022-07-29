package com.tlugovaya.firsttask_release.ui.repertory

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tlugovaya.firsttask_release.databinding.ItemReleaseBinding
import com.tlugovaya.firsttask_release.model.Release

class ItemReleaseAdapter : RecyclerView.Adapter<ItemReleaseAdapter.ItemReleaseViewHolder> {

    val now: List<Release> = emptyList()
    val premiere: List<Release> = emptyList()
    val kids: List<Release> = emptyList()
    val soon: List<Release> = emptyList()


    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemReleaseViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemReleaseViewHolder {
        TODO("Not yet implemented")
    }

    class ItemReleaseViewHolder(
        val bindingItemRelease: ItemReleaseBinding
    ) : RecyclerView.ViewHolder(bindingItemRelease.root) {
    }
}