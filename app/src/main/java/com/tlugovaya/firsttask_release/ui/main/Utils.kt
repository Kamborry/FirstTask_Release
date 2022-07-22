package com.tlugovaya.firsttask_release.ui.main

import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.squareup.picasso.Picasso
import com.tlugovaya.firsttask_release.R

fun ImageView.downloadImage(
    url: String,
    @DrawableRes drawableIdPlaceholder: Int = R.drawable.ph_image_release,
    @DrawableRes drawableIdError: Int = R.drawable.ph_image_release
) {
    clipToOutline = true
    Picasso.get().load(url)
        .placeholder(drawableIdPlaceholder)
        .error(drawableIdError)
        .into(this)
}