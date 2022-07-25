package com.tlugovaya.firsttask_release.ui.repertory

import androidx.lifecycle.ViewModel
import com.tlugovaya.firsttask_release.model.getMockRepertory

class RepertoryViewModel : ViewModel() {

    val repertory = getMockRepertory()
}