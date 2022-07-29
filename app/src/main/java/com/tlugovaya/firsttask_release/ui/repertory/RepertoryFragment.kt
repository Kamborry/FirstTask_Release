package com.tlugovaya.firsttask_release.ui.repertory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.tlugovaya.firsttask_release.databinding.BannersListBinding
import com.tlugovaya.firsttask_release.databinding.ReleaseListBinding

class RepertoryFragment : Fragment() {

    companion object {
        fun newInstance() = RepertoryFragment()
    }

    private lateinit var bannerAdapter: ItemBannerAdapter
    private lateinit var releaseAdapter: ItemReleaseAdapter

    private lateinit var bindingRelease: ReleaseListBinding
    private lateinit var bindingBanners: BannersListBinding

    private val viewModel: RepertoryViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingRelease = ReleaseListBinding.inflate(inflater, container, false)

        viewModel.getRepertory().observe(viewLifecycleOwner) {
            //bannerAdapter.submitList(it)
            //releaseAdapter.submitList(it)
        }

        initReleaseRecyclerView()
        initBannerRecyclerView()

        return bindingRelease.root
    }

    private fun initReleaseRecyclerView() {
        releaseAdapter = ItemReleaseAdapter()
        val recyclerView = bindingRelease.listRelease
        recyclerView.apply {
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            adapter = releaseAdapter
        }
    }

    private fun initBannerRecyclerView() {
       bannerAdapter = ItemBannerAdapter()
        val recyclerView = bindingBanners.listBanners
        recyclerView.apply {
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            adapter = bannerAdapter
        }
    }
}