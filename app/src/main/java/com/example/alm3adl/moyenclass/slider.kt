package com.example.alm3adl.moyenclass

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alm3adl.R
import kotlinx.android.synthetic.main.slider.*


class slider : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.slider)

        val max = 99
        val min = 1
        val total = max - min
        val slider = slider

        slider.positionListener = { pos -> slider.bubbleText = "${min + (total * pos).toInt()}" }


        slider.position = 0.5f
        slider.startText = "$min"
        slider.endText = "$max"

     start.setOnClickListener {
         val intent=Intent(this, Section_rate::class.java)
         intent.putExtra("namberstudent", slider.bubbleText!!.toInt())
          startActivity(intent)
     }
            }
    }




