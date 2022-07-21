package com.tlugovaya.firsttask_release.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tlugovaya.firsttask_release.R
import com.tlugovaya.firsttask_release.databinding.FragmentMainPageBinding

class MainPageFragment : Fragment() {

    companion object {
        fun newInstance() = MainPageFragment()
    }

    private var binding: FragmentMainPageBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.buttonOpenRelease?.setOnClickListener {
            showReleaseFragment()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun showReleaseFragment() {
        parentFragmentManager.beginTransaction()
            .add(R.id.activity_container, ReleaseFragment.newInstance())
            .commitNow()
    }
}