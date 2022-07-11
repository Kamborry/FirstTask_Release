package com.tlugovaya.firsttask_release.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tlugovaya.firsttask_release.R
import com.tlugovaya.firsttask_release.databinding.FragmentMainPageBinding

class MainPageFragment : Fragment() {

    companion object {
        fun newInstance() = MainPageFragment()
    }

    private lateinit var viewModel: MainPageViewModel
    private lateinit var binding: FragmentMainPageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainPageBinding.inflate(layoutInflater)

        return inflater.inflate(R.layout.fragment_main_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonOpenRelease.setOnClickListener {
            showReleaseFragment()
        }

    }

    private fun showReleaseFragment(){
        parentFragmentManager.beginTransaction()
                .replace(R.id.container, ReleaseFragment.newInstance())
                .commitNow()
    }

//binding = ActivityContainerBinding.inflate(layoutInflater)
    //val view = binding.root

    //if (savedInstanceState == null) {
    //   supportFragmentManager.beginTransaction()
    //        .replace(R.id.container, MainPageFragment.newInstance())
    //        .commitNow()
    //}



    //val toolbar: Toolbar = findViewById(R.layout.toolbar_release)
    //setSupportActionBar(toolbar)
}