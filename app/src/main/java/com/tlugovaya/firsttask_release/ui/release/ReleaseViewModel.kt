package com.tlugovaya.firsttask_release.ui.release

import androidx.lifecycle.ViewModel
import com.tlugovaya.firsttask_release.model.getRelease

class ReleaseViewModel(releaseId: String) : ViewModel() {

    val release = getRelease(releaseId)

}