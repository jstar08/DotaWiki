package com.example.dotawiki

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.GlideException
import com.example.dotawiki.model.hero

class MainAdapter(private val context : Context) : ListAdapter<hero, MainAdapter.Viewholder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_hero, parent, false))
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class Viewholder(private val view : View) : RecyclerView.ViewHolder(view){
        val imageHero = view.findViewById<ImageView>(R.id.imageView_hero)
        val name = view.findViewById<TextView>(R.id.textView_heroName)
        val lore = view.findViewById<TextView>(R.id.textView_heroDetail)
        val typeHero = view.findViewById<ImageView>(R.id.imageView_heroType)
        val root = view.findViewById<CardView>(R.id.carView_root)
        fun bind(hero: hero){
            Glide.with(view)
                .load(hero.heroImage)
                .into(imageHero)

            Glide.with(view)
                .load(hero.typeImage)
                .into(typeHero)

            name.text = hero.name
            lore.text = hero.desc

            root.setOnClickListener {
                val intent = Intent(context, activity_detail::class.java)
                intent.putExtra(activity_detail.HEROES, hero)
                context.startActivity(intent)
            }
        }
    }

}

class DiffCallback : DiffUtil.ItemCallback<hero>(){
    override fun areItemsTheSame(oldItem: hero, newItem: hero): Boolean = oldItem == newItem

    override fun areContentsTheSame(oldItem: hero, newItem: hero): Boolean = oldItem.name == newItem.name

}