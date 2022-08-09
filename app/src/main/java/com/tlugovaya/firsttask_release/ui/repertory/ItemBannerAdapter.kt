package com.tlugovaya.firsttask_release.ui.repertory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tlugovaya.firsttask_release.databinding.ItemBannerBinding
import com.tlugovaya.firsttask_release.model.Banner
import com.tlugovaya.firsttask_release.ui.main.downloadImage
import com.tlugovaya.firsttask_release.ui.main.screenPercent2px
import kotlin.properties.Delegates

class ItemBannerAdapter(
    val onBannerClickListener: (String) -> Unit
) : RecyclerView.Adapter<ItemBannerAdapter.ItemBannerViewHolder>() {

    var banners: List<Banner> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemBannerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemBannerBinding.inflate(layoutInflater, parent, false)
        return ItemBannerViewHolder(itemBinding).apply {
            itemView.setOnClickListener {
                val currentBanner = banners[adapterPosition]
                onBannerClickListener(currentBanner.imageUrl)
            }
        }
    }

    override fun getItemCount(): Int = banners.size

    override fun onBindViewHolder(holder: ItemBannerViewHolder, position: Int) {
        val banner = banners[position]
        with(holder.bindingItemBanner) {
            bannerItem.layoutParams.width = bannerItem.context.screenPercent2px(88)
            bannerItem.downloadImage(banner.imageUrl)
        }
    }

    class ItemBannerViewHolder(
        val bindingItemBanner: ItemBannerBinding
    ) : RecyclerView.ViewHolder(bindingItemBanner.root)
}