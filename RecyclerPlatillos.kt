package com.example.menudrawer

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class RecyclerPlatillos(var context: Context, var listaPlatillos:MutableList<Platillos>):RecyclerView.Adapter<RecyclerPlatillos.MiHolder>() {

    inner class MiHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        //Devuelve el tamaño de la lista
        return listaPlatillos.size
    }

    override fun onBindViewHolder(holder: MiHolder, position: Int) {
        TODO("Not yet implemented")
    }
}