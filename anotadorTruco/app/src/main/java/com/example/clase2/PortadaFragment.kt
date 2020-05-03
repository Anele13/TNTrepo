package com.example.clase2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.clase2.databinding.FragmentPortadaBinding

class PortadaFragment : Fragment() {
    private var _binding: FragmentPortadaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPortadaBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.startButton.setOnClickListener { startClicked() }
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
        findNavController().navigate(R.id.juegoFragment, null, options)
    }

}
