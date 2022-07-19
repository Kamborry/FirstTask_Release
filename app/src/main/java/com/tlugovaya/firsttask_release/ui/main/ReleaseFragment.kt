package com.tlugovaya.firsttask_release.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tlugovaya.firsttask_release.databinding.FragmentReleaseBinding

class ReleaseFragment : Fragment() {

    companion object {
        fun newInstance() = ReleaseFragment()
    }

    private val viewModel: ReleaseViewModel by viewModels()
    private lateinit var binding: FragmentReleaseBinding
    private val release = getMockRelease()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Инициализируем биндинг.
        binding = FragmentReleaseBinding.inflate(inflater, container, false)
        //Заполняем данными ViewModel.
        viewModel.fillingWithDataFromMock(binding, release)

        with(PicassoModule()){
            downloadImageForPreview(binding, release)
            downloadImageForPoster(binding, release)
        }

        return binding.root
    }


}