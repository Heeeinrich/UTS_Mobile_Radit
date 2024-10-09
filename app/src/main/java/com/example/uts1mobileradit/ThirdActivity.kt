package com.example.uts1mobileradit

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.uts1mobileradit.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private val binding by lazy { ActivityThirdBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            btnLogin.setOnClickListener{
                val inputusername = iptUsername.text.toString()
                val inputpassword = iptPassword.text.toString()

                if(inputusername.isNotEmpty() && inputpassword.isNotEmpty()) {
                    Toast.makeText(this@ThirdActivity, "You Have succsessfully logged in", Toast.LENGTH_SHORT).show()
                }else
                    android.widget.Toast.makeText(this@ThirdActivity, "Enter your Data First", android.widget.Toast.LENGTH_SHORT).show()
            }
        }
    }
}