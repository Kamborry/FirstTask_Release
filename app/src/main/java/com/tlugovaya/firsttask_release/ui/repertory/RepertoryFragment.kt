package com.tlugovaya.firsttask_release.ui.repertory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tlugovaya.firsttask_release.databinding.BannersListBinding
import com.tlugovaya.firsttask_release.model.getMockRepertory

class RepertoryFragment : Fragment() {

    companion object {
        fun newInstance() = RepertoryFragment()
    }

    private lateinit var binding: BannersListBinding

    private val viewModel: RepertoryViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BannersListBinding.inflate(inflater, container, false)
        val adapter = ItemBannerAdapter()
        binding.listBanners.adapter = adapter
        adapter.banners = getMockRepertory().banners

//        viewModel.getRepertory().observe(viewLifecycleOwner) {
//
//        }
        return binding.root
    }


}

//    private fun setupRecyclerView() {
//        binding.rvOrderLines.apply {
//            layoutManager = LinearLayoutManager(activity)
//            adapter = orderLinesAdapter
//            setHasFixedSize(true)
//            addItemDecoration(DividerItemDecoration(activity, LinearLayoutManager.VERTICAL))
//        }
//    }

