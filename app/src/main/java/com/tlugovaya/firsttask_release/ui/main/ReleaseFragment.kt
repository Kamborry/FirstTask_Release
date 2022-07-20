package com.tlugovaya.firsttask_release.ui.main

import android.app.ProgressDialog.show
import android.os.Bundle
import android.view.*
import android.widget.Toast
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
    var shareCall: MenuItem? = null

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
        toolbar.inflateMenu(R.menu.menu_release)
        toolbar.setNavigationOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()
        }

        setHasOptionsMenu(true)

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


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.share -> {
            Toast.makeText(requireContext(),"Share", Toast.LENGTH_SHORT).show()
            true
        }
        else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_release, menu)
        shareCall = menu.findItem(R.id.share)
        super.onCreateOptionsMenu(menu, inflater)
    }

}