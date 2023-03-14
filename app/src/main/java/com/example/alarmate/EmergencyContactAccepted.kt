package com.example.alarmate

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.alarmate.databinding.FragmentEmergencyContactAcceptedBinding
import com.example.alarmate.databinding.FragmentProfileBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class EmergencyContactAccepted : Fragment() {

    private var _binding: FragmentEmergencyContactAcceptedBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var dialog: MaterialAlertDialogBuilder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentEmergencyContactAcceptedBinding.inflate(inflater, container, false)

        dialog = MaterialAlertDialogBuilder(this.context!!)
            .setTitle("Eliminar contacto de emergencia")
            .setMessage("¿Seguro que quieres eliminar tu contacto de emergencia? Se le notificará a tu contacto que ya no lo deseas. Deberás volver a enviar una solicitud si deseas que vuelva a ser tu contacto de emergencia")
            .setNegativeButton("Cancelar") { dialog, which ->
                // Respond to negative button press
            }
            .setPositiveButton("Eliminar") { dialog, which ->
                MainActivity.emergencyContact = false
                var navController = findNavController()
                navController.navigate(R.id.navigation_home)
            }
        val root: View = binding.root

        with(binding) {
            deleteEmergencyContactBtn.setOnClickListener {
                dialog.show()
            }
        }
        Log.d("Created", "Pressed")
        return root
    }

}