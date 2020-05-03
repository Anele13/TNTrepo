package com.example.clase2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clase2.databinding.FragmentHistorialBinding
import kotlinx.android.synthetic.main.fragment_historial.*
import kotlinx.android.synthetic.main.resultado_list_item.view.*


class HistorialFragment : Fragment() {
    private var _binding: FragmentHistorialBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHistorialBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val lista_resultado: ArrayList<Resultado> = ArrayList()
        val safeArgs: HistorialFragmentArgs by navArgs()
        lista_resultado.add(Resultado(safeArgs.equipoA.toString(),safeArgs.equipoB.toString(),safeArgs.puntajeA, safeArgs.puntajeB)) //TODO: hacer un historial como la gente
        rv_resultado_list.layoutManager = LinearLayoutManager(this.context)
        rv_resultado_list.adapter = ResultadoAdapter(lista_resultado)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}




class ResultadoAdapter(val resultado: ArrayList<Resultado>) : RecyclerView.Adapter<ViewHolder>() {

    override fun getItemCount(): Int {
        return resultado.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.resultado_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(resultado.get(position))
    }
}




class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val r= view.tipo_resultado
    fun bind(resultado: Resultado) {
        r.text = resultado.equipoA + ": " + resultado.puntajeA +" - "+ resultado.equipoB+ ": " + resultado.puntajeB
    }
}


data class Resultado(var equipoA:String, var equipoB: String, var puntajeA: Int, var puntajeB: Int)