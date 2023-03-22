package br.com.baiardi.orgs.ui.activity

import android.app.Activity
import android.os.Bundle

import androidx.recyclerview.widget.RecyclerView
import br.com.baiardi.orgs.ListaProdutosAdapter
import br.com.baiardi.orgs.R

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter()
    }

}