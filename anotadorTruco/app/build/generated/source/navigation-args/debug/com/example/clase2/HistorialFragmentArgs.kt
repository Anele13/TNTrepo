package com.example.clase2

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

data class HistorialFragmentArgs(
  val puntajeA: Int = 0,
  val puntajeB: Int = 0,
  val equipoA: String = "null",
  val equipoB: String = "null"
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("puntajeA", this.puntajeA)
    result.putInt("puntajeB", this.puntajeB)
    result.putString("equipoA", this.equipoA)
    result.putString("equipoB", this.equipoB)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): HistorialFragmentArgs {
      bundle.setClassLoader(HistorialFragmentArgs::class.java.classLoader)
      val __puntajeA : Int
      if (bundle.containsKey("puntajeA")) {
        __puntajeA = bundle.getInt("puntajeA")
      } else {
        __puntajeA = 0
      }
      val __puntajeB : Int
      if (bundle.containsKey("puntajeB")) {
        __puntajeB = bundle.getInt("puntajeB")
      } else {
        __puntajeB = 0
      }
      val __equipoA : String?
      if (bundle.containsKey("equipoA")) {
        __equipoA = bundle.getString("equipoA")
        if (__equipoA == null) {
          throw IllegalArgumentException("Argument \"equipoA\" is marked as non-null but was passed a null value.")
        }
      } else {
        __equipoA = "null"
      }
      val __equipoB : String?
      if (bundle.containsKey("equipoB")) {
        __equipoB = bundle.getString("equipoB")
        if (__equipoB == null) {
          throw IllegalArgumentException("Argument \"equipoB\" is marked as non-null but was passed a null value.")
        }
      } else {
        __equipoB = "null"
      }
      return HistorialFragmentArgs(__puntajeA, __puntajeB, __equipoA, __equipoB)
    }
  }
}
