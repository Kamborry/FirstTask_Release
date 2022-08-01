package com.tlugovaya.firsttask_release.ui.repertory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
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
        val adapter = ItemReleaseAdapter()
        binding.repertoryContentList.adapter = adapter
        adapter.releases = getMockRepertory().premiere

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

