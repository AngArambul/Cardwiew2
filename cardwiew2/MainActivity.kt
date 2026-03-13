package com.example.cardwiew2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Vincular el RecyclerView del XML
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // 2. Definir que la lista sea vertical (LinearLayoutManager)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // 3. Crear la fuente de datos (puedes añadir los que gustes)
        val listaDeItems = listOf(
            DataClass("Proyecto Android", "Desarrollo con Kotlin", R.raw.world),
            DataClass("Base de Datos", "Conexión MySQL", R.raw.world),
            DataClass("Diseño UI", "Uso de CardView", R.raw.world),
            DataClass("Animaciones", "Lottie Files", R.raw.world),
            DataClass("Angel Gabriel", "Final de Actividad", R.raw.world)
        )

        // 4. Inicializar el Adaptador y asignarlo al RecyclerView
        val adapter = CustomAdapter(listaDeItems)
        recyclerView.adapter = adapter
    }
}