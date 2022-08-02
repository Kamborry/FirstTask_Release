package com.tlugovaya.firsttask_release.ui.repertory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tlugovaya.firsttask_release.R
import com.tlugovaya.firsttask_release.databinding.BannersListBinding
import com.tlugovaya.firsttask_release.databinding.FragmentRepertoryBinding
import com.tlugovaya.firsttask_release.model.getMockRepertory

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

        val content: MutableList<RepertoryItem> = mutableListOf()

        with(viewModel.repertory){
            if(banners.isNotEmpty()) {
                content += RepertoryItem.Banners(banners)
            }
            if(premiere.isNotEmpty()){
                content += RepertoryItem.Header(getString(R.string.title_premiere))
                content += RepertoryItem.Releases(premiere)
            }
            if(now.isNotEmpty()){
                content += RepertoryItem.Header(getString(R.string.title_now))
                content += RepertoryItem.Releases(now)
            }
            if(kids.isNotEmpty()){
                content += RepertoryItem.Header(getString(R.string.title_kids))
                content += RepertoryItem.Releases(kids)
            }
            if(soon.isNotEmpty()){
                content += RepertoryItem.Header(getString(R.string.title_soon))
                content += RepertoryItem.Releases(soon)
            }
        }

        adapter.items = content

        viewModel.getRepertory().observe(viewLifecycleOwner) {
            //val adapter = ItemBannerAdapter()
            //binding.listBanners.adapter = adapter
            //adapter.banners = viewModel.repertory.banners
        }
        return binding.root
    }


}


