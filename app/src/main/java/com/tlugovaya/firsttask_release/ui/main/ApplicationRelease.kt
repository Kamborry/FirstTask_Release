package com.tlugovaya.firsttask_release.ui.main

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen

class ApplicationRelease : Application() {

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }

}