package com.example.alarmate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.alarmate.databinding.FragmentEmergencyContactsAddedBinding
import com.example.alarmate.databinding.FragmentProfileBinding
import com.example.alarmate.databinding.FragmentSuenaAlarmaBinding

class SuenaAlarmaFragment : Fragment() {
    private var _binding: FragmentSuenaAlarmaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSuenaAlarmaBinding.inflate(inflater, container, false)
        val root: View = binding.root
        with(binding) {
           detenerAlarma.setOnClickListener {
               var navController = findNavController()
               navController.navigate(R.id.alarmStoped)
           }
        }

        return root
    }

}