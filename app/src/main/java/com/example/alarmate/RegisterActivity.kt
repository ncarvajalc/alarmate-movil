package com.example.alarmate

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alarmate.databinding.ActivityRegisterBinding
import com.example.alarmate.MainActivity.Companion.loggedIn

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sharedPref = this.getSharedPreferences(
            getString(R.string.isLoggedin), Context.MODE_PRIVATE)

        with(binding) {
            inicia.setOnClickListener {
                finish()
            }

            buttonIngresar.setOnClickListener {
                loggedIn = true
                finish()
            }

        }
    }

}