package br.com.baiardi.orgs.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.baiardi.orgs.ListaProdutosAdapter
import br.com.baiardi.orgs.R
import br.com.baiardi.orgs.model.Produto
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto("a","adesc", BigDecimal("19.00")),
            Produto("b","bdesc", BigDecimal("19.00")),
            Produto("c","cdesc", BigDecimal("19.00")),
        ))
    }

}