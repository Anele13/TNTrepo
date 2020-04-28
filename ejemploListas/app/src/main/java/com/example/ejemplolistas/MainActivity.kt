package com.example.ejemplolistas

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.animal_list_item.view.*

class MainActivity : AppCompatActivity(),OnItemClickListener  {
    val animales: ArrayList<Animal> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animales.add(Animal("Perro"))
        animales.add(Animal("Gato"))
        animales.add(Animal("Buho"))
        animales.add(Animal("Chita"))
        animales.add(Animal("Pajaro"))
        animales.add(Animal("Serpiente"))
        animales.add(Animal("Hamster"))
        animales.add(Animal("Leon"))
        animales.add(Animal("Tigre"))
        animales.add(Animal("Caballo"))
        rv_animal_list.layoutManager = LinearLayoutManager(this)
        rv_animal_list.adapter = AnimalAdapter(animales, this)

    }

    override fun onItemClicked(animal: Animal) {
        Toast.makeText(this,"Clickeaste un: "+animal.nombre,Toast.LENGTH_LONG).show()
    }
}


class AnimalAdapter(val animales : ArrayList<Animal>, val itemClickListener: OnItemClickListener) : RecyclerView.Adapter<ViewHolder>() {
    
    override fun getItemCount(): Int {
        return animales.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.animal_list_item, parent, false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(animales.get(position),itemClickListener)
    }
}


class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val textViewTipoAnimal= view.tipo_animal

    fun bind(animal: Animal, clickListener: OnItemClickListener) {
        textViewTipoAnimal.text = animal.nombre
        itemView.setOnClickListener {
            clickListener.onItemClicked(animal)
        }
    }
}

interface OnItemClickListener {
    fun onItemClicked(animal: Animal) {
    }
}

data class Animal(var nombre:String)