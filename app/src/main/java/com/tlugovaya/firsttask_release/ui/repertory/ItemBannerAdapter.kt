package com.tlugovaya.firsttask_release.ui.repertory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tlugovaya.firsttask_release.databinding.ItemBannerBinding
import com.tlugovaya.firsttask_release.model.Banner
import com.tlugovaya.firsttask_release.ui.main.downloadImage

class ItemBannerAdapter : RecyclerView.Adapter<ItemBannerAdapter.ItemBannerViewHolder>() {

    private val banners: List<Banner> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemBannerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemBannerBinding.inflate(layoutInflater, parent, false)
        return ItemBannerViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = banners.size

    override fun onBindViewHolder(holder: ItemBannerViewHolder, position: Int) {
        val banner = banners[position]
        with(holder.bindingItemBanner) {
            bannerItem.downloadImage(banner.imageUrl)
        }
    }

    class ItemBannerViewHolder(
        val bindingItemBanner: ItemBannerBinding
    ) : RecyclerView.ViewHolder(bindingItemBanner.root) {
    }
}