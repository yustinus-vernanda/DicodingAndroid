package com.dicoding.barvolume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MenuActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnMoveActivity : Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)
        val btnMoveWithDataActivity : Button = findViewById(R.id.btn_move_with_data)
        btnMoveWithDataActivity.setOnClickListener(this)
        val btnDialNumber : Button = findViewById(R.id.btn_dial_number)
        btnDialNumber.setOnClickListener(this)
        val btnVolumeActivity : Button = findViewById(R.id.btn_volume_activity)
        btnVolumeActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when(v?.id){
            R.id.btn_move_activity->{
                val moveIntent = Intent(this@MenuActivity,MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_with_data->{
                val moveWithDataIntent = Intent(this@MenuActivity,MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Dicoding Academy Boy")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE,5)
                startActivity(moveWithDataIntent)
            }
            R.id.btn_dial_number->{
                val phoneNumber = "08991005242"
                val dialPhoneIntent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
            R.id.btn_volume_activity->{
                val moveActivity = Intent(this@MenuActivity,VolumeActivity::class.java)
                startActivity(moveActivity)
            }
        }
    }
}