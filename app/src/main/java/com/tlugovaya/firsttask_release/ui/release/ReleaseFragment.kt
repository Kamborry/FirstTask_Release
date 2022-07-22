package com.tlugovaya.firsttask_release.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.tlugovaya.firsttask_release.R
import com.tlugovaya.firsttask_release.databinding.FragmentReleaseBinding
import com.tlugovaya.firsttask_release.model.Release
import com.tlugovaya.firsttask_release.model.dateTimeFormatter
import com.tlugovaya.firsttask_release.model.filmDuration
import com.tlugovaya.firsttask_release.model.getMockRelease


class ReleaseFragment : Fragment() {

    companion object {
        fun newInstance() = ReleaseFragment()
    }

    private lateinit var binding: FragmentReleaseBinding
    private val release

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Инициализируем биндинг.
        binding = FragmentReleaseBinding.inflate(inflater, container, false)

        with(binding) {
            //Заполняем данными binding.
            fillingWithDataFromMock(release)
            toolbarImageRelease.downloadImage(
                release.screenShorts.first(),
                R.drawable.ph_title_image
            )
            release.posterUrl?.let { imageReleasePreview.downloadImage(it) }
            releasePoster.downloadImage(release.videoThumbnailUrl)
        }

        with(binding.toolbar) {
            inflateMenu(R.menu.menu_release)
            menu.findItem(R.id.share).setOnMenuItemClickListener {
                showInfo(R.string.dialog_share)
                true
            }
            setNavigationOnClickListener {
                activity?.supportFragmentManager
                    ?.beginTransaction()
                    ?.remove(this@ReleaseFragment)
                    ?.commit()
            }
        }

        binding.fillingClickListeners()

        return binding.root
    }

    private fun FragmentReleaseBinding.fillingWithDataFromMock(release: Release) {
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

    private fun showInfo(
        @StringRes dialogMessage: Int,
        @StringRes dialogTitle: Int = R.string.dialog_title
    ) {
        AlertDialog.Builder(requireContext())
            .setTitle(dialogTitle)
            .setMessage(dialogMessage)
            .show()
    }

    private fun View.setClickListenerWithAlertDialog(
        @StringRes dialogMessageRes: Int,
        @StringRes dialogTitle: Int = R.string.dialog_title
    ) {
        setOnClickListener {
            showInfo(dialogMessageRes, dialogTitle)
        }
    }

    private fun FragmentReleaseBinding.fillingClickListeners() {
        releasePlayImage.setClickListenerWithAlertDialog(R.string.dialog_play)
        buyButtonRelease.setClickListenerWithAlertDialog(R.string.dialog_buy_tickets)
    }
}