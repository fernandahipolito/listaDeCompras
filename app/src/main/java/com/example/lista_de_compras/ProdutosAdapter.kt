package com.example.lista_de_compras

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lista_de_compras.model.Produto

class ProdutosAdapter(private val listaDeCompras: MutableList<Produto>) : RecyclerView.Adapter<ProdutosAdapter.ProdutosHolder>(){

    //PRIMEIRO PASSO A SER LIDO
    //Item final a ser visualizado e inserido na RecyclerView
    class ProdutosHolder(view: View) : RecyclerView.ViewHolder(view){
        val nomeProduto: TextView = view.findViewById(R.id.edtNome)
        val quantidadeProduto: TextView = view.findViewById(R.id.edtQuantidade)
        val marcaProduto : TextView = view.findViewById(R.id.edtMarca)
        val botaoCadastrar: Button = view.findViewById(R.id.btnCadastrar)

    }

    //Equivalente ao onCreate da Activity, só que no caso, da nossa célula/item
    //Da RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutosHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.produto_lista, parent, false)

        return ProdutosHolder(view)
    }

    //Responsável por VINCULAR os dados com os componentes do xml
    //Contato da lista = texto de contato do xml
    override fun onBindViewHolder(holder: ProdutosHolder, position: Int) {


        holder.nomeProduto.text = listaDeCompras[position].nome
        holder.quantidadeProduto.text = listaDeCompras[position].quantidade
        holder.marcaProduto.text = listaDeCompras[position].marca



    }

    fun adicionarProduto(produto:Produto){listaDeCompras.add(produto)
        notifyDataSetChanged()}


    override fun getItemCount(): Int = listaDeCompras.size

}

