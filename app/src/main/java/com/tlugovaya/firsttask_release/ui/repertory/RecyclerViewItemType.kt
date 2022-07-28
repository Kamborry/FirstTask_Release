package com.tlugovaya.firsttask_release.ui.repertory

sealed class RecyclerViewItemType {
}

class BannerItemType : RecyclerViewItemType()
class TitleItemType : RecyclerViewItemType()
class ReleaseItemType : RecyclerViewItemType()