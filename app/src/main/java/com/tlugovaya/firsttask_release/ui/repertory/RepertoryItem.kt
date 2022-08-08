package com.tlugovaya.firsttask_release.ui.repertory

import com.tlugovaya.firsttask_release.model.Banner
import com.tlugovaya.firsttask_release.model.Release

sealed class RepertoryItem {
    class Header(val title: String) : RepertoryItem()
    class Releases(val items: List<Release>, val onReleaseClickListener: (String) -> Unit) : RepertoryItem()
    class Banners(val items: List<Banner>, val onBannerClickListener: (String) -> Unit) : RepertoryItem()
}

