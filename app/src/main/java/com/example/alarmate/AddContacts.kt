package com.example.alarmate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.alarmate.databinding.ActivityAddAlarmBinding
import com.example.alarmate.databinding.ActivityAddContactsBinding

class AddContacts : AppCompatActivity() {

    private lateinit var binding: ActivityAddContactsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val root: View = binding.root

        with(binding) {
            cancelBtnAddContact.setOnClickListener {
                finish()
            }

            contactos.setOnClickListener {
                MainActivity.emergencyContact = true
                finish()
            }
        }
    }
}