package com.example.clase2

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class PortadaFragmentDirections private constructor() {
  companion object {
    fun actionPortadaFragmentToJuegoFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_portadaFragment_to_juegoFragment)
  }
}
