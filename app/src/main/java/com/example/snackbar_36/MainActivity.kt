package com.example.snackbar_36

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1.setOnClickListener {

            Snackbar.make(linearLayout, "This is a SnackBar Message", Snackbar.LENGTH_LONG).show()
        }

        button_2.setOnClickListener {

            Snackbar.make(linearLayout, "SnackBar - showing a Toast message", Snackbar.LENGTH_LONG)
                .setAction("Show Now"){
                    Toast.makeText(applicationContext, "An Action Showing!", Toast.LENGTH_LONG).show()
                    linearLayout.setBackgroundColor(Color.parseColor("#FFEB3B"))
                }.show()
        }

        button_3.setOnClickListener {

            val snackBar = Snackbar.make(linearLayout, "This is a SnackBar", Snackbar.LENGTH_LONG)
                .setAction("Next"){
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                }
            snackBar.dismiss()
            snackBar.show()
        }
    }
}