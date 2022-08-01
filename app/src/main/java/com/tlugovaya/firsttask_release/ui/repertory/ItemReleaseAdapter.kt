package com.tlugovaya.firsttask_release.ui.repertory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tlugovaya.firsttask_release.databinding.ItemReleaseBinding
import com.tlugovaya.firsttask_release.model.Banner
import com.tlugovaya.firsttask_release.model.Release
import com.tlugovaya.firsttask_release.ui.main.downloadImage

class ItemReleaseAdapter : RecyclerView.Adapter<ItemReleaseAdapter.ItemReleaseViewHolder>() {

    private val release: List<Release> = emptyList()

    override fun getItemCount(): Int = release.size

    override fun onBindViewHolder(holder: ItemReleaseViewHolder, position: Int) {
        val release = release[position]
        with(holder.bindingItemRelease){
            release.posterUrl?.let { releaseItem.downloadImage(it) }
            genresItem.text = release.genres[0]
            filmTitleItem.text = release.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemReleaseViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemReleaseBinding.inflate(layoutInflater, parent, false)
        return ItemReleaseViewHolder(itemBinding)
    }

    class ItemReleaseViewHolder(
        val bindingItemRelease: ItemReleaseBinding
    ) : RecyclerView.ViewHolder(bindingItemRelease.root) {
    }
}