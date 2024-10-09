package com.example.uts1mobileradit

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.uts1mobileradit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            btnSubmit.setOnClickListener{
                val inputname = iptName.text.toString()

                if(inputname.isNotEmpty()) {
                    val intentToSecondActivity =
                        Intent(this@MainActivity, SecondActivity::class.java)
                    intentToSecondActivity.putExtra("Name", inputname)
                    startActivity(intentToSecondActivity)
                }else
                    Toast.makeText(this@MainActivity, "Enter your name first", Toast.LENGTH_SHORT).show()
            }
        }

    }
}