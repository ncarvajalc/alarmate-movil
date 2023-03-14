package com.example.alarmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.alarmate.databinding.ActivityAddAlarmBinding
import com.example.alarmate.databinding.ActivityMainBinding

class AddAlarm : AppCompatActivity() {
    private lateinit var binding: ActivityAddAlarmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddAlarmBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val root: View = binding.root

        with(binding) {
            alarmasPreviasBtn.setOnClickListener {
                Log.d("Pressed alarmasPrevias", "Pressed")
                val intent = Intent(applicationContext, PreviousAlarms::class.java)
                startActivity(intent)
            }
            cancelBtnAddAlarm.setOnClickListener {
                finish()
            }
            addButtonAddAlarm.setOnClickListener {
                MainActivity.alarmAdded = true
                finish()
            }
        }

    }
}