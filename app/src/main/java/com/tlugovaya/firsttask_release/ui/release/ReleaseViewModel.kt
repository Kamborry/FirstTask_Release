package com.tlugovaya.firsttask_release.ui.release

import androidx.lifecycle.ViewModel
import com.tlugovaya.firsttask_release.model.getMockRelease

class ReleaseViewModel : ViewModel() {

    val release = getMockRelease()

}