package com.tlugovaya.firsttask_release.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.jakewharton.threetenabp.AndroidThreeTen
import com.tlugovaya.firsttask_release.R
import com.tlugovaya.firsttask_release.databinding.FragmentMainPageBinding
import com.tlugovaya.firsttask_release.databinding.FragmentReleaseBinding
import org.threeten.bp.format.DateTimeFormatter

class ReleaseFragment : Fragment() {

    companion object {
        fun newInstance() = ReleaseFragment()
    }

    private val viewModel: ReleaseViewModel by viewModels()
    private lateinit var binding: FragmentReleaseBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Инициализируем биндинг.
        binding = FragmentReleaseBinding.inflate(inflater, container, false)
        //Заполняем данными ViewModel.
        viewModel.fillingWithDataFromMock(binding)
        return binding.root
    }


}