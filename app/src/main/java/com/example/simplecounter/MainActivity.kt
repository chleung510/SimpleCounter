package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val upgradeBtn = findViewById<Button>(R.id.upgradeBtn)
        val counter_tv = findViewById<TextView>(R.id.counter_tv)

        var counter=0

        addBtn.setOnClickListener {
            // Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++
            counter_tv.text = counter.toString()

            if (counter>=100){

                // Makes upgrade btn visible
                upgradeBtn.visibility = View.VISIBLE

                // For detecting if upgrade btn is pressed, if pressed, then...
                upgradeBtn.setOnClickListener{
                    addBtn.text = "ADD 2"

                    // Update original button to add 2 instead of `
                    addBtn.setOnClickListener {
                        counter += 2
                        counter_tv.text = counter.toString()
                    }

                    // Makes upgrade btn invisible again
                    upgradeBtn.visibility = View.INVISIBLE
                }
            }
        }


    }
}