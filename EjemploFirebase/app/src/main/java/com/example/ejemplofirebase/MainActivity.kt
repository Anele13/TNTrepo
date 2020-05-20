package com.example.ejemplofirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.ejemplofirebase.databinding.ActivityMainBinding
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    @IgnoreExtraProperties
    data class User(
        var nombre: String? = ""
    )


    private lateinit var vista: ActivityMainBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vista = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vista.root)
        /*
        database = FirebaseDatabase.getInstance().getReference()
        database.child("usuarios").addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                println("hubo un errro")
            }

            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get Post object and use the values to update the UI
                val usuario = dataSnapshot.getValue(User::class.java)
                vista.idTexto.setText(usuario!!.nombre)
            }
        })
        */
    }
}


