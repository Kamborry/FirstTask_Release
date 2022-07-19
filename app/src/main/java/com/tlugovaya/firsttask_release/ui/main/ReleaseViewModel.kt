package com.tlugovaya.firsttask_release.ui.main

import androidx.lifecycle.ViewModel
import com.tlugovaya.firsttask_release.databinding.FragmentReleaseBinding


class ReleaseViewModel : ViewModel() {

    fun fillingWithDataFromMock (binding: FragmentReleaseBinding, release: Release){
        with(binding) {
            releaseAgeRating.text = release.ageRating
            genres.text = release.genres[0]
            releasePremiereDate.text = dateTimeFormatter(release.premiere)
            releaseCountryLocale.text = release.countries.joinToString()
            releaseDurationLocale.text = filmDuration(release.duration)
            releaseDirectorLocale.text = release.directors.joinToString()
            releaseStarringLocale.text = release.cast.joinToString()
            releaseStoryLocale.text = release.story
        }
    }
}