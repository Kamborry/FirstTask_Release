package com.tlugovaya.firsttask_release.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tlugovaya.firsttask_release.R

class MainPageFragment : Fragment() {

    companion object {
        fun newInstance() = MainPageFragment()
    }

    private lateinit var viewModel: MainPageViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main_page, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainPageViewModel::class.java)
        // TODO: Use the ViewModel
    }
//binding = ActivityContainerBinding.inflate(layoutInflater)
    //val view = binding.root

    //setContentView(view)
    //if (savedInstanceState == null) {
    //   supportFragmentManager.beginTransaction()
    //        .replace(R.id.container, MainPageFragment.newInstance())
    //        .commitNow()
    //}

    //binding.buttonOpenRelease.setOnClickListener {
    //    showReleaseFragment()
    //}

    //val toolbar: Toolbar = findViewById(R.layout.toolbar_release)
    //setSupportActionBar(toolbar)
}