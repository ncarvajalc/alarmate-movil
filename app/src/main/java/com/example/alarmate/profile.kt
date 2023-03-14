package com.example.alarmate

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.alarmate.databinding.FragmentHomeBinding
import com.example.alarmate.databinding.FragmentProfileBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class profile : Fragment() {

    private var _binding: FragmentProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var dialog: MaterialAlertDialogBuilder

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        dialog = MaterialAlertDialogBuilder(this.context!!)
            .setTitle("Cerrar sesión")
            .setMessage("Al cerrar sesión no podrá hacer uso de los contactos de emergencia. ¿Desea continuar?")
            .setNegativeButton("Cancelar") { dialog, which ->
                // Respond to negative button press
            }
            .setPositiveButton("Sí") { dialog, which ->
                MainActivity.loggedIn = false
                var navController = findNavController()
                navController.navigate(R.id.navigation_notifications)
            }
        val root: View = binding.root

        with(binding) {
            cerrar.setOnClickListener {
                dialog.show()
            }
        }
        Log.d("Created", "Pressed")
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}