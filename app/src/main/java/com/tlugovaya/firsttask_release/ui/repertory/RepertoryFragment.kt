package com.tlugovaya.firsttask_release.ui.repertory

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class RepertoryFragment : Fragment() {

    companion object {
        fun newInstance() = RepertoryFragment()
    }

    private val viewModel: RepertoryViewModel by viewModels()

}