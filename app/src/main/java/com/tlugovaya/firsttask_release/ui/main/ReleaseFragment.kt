package com.tlugovaya.firsttask_release.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tlugovaya.firsttask_release.databinding.FragmentReleaseBinding

class ReleaseFragment : Fragment() {

    companion object {
        fun newInstance() = ReleaseFragment()
    }

    //private val viewModel: ReleaseViewModel by viewModels()
    private lateinit var binding: FragmentReleaseBinding
    private val release = getMockRelease()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Инициализируем биндинг.
        binding = FragmentReleaseBinding.inflate(inflater, container, false)

        with(binding) {
            //Заполняем данными binding.
            fillingWithDataFromMock(this, release)
            release.posterUrl?.let { imageReleasePreview.downloadImage(it) }
            releasePoster.downloadImage(release.videoThumbnailUrl)
        }
        return binding.root
    }

    private fun fillingWithDataFromMock(binding: FragmentReleaseBinding, release: Release) {
        with(binding) {
            releaseAgeRating.text = release.ageRating
            genres.text = release.genres[0]
            releasePremiereDate.text = dateTimeFormatter(release.premiere)
            releaseCountryLocale.text = release.countries.joinToString()
            releaseDurationLocale.text = release.duration?.let { filmDuration(it) }
            releaseDirectorLocale.text = release.directors.joinToString()
            releaseStarringLocale.text = release.cast.joinToString()
            releaseStoryLocale.text = release.story
        }
    }
}