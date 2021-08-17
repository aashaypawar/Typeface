package org.geeksforgeeks.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTextView = findViewById<TextView>(R.id.text_view)
        val font = Typeface.createFromAsset(assets, "JellyBomb.ttf")

        mTextView.typeface = font
//https://www.dafont.com/jelly-bomb.font
    }
}