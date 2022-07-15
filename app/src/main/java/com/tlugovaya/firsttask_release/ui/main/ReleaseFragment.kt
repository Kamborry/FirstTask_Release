package com.tlugovaya.firsttask_release.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tlugovaya.firsttask_release.R
import com.tlugovaya.firsttask_release.databinding.FragmentMainPageBinding
import com.tlugovaya.firsttask_release.databinding.FragmentReleaseBinding

class ReleaseFragment : Fragment() {

    companion object {
        fun newInstance() = ReleaseFragment()
    }

    private lateinit var viewModel: ReleaseViewModel
    private lateinit var binding: FragmentReleaseBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentReleaseBinding.inflate(inflater, container, false)
        val release = getMockRelease()
        with(binding) {
            releaseAgeRating.text = release.ageRating
            genres.text = release.genres[0]
            releasePremiereDate.text = release.premiere
            releaseCountryLocale.text = release.countries.joinToString()
            releaseDurationLocale.text = release.duration.toString()
            releaseDirectorLocale.text = release.directors.joinToString()
            releaseStarringLocale.text = release.cast.joinToString()
            releaseStoryLocale.text = release.story
        }

        return binding.root
    }


}