package com.example.clase2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.clase2.databinding.FragmentJuegoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [JuegoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class JuegoFragment : Fragment() {
    private var _binding: FragmentJuegoBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentJuegoBinding.inflate(inflater, container, false)
        val view = binding.root
        //binding.startButton.setOnClickListener { startClicked() }
        return view
    }

    private fun startClicked() {
        Log.i("JuegoFragment", "Click en el boton")

        // TODO #6.2: Agregar animacio|nes
        // solicitamos la clase especial NavController.
        // Podemos pasar un destino o una acción.
        val options = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }
        findNavController().navigate(R.id.juegoFragment, null, options)
        /*
        * public void navigate (int resId,
            Bundle args,
            NavOptions navOptions,
            Navigator.Extras navigatorExtras)
        *
        * https://developer.android.com/reference/androidx/navigation/NavController?hl=es-419#navigate(androidx.navigation.NavDirections)
        * */
    }
}
