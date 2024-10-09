package com.example.uts1mobileradit

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.uts1mobileradit.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        val name = intent.getStringExtra("Name") ?: "No Name"
        binding.txtName.text = name

        with(binding){
            btnExit.setOnClickListener{
                    val intentToThirdActivity =
                        Intent(this@SecondActivity, ThirdActivity::class.java)
                    startActivity(intentToThirdActivity)
                    Toast.makeText(this@SecondActivity, "You have successfully logged out", Toast.LENGTH_SHORT).show()
            }
        }

    }
}