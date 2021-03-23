package com.example.lista_de_compras

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lista_de_compras.model.Produto


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listaDeCompras: MutableList<Produto> = mutableListOf()


        val rvProdutos = findViewById<RecyclerView>(R.id.rvProdutos)
        val addProduto = findViewById<Button>(R.id.btnCadastrar)
        val adapterProduto = ProdutosAdapter(listaDeCompras)
        rvProdutos.adapter = adapterProduto

        addProduto.setOnClickListener {
            adapterProduto.adicionarProduto(Produto("Café","2","Pilão"))

            //1. LinearLayout = Dispor os elementos em coluna única na vertical (padrão) OU horizontal
            //2. GridLayout = Dispor os elementos em mais de uma coluna, como uma tabela
            //3. StaggeredGridLayout = Dispor os elementos em mais de uma coluna, sem tamanho fixo
            rvProdutos.layoutManager = LinearLayoutManager(this)


        }


    }

    private fun Button.setOnClickListener(adapterProduto: ProdutosAdapter) {

    }
}

