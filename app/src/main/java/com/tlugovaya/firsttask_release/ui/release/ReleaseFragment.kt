package com.tlugovaya.firsttask_release.ui.release

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tlugovaya.firsttask_release.R
import com.tlugovaya.firsttask_release.databinding.FragmentReleaseBinding
import com.tlugovaya.firsttask_release.model.Release
import com.tlugovaya.firsttask_release.ui.main.dateTimeFormatter
import com.tlugovaya.firsttask_release.ui.main.downloadImage
import com.tlugovaya.firsttask_release.ui.main.filmDuration


class ReleaseFragment : Fragment() {

    companion object {

        private const val RELEASE_ID_KEY = "release_id_key"

        fun newInstance(releaseId: String) = ReleaseFragment().apply {
            arguments = Bundle().apply {
                putString(RELEASE_ID_KEY, releaseId)
            }
        }
    }

    private lateinit var viewModelFactory: ReleaseViewModelFactory

    private val viewModel: ReleaseViewModel by viewModels { viewModelFactory }
    private lateinit var binding: FragmentReleaseBinding
    private val release by lazy { viewModel.release }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Инициализируем биндинг.
        binding = FragmentReleaseBinding.inflate(inflater, container, false)

        val releaseId = arguments!!.getString(RELEASE_ID_KEY)!!
        viewModelFactory = ReleaseViewModelFactory(releaseId)



        with(binding) {
            //Заполняем данными binding.
            release?.let { fillingWithDataFromMock(it) }
            release?.screenShorts?.let {
                toolbarImageRelease.downloadImage(
                    it.first(),
                    R.drawable.ph_title_image
                )
            }
            release?.posterUrl?.let { imageReleasePreview.downloadImage(it) }
            release?.let { releasePoster.downloadImage(it.videoThumbnailUrl) }
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
        releaseDurationLocale.text = release.duration?.let { context?.filmDuration(it) }
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