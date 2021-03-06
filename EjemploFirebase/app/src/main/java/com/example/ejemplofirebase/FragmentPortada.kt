package com.example.ejemplofirebase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.ejemplofirebase.databinding.FragmentPortadaBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Ususario(
    var nombre: String? = "",
    var email: String = ""
)

class FragmentPortada : Fragment() {

    private var _binding: FragmentPortadaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPortadaBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.btnIniciar.setOnClickListener { startClicked() }
        return view
    }

    private fun startClicked() {
        val options = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }
        var user: FirebaseUser? = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            var username = user.uid
            val action =  FragmentPortadaDirections.actionFragmentPortadaToFragmentInicio(username!!)
            findNavController().navigate(action,options)
        } else {
            findNavController().navigate(R.id.fragmentLogin,null,options)
        }
    }

}
