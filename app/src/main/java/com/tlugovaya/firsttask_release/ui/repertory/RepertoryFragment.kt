package com.tlugovaya.firsttask_release.ui.repertory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tlugovaya.firsttask_release.R
import com.tlugovaya.firsttask_release.databinding.FragmentRepertoryBinding
import com.tlugovaya.firsttask_release.ui.release.ReleaseFragment

class RepertoryFragment : Fragment() {

    companion object {
        fun newInstance() = RepertoryFragment()
    }

    private lateinit var binding: FragmentRepertoryBinding

    private val viewModel: RepertoryViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRepertoryBinding.inflate(inflater, container, false)

        val adapter = RepertoryAdapter()
        binding.repertoryContentList.adapter = adapter

        val onReleaseClick: (String) -> Unit = { releaseId ->
            showReleaseFragment(releaseId)
        }

        viewModel.getRepertory().observe(viewLifecycleOwner) {
            val content: MutableList<RepertoryItem> = mutableListOf()

            if (it.banners.isNotEmpty()) {
                content += RepertoryItem.Banners(it.banners)
            }
            if (it.premiere.isNotEmpty()) {
                content += RepertoryItem.Header(getString(R.string.title_premiere))
                content += RepertoryItem.Releases(it.premiere, onReleaseClick)
            }
            if (it.now.isNotEmpty()) {
                content += RepertoryItem.Header(getString(R.string.title_now))
                content += RepertoryItem.Releases(it.now, onReleaseClick)
            }
            if (it.kids.isNotEmpty()) {
                content += RepertoryItem.Header(getString(R.string.title_kids))
                content += RepertoryItem.Releases(it.kids, onReleaseClick)
            }
            if (it.soon.isNotEmpty()) {
                content += RepertoryItem.Header(getString(R.string.title_soon))
                content += RepertoryItem.Releases(it.soon, onReleaseClick)
            }

            adapter.items = content
        }
        return binding.root
    }

    private fun showReleaseFragment(releaseId: String) {
        parentFragmentManager.beginTransaction()
            .add(R.id.activity_container, ReleaseFragment.newInstance(releaseId))
            .commitNow()
    }
}


