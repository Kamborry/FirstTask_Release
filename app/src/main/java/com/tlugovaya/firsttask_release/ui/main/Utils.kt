package com.tlugovaya.firsttask_release.ui.main

import android.content.Context
import android.widget.ImageView
import androidx.annotation.DrawableRes

import com.squareup.picasso.Picasso
import com.tlugovaya.firsttask_release.R
import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter
import kotlin.math.roundToInt

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

fun Context.filmDuration(time: Long): String {
    val hours = time / 60
    val minutes = time % 60
    return getString(R.string.release_duration, hours, minutes)
}

fun dateTimeFormatter(premiere: String): String {
    val formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy")
    val localDate = LocalDate.parse(premiere, DateTimeFormatter.ofPattern("yyyy-MM-dd"))
    return localDate.format(formatter)
}

fun Context.screenPercent2px(percent: Int) = (resources.displayMetrics.widthPixels / 100.0 * percent).roundToInt()