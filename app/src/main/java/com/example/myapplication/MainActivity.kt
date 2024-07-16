package com.example.myapplication

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import android.view.SurfaceView
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    private lateinit var surfaceView: SurfaceView
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        surfaceView = findViewById(R.id.surfaceView)
        progressBar = findViewById(R.id.progressBar)

        // Simulate loading process
        showLoading(true)

        // Assuming some background task to simulate loading
        Handler(Looper.getMainLooper()).postDelayed({
            // Hide progress bar after loading is complete
            showLoading(false)
        }, 3000) // Simulate a 3-second loading time
    }

    private fun showLoading(isLoading: Boolean) {
        if (isLoading) {
            progressBar.visibility = ProgressBar.VISIBLE
            surfaceView.visibility = SurfaceView.INVISIBLE
        } else {
            progressBar.visibility = ProgressBar.GONE
            surfaceView.visibility = SurfaceView.VISIBLE
        }
    }
}