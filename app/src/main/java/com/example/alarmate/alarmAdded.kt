package com.example.alarmate

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.alarmate.databinding.FragmentAlarmAddedBinding
import com.example.alarmate.databinding.FragmentProfileBinding


class alarmAdded : Fragment() {

    private var _binding: FragmentAlarmAddedBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentAlarmAddedBinding.inflate(inflater, container, false)
        val root: View = binding.root
        with(binding) {
            addEmergencyContactBtn.setOnClickListener {
                val intent = Intent(context, AddContacts::class.java)
                startActivity(intent)
            }
        }

        return root
    }

    override fun onResume() {
        super.onResume()
        var navController = findNavController()
        if (MainActivity.emergencyContact) {
            navController.navigate(R.id.invitationSent)
        }
    }

}