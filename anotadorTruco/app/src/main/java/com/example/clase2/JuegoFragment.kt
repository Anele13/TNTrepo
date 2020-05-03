package com.example.clase2

import android.content.ClipData
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.fragment_juego.view.*
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.clase2.databinding.FragmentJuegoBinding

class JuegoFragment : Fragment(),View.OnDragListener {

    private var _binding: FragmentJuegoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentJuegoBinding.inflate(inflater, container, false)
        var vista = binding.root
        vista.LinearLayout1.setOnDragListener(this)
        vista.LinearLayout2.setOnDragListener(this)
        vista.fosforo1.setOnTouchListener(MyTouchListener())
        vista.fosforo2.setOnTouchListener(MyTouchListener())
        vista.fosforo3.setOnTouchListener(MyTouchListener())
        vista.fosforo4.setOnTouchListener(MyTouchListener())
        vista.fosforo5.setOnTouchListener(MyTouchListener())
        vista.fosforo6.setOnTouchListener(MyTouchListener())
        vista.fosforo7.setOnTouchListener(MyTouchListener())
        return vista
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
    }

    private fun juegoTerminado(){
        val options = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }
        val equipoA = "Ellos"
        val equipoB = "Nosotros"
        val puntajeA = (binding.LinearLayout1.getChildAt(0) as TextView).getText().toString().filter { it.isDigit() }.toInt()
        val puntajeB = (binding.LinearLayout2.getChildAt(0) as TextView).getText().toString().filter { it.isDigit() }.toInt()
        val action =  JuegoFragmentDirections.actionJuegoFragmentToHistorialFragment(puntajeA,puntajeB,equipoA, equipoB)
        findNavController().navigate(action,options)
    }


    private fun incrementarPuntaje(v: View): Int {
        var puntaje = ((v as ConstraintLayout).getChildAt(0) as TextView).getText().toString().filter { it.isDigit() }.toInt()
        puntaje += 1
        var info = "Malas: "
        if (puntaje > 15){
            info = "Buenas: "
        }
        ((v as ConstraintLayout).getChildAt(0) as TextView).setText(info + puntaje.toString())
        return puntaje
    }


    private fun reiniciarCajas(v: View){
        val childCount: Int = (v as ConstraintLayout).childCount
        for (i in 0 until childCount) {
            val view = (v as ConstraintLayout).getChildAt(i)
            if (view is ImageView){
                view.dibujarFosforos(0)
            }
        }
    }


    override fun onDrag(v: View, event: DragEvent): Boolean {
        if (event.action === DragEvent.ACTION_DROP) {
            var puntaje = incrementarPuntaje(v)

            if (puntaje == 16){
                reiniciarCajas(v)
            }
            when (puntaje) {
                in (1..5).toList() + (16..20).toList()  -> ((v as ConstraintLayout).getChildAt(1) as ImageView).dibujarFosforos(puntaje)
                in (6..10).toList() + (21..25).toList() -> ((v as ConstraintLayout).getChildAt(2) as ImageView).dibujarFosforos(puntaje)
                in (11..15).toList() + (26..30).toList() -> ((v as ConstraintLayout).getChildAt(3) as ImageView).dibujarFosforos(puntaje)
            }
            if (puntaje == 30){
                juegoTerminado()
            }
        }
        return true
    }
}


//TODO: ver que se puede hacer con estos rangos
fun ImageView.dibujarFosforos(puntaje: Int) {
    when (puntaje) {
        0 -> this.setImageResource(R.drawable.ic_tantos_vacio)
        1,6,11,16,21,26 -> this.setImageResource(R.drawable.ic_tantos_1)
        2,7,12,17,22,27 -> this.setImageResource(R.drawable.ic_tantos_2)
        3,8,13,18,23,28 -> this.setImageResource(R.drawable.ic_tantos_3)
        4,9,14,19,24,29 -> this.setImageResource(R.drawable.ic_tantos_4)
        5,10,15,20,25,30 -> this.setImageResource(R.drawable.ic_tantos_5)
    }
}


private class MyTouchListener : View.OnTouchListener {
    override fun onTouch(view: View, motionEvent: MotionEvent): Boolean {
        return if (motionEvent.action == MotionEvent.ACTION_DOWN) {
            val data = ClipData.newPlainText("", "")
            val shadowBuilder = View.DragShadowBuilder(view)
            view.startDrag(data, shadowBuilder, view, 0)
            true
        } else {
            false
        }

    }
}

enum class Componentes(val value: Int) {
    TEXT_BOX_TITULO(0),
    TEXT_BOX_PUNTOS(1),
    IMAGE_VIEW_CAJA_1(2),
    IMAGE_VIEW_CAJA_2(3),
    IMAGE_VIEW_CAJA_3(4)
}
