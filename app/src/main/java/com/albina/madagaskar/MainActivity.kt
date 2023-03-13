package com.albina.madagaskar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var animals = ArrayList<Animal>()
    private lateinit var rv : RecyclerView
    private lateinit var adapter: AnimalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.rv_animals)

        rv.layoutManager = LinearLayoutManager(this@MainActivity)

        val lion = Animal("Alex", "Alex is a headstrong, protective, and self-proclaimed leader of his friends.", R.drawable.lion)
        val zebra = Animal("Marty", "Marty is a plains zebra who used to live at the Central Park Zoo, and is a good friend of Alex.", R.drawable.zebra)
        val squirrel = Animal("Mort", "Mort is a small cute and cuddly goodman's mouse lemur. Though quite timid, Mort can also be shrill and vocal in confrontations.", R.drawable.mort)

        animals.add(lion)
        animals.add(zebra)
        animals.add(squirrel)

        adapter = AnimalAdapter(animals, this@MainActivity)
        rv.adapter=adapter
    }
}