package com.example.cardwiew2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView

class CustomAdapter(private val lista: List<DataClass>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titulo: TextView = view.findViewById(R.id.textView1)
        val subtitulo: TextView = view.findViewById(R.id.textView2)
        val lottie: LottieAnimationView = view.findViewById(R.id.animationView1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // AQUÍ: Asegúrate de que diga R.layout.item_card
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = lista[position]
        holder.titulo.text = item.titulo
        holder.subtitulo.text = item.subtitulo
        holder.lottie.setAnimation(item.imagenAnimada)
    }

    override fun getItemCount() = lista.size
}