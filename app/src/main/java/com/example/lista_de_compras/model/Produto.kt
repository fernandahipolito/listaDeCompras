package com.example.lista_de_compras.model


import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable


data class Produto (val nome: String,
                    val marca: String,
                    val quantidade: Int)
