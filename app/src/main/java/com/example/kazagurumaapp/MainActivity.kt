package com.example.kazagurumaapp

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var imageView: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.CrossView)
        val buttonFadeOut = findViewById<Button>(R.id.button)
        buttonFadeOut.setOnClickListener { view: View? -> startRotation() }
    }

    private fun startRotation() {

        // RotateAnimation(float fromDegrees, float toDegrees, int pivotXType, float pivotXValue, int pivotYType,float pivotYValue)
        val rotate = RotateAnimation(
            0.0f, 360.0f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )

        // animation時間 msec
        rotate.duration = 3000
        // 繰り返し回数
        rotate.repeatCount = 1
        // animationが終わったそのまま表示にする
        rotate.fillAfter = true

        //アニメーションの開始
        imageView!!.startAnimation(rotate)
    }
}