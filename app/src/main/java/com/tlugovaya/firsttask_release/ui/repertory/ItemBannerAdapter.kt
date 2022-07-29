package com.tlugovaya.firsttask_release.ui.repertory

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tlugovaya.firsttask_release.databinding.ItemBannerBinding
import com.tlugovaya.firsttask_release.model.Banner
import com.tlugovaya.firsttask_release.model.Release

class RepertoryAdapter : RecyclerView.Adapter<RepertoryAdapter.RepertoryViewHolder> {

    val banners: List<Banner> = emptyList()
    val now: List<Release> = emptyList()
    val premiere: List<Release> = emptyList()
    val kids: List<Release> = emptyList()
    val soon: List<Release> = emptyList()


    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RepertoryViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepertoryViewHolder {
        TODO("Not yet implemented")
    }

    class RepertoryViewHolder(
        //Может, нужно создать какой-то контейнер, в который будем складывать item?
        val bindingItemBanner: ItemBannerBinding
        //val bindingItemTitle: ItemTitleBinding,
        //val bindingItemRelease: ItemReleaseBinding
    ) : RecyclerView.ViewHolder(bindingItemBanner.root) {
    }
}