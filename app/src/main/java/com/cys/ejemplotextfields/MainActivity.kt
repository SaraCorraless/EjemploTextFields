package com.cys.ejemplotextfields

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var checkbox = findViewById<CheckBox>(R.id.checkBox)
        var buttom = findViewById<Button>(R.id.button)
        var textView = findViewById<TextView>(R.id.text)

        buttom.setOnClickListener {
            if (checkbox.isChecked){
                Toast.makeText(this, "is checked", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "not checked", Toast.LENGTH_LONG).show()

            }
        }
    }
}