package com.tlugovaya.firsttask_release.ui.repertory

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tlugovaya.firsttask_release.databinding.FragmentRepertoryBinding

class RepertoryFragment : Fragment() {

    companion object {
        fun newInstance() = RepertoryFragment()
    }

    private lateinit var bannerAdapter: ItemBannerAdapter
    private lateinit var releaseAdapter: ItemReleaseAdapter
    private lateinit val titleAdapter: ItemTitleAdapter


    private val viewModel: RepertoryViewModel by viewModels()

    private val binding: FragmentRepertoryBinding

    private fun getData(){

        viewModel.getRepertory().observe(viewLifecycleOwner){


        }

    }

}