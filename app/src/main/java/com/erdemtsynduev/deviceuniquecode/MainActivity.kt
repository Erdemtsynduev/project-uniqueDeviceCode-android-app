package com.erdemtsynduev.deviceuniquecode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView : TextView = findViewById(R.id.text_data)
        // Get unique pseudo id device
        textView.text = DeviceUtils.uniquePseudoID
    }
}