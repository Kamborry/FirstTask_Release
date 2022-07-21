package com.tlugovaya.firsttask_release

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tlugovaya.firsttask_release.ui.main.MainPageFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.activity_container, MainPageFragment.newInstance())
                .commitNow()
        }
    }
}