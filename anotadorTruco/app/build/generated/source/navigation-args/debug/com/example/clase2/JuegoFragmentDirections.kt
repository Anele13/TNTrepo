package com.example.clase2

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

class JuegoFragmentDirections private constructor() {
  private data class ActionJuegoFragmentToHistorialFragment(
    val puntajeA: Int = 0,
    val puntajeB: Int = 0,
    val equipoA: String = "null",
    val equipoB: String = "null"
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_juegoFragment_to_historialFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("puntajeA", this.puntajeA)
      result.putInt("puntajeB", this.puntajeB)
      result.putString("equipoA", this.equipoA)
      result.putString("equipoB", this.equipoB)
      return result
    }
  }

  companion object {
    fun actionJuegoFragmentToHistorialFragment(
      puntajeA: Int = 0,
      puntajeB: Int = 0,
      equipoA: String = "null",
      equipoB: String = "null"
    ): NavDirections = ActionJuegoFragmentToHistorialFragment(puntajeA, puntajeB, equipoA, equipoB)
  }
}
