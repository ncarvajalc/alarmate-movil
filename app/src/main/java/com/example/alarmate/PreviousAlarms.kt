package com.example.alarmate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alarmate.databinding.ActivityAddAlarmBinding
import com.example.alarmate.databinding.ActivityPreviousAlarmsBinding

class PreviousAlarms : AppCompatActivity() {

    private lateinit var binding: ActivityPreviousAlarmsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviousAlarmsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            addBtnPrevias.setOnClickListener {
                finish()
            }
            cancelBtnPrevias.setOnClickListener {
                finish()
            }
        }

    }
}