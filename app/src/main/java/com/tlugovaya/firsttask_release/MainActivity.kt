package com.tlugovaya.firsttask_release

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tlugovaya.firsttask_release.ui.repertory.RepertoryFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.activity_container, RepertoryFragment.newInstance())
                .commitNow()
        }
    }
}