package com.example.alarmate.ui.notifications

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alarmate.R
import com.example.alarmate.RegisterActivity
import com.example.alarmate.databinding.FragmentNotificationsBinding
import com.example.alarmate.MainActivity.Companion.loggedIn

class NotificationsFragment : Fragment() {


    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        with(binding) {
            registrate.setOnClickListener {
                val intent = Intent(context, RegisterActivity::class.java)
                startActivity(intent)
            }

            ingresar.setOnClickListener {
                loggedIn= true
                var navController = findNavController()
                navController.navigate(R.id.navigation_profile)
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}