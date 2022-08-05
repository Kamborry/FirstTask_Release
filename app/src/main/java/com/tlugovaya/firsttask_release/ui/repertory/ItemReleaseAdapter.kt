package com.tlugovaya.firsttask_release.ui.repertory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tlugovaya.firsttask_release.databinding.ItemReleaseBinding
import com.tlugovaya.firsttask_release.model.Release
import com.tlugovaya.firsttask_release.ui.main.downloadImage
import kotlin.properties.Delegates

class ItemReleaseAdapter(
    val onReleaseClickListener: (String) -> Unit
) : RecyclerView.Adapter<ItemReleaseAdapter.ItemReleaseViewHolder>() {

    var releases: List<Release> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemReleaseViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemReleaseBinding.inflate(layoutInflater, parent, false)
        return ItemReleaseViewHolder(itemBinding).apply {
            itemView.setOnClickListener {
                val currentRelease = releases[adapterPosition]
                onReleaseClickListener(currentRelease.id)
            }
        }
    }

    override fun getItemCount(): Int = releases.size

    override fun onBindViewHolder(holder: ItemReleaseViewHolder, position: Int) {
        val release = releases[position]
        with(holder.bindingItemRelease) {
            release.posterUrl?.let { releaseItem.downloadImage(it) }
            genresItem.text = release.genres[0]
            filmTitleItem.text = release.title
        }
    }

    //fun getReleaseId(){}



    class ItemReleaseViewHolder(
        val bindingItemRelease: ItemReleaseBinding
    ) : RecyclerView.ViewHolder(bindingItemRelease.root)
}