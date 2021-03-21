package com.bangkit.alzahid.Fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bangkit.alzahid.R

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val mFragmentManager = supportFragmentManager
        val mOneFragment = OneFragment()
        val fragment = mFragmentManager.findFragmentByTag(OneFragment::class.java.simpleName)
        if (fragment !is OneFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name :" + OneFragment::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, mOneFragment, OneFragment::class.java.simpleName)
                .commit()
        }
    }
}