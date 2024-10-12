package com.example.sherifomarsplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.airbnb.lottie.LottieAnimationView
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottieAnimationView = findViewById<LottieAnimationView>(R.id.lottie_animation)
        lottieAnimationView.playAnimation()

        // Delay for the duration of your splash screen (e.g., 3 seconds)
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the Flutter activity
            startActivity(
                FlutterActivity.createDefaultIntent(this)
            )
            finish()
        }, 3000) // 3000 milliseconds = 3 seconds
    }
}