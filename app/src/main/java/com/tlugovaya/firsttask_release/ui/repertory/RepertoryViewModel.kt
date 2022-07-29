package com.tlugovaya.firsttask_release.ui.repertory

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tlugovaya.firsttask_release.model.Repertory
import com.tlugovaya.firsttask_release.model.getMockRepertory

class RepertoryViewModel : ViewModel() {

    private val repertoryLiveData: MutableLiveData<Repertory> = MutableLiveData<Repertory>()

    fun getRepertory(): LiveData<Repertory> = repertoryLiveData

    val repertory = getMockRepertory()
}