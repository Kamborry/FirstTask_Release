package com.tlugovaya.firsttask_release.ui.repertory

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tlugovaya.firsttask_release.databinding.ItemBannerBinding
import com.tlugovaya.firsttask_release.model.Banner

class ItemBannerAdapter : RecyclerView.Adapter<ItemBannerAdapter.ItemBannerViewHolder> {

    val banners: List<Banner> = emptyList()

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemBannerViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemBannerViewHolder {
        TODO("Not yet implemented")
    }

    class ItemBannerViewHolder(
        val bindingItemBanner: ItemBannerBinding
    ) : RecyclerView.ViewHolder(bindingItemBanner.root) {
    }
}