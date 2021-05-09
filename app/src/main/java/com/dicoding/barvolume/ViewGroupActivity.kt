package com.dicoding.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ViewGroupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_group)
        supportActionBar?.title="Google Pixel"
    }
}