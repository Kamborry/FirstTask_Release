package com.tlugovaya.firsttask_release.ui.main

import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.tlugovaya.firsttask_release.R
import com.tlugovaya.firsttask_release.databinding.FragmentReleaseBinding

class PicassoModule {

    private lateinit var imageView: ImageView

    fun downloadImageForToolbar(binding: FragmentReleaseBinding, release: Release){
        imageView = binding.imageReleaseToolbar
        Picasso.get().load("")
            .placeholder(R.drawable.ic_placeholder_toolbar)
            .error(R.drawable.ic_placeholder_toolbar)
            .into(imageView)
    }

    fun downloadImageForPreview(binding: FragmentReleaseBinding, release: Release){
        imageView = binding.imageReleasePreview
        Picasso.get().load(release.posterUrl)
            .placeholder(R.drawable.ic_placeholder_preview)
            .error(R.drawable.ic_placeholder_preview)
            .into(imageView)
    }

    fun downloadImageForPoster(binding: FragmentReleaseBinding, release: Release){
        imageView = binding.releasePoster
        Picasso.get().load(release.videoThumbnailUrl)
            .placeholder(R.drawable.ic_placeholder_poster)
            .error(R.drawable.ic_placeholder_poster)
            .into(imageView)
    }

}