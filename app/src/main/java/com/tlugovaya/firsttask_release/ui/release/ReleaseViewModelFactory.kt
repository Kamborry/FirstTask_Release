package com.tlugovaya.firsttask_release.ui.release

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

open class ReleaseViewModelFactory(val releaseId: String) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ReleaseViewModel(
            releaseId
        ) as T
    }
}
