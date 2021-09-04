package com.dogukankazan.footballteamproject

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val takimListesi : ArrayList<String>,val takimGorselleri: ArrayList<Bitmap>):RecyclerView.Adapter<RecyclerAdapter.TakımVH>() {
    class TakımVH(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TakımVH {
        //Inflater..
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return TakımVH(itemView)
    }

    override fun onBindViewHolder(holder: TakımVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = takimListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("takimlarismi",takimListesi.get(position))
            var singleton = SingletonClass.SecilenTakim
            singleton.gorsel = takimGorselleri.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return takimListesi.size
    }
}