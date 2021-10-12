package io.kraftsman.app.kmmkungfu.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.kraftsman.app.kmmkungfu.Detector
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = Detector().detect()
    }
}
