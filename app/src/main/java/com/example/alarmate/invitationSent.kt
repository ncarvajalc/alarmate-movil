package com.example.alarmate

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alarmate.databinding.FragmentInvitationSentBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class invitationSent : Fragment() {

    private var _binding: FragmentInvitationSentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var dialog: MaterialAlertDialogBuilder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val handler = Handler()
        handler.postDelayed(Runnable {
            var navController = findNavController()
            navController.navigate(R.id.emergencyContactAccepted)
        }, 3000)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentInvitationSentBinding.inflate(inflater, container, false)

        val root: View = binding.root

        return root
    }



}