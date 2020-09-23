package com.Hal.rolldice

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import kotlinx.android.synthetic.main.activity_main.*
import android.view.animation.Animation
import android.view.animation.AnimationUtils


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun vibrate(){

            val vibrator = baseContext.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(VibrationEffect.createOneShot(40, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                vibrator.vibrate(200)
            }
        }


        BuRollDice.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            BuRollDice.startAnimation(animation)
                           val kocka1= (1..6)
            val rolling = kocka1.random()
            rollSpace.text= "$rolling"
            vibrate()

            }







        }


    }

