package com.tlugovaya.firsttask_release.ui.repertory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.tlugovaya.firsttask_release.R
import com.tlugovaya.firsttask_release.databinding.BannersListBinding
import com.tlugovaya.firsttask_release.databinding.ItemTitleBinding
import com.tlugovaya.firsttask_release.databinding.ReleaseListBinding
import com.tlugovaya.firsttask_release.ui.main.BannersReleaseMargin
import kotlin.properties.Delegates

class RepertoryAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var items: List<RepertoryItem> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            HEADER_VIEW_TYPE -> HeaderViewHolder(
                ItemTitleBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
            )
            BANNERS_VIEW_TYPE -> BannersViewHolder(
                BannersListBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
            )
            RELEASES_VIEW_TYPE -> ReleasesViewHolder(
                ReleaseListBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
            )
            else -> throw UnsupportedOperationException()
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        when (holder) {
            is HeaderViewHolder -> {
                (item as? RepertoryItem.Header)?.let { headerItem ->
                    holder.binding.titleItem.text = headerItem.title
                }
            }
            is BannersViewHolder -> {
                (item as? RepertoryItem.Banners)?.let { bannersItem ->
                    val adapter = ItemBannerAdapter(bannersItem.onBannerClickListener)
                    val snapHelper: SnapHelper = LinearSnapHelper()
                    val itemMargin = BannersReleaseMargin()
                    holder.binding.listBanners.addItemDecoration(itemMargin)
                    holder.binding.listBanners.adapter = adapter
                    adapter.banners = bannersItem.items
                    snapHelper.attachToRecyclerView(holder.binding.listBanners)
                }
            }
            is ReleasesViewHolder -> {
                (item as? RepertoryItem.Releases)?.let { releaseItem ->
                    val adapter = ItemReleaseAdapter(releaseItem.onReleaseClickListener)
                    val itemMargin = BannersReleaseMargin()
                    holder.binding.listRelease.addItemDecoration(itemMargin)
                    holder.binding.listRelease.adapter = adapter
                    adapter.releases = releaseItem.items
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int = when (items[position]) {
        is RepertoryItem.Header -> HEADER_VIEW_TYPE
        is RepertoryItem.Banners -> BANNERS_VIEW_TYPE
        is RepertoryItem.Releases -> RELEASES_VIEW_TYPE
    }

    override fun getItemCount(): Int = items.size

    class HeaderViewHolder(val binding: ItemTitleBinding) :
        RecyclerView.ViewHolder(binding.root)

    class BannersViewHolder(val binding: BannersListBinding) :
        RecyclerView.ViewHolder(binding.root)

    class ReleasesViewHolder(val binding: ReleaseListBinding) :
        RecyclerView.ViewHolder(binding.root)

    companion object {
        const val HEADER_VIEW_TYPE = 0
        const val BANNERS_VIEW_TYPE = 1
        const val RELEASES_VIEW_TYPE = 2
    }
}