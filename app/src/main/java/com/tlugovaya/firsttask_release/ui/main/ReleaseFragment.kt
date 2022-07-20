package com.tlugovaya.firsttask_release.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.tlugovaya.firsttask_release.R
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
            toolbarImageRelease.downloadImage(
                release.screenShorts.first(),
                com.tlugovaya.firsttask_release.R.drawable.ic_title_placeholder
            )
            release.posterUrl?.let { imageReleasePreview.downloadImage(it) }
            releasePoster.downloadImage(release.videoThumbnailUrl)
        }

        val toolbar: Toolbar = binding.toolbar
        toolbar.setNavigationIcon(R.drawable.ic_back_button)
        toolbar.setNavigationOnClickListener { activity!!.onBackPressed()}

        return binding.root
    }

    private fun fillingWithDataFromMock(binding: FragmentReleaseBinding, release: Release) {
        with(binding) {
            toolbar.title = release.title
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

    private fun showMainFragment() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.activity_container, MainPageFragment.newInstance())
            .commitNow()
    }
}