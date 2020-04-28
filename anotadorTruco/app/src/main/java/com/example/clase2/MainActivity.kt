package com.example.clase2

import android.app.Dialog
import android.content.ClipData
import android.content.DialogInterface
import android.os.Bundle
import android.view.DragEvent
import android.view.MotionEvent
import android.view.View
import android.view.View.DragShadowBuilder
import android.view.View.OnTouchListener
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.DialogFragment
import com.example.clase2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var vista: ActivityMainBinding
    //private var puntaje: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vista = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vista.root)
        vista.LinearLayout1.setOnDragListener(MyDragListener())
        vista.LinearLayout2.setOnDragListener(MyDragListener())
        crearManojoFosforos()
    }

    private fun crearManojoFosforos() {
        vista.fosforo1.setOnTouchListener(MyTouchListener())
        vista.fosforo2.setOnTouchListener(MyTouchListener())
        vista.fosforo3.setOnTouchListener(MyTouchListener())
        vista.fosforo4.setOnTouchListener(MyTouchListener())
        vista.fosforo5.setOnTouchListener(MyTouchListener())
        vista.fosforo6.setOnTouchListener(MyTouchListener())
        vista.fosforo7.setOnTouchListener(MyTouchListener())
    }
}


fun ImageView.dibujarFosforos(puntaje: Int) {
    when (puntaje) {
        0 -> this.setImageResource(R.drawable.ic_tantos_vacio)
        1,6,11 -> this.setImageResource(R.drawable.ic_tantos_1)
        2,7,12 -> this.setImageResource(R.drawable.ic_tantos_2)
        3,8,13 -> this.setImageResource(R.drawable.ic_tantos_3)
        4,9,14 -> this.setImageResource(R.drawable.ic_tantos_4)
        5,10,15 -> this.setImageResource(R.drawable.ic_tantos_5)
    }
}


private class MyTouchListener : OnTouchListener {
    override fun onTouch(view: View, motionEvent: MotionEvent ): Boolean {
        return if (motionEvent.action == MotionEvent.ACTION_DOWN) {
            val data = ClipData.newPlainText("", "")
            val shadowBuilder = DragShadowBuilder(view)
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


private class MyDragListener: View.OnDragListener{

    var puntaje: Int = 0
    var buenas: Boolean = false
    var info: String = "Malas: "


    private fun incrementarPuntaje(v: View) {
        puntaje = puntaje +1
        if (puntaje > 15){
            info = "Buenas: "
            buenas = true
            puntaje = 1
        }
        ((v as ConstraintLayout).getChildAt(1) as TextView).setText(info + puntaje.toString())
    }



    private fun gane(v: View) {
        info = "Malas: "
        buenas = false
        puntaje = 0
        var dialog = FinDeJuegoDialogFragment()
        //dialog.set
        dialog.show((v.context as MainActivity).supportFragmentManager, null)
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
            incrementarPuntaje(v)
            if (buenas && puntaje == 1){
                reiniciarCajas(v)
            }
            when (puntaje) {
                in 1..5 -> ((v as ConstraintLayout).getChildAt(2) as ImageView).dibujarFosforos(puntaje)
                in 6..10 -> ((v as ConstraintLayout).getChildAt(3) as ImageView).dibujarFosforos(puntaje)
                in 11..15 -> ((v as ConstraintLayout).getChildAt(4) as ImageView).dibujarFosforos(puntaje)
            }
            if (buenas && puntaje == 15){
                gane(v)
            }
        }
        return true
    }
}



class FinDeJuegoDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage("Fin del Juego")
                .setPositiveButton("No, gracias", DialogInterface.OnClickListener { dialog, id -> })
                .setNegativeButton("Jugar de nuevo", DialogInterface.OnClickListener { dialog, id -> })
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}

