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
    }
}

