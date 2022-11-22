package com.naveen.simpledatabinding

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.naveen.simpledatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



        binding.buttonSubmit.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting(){
       binding.apply {
           binding.textViewName.text = "Hello " + binding.editTextName.text
       }
    }
}