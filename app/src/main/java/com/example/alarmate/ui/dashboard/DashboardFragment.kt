package com.example.alarmate.ui.dashboard

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.alarmate.MainActivity.Companion.emergencyContact
import com.example.alarmate.databinding.FragmentDashboardBinding
import com.example.alarmate.MainActivity.Companion.loggedIn
import com.example.alarmate.R

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onResume() {
        super.onResume()
        var navController = findNavController()
        if (loggedIn) {
            navController.navigate(R.id.emergencyContacts)
        } else if (emergencyContact) {
            navController.navigate(R.id.emergencyContactsAdded)
        }
    }
}