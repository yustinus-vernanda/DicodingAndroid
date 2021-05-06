package com.dicoding.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class MoveWithDataActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_AGE = "extra age"
        const val  EXTRA_NAME = "extra name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)
        val tvDataReceived:TextView = findViewById(R.id.data_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE,0)

        val text = "Name : $name, \nYour Age:$age"
        tvDataReceived.text = text
    }
}