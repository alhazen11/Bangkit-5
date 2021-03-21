package com.bangkit.alzahid.List

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.alzahid.List.data.Hero2
import com.bangkit.alzahid.databinding.ItemRowHeroBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListHeroAdapter(private val listHero: ArrayList<Hero2>) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val binding = ItemRowHeroBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listHero[position])
    }

    override fun getItemCount(): Int = listHero.size

    inner class ListViewHolder(private val binding: ItemRowHeroBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(hero: Hero2) {
            itemView.setOnClickListener {
                Toast.makeText(
                    itemView.context,
                    "You choose ${hero.name}",
                    Toast.LENGTH_SHORT
                ).show()
                val intent = Intent(
                    itemView.context, DetailActivity::class.java)
                intent.putExtra("HERO_OBJECT", hero)
                itemView.context.startActivity(intent)
            }
            with(binding){
                Glide.with(itemView.context)
                    .load(hero.photo)
                    .apply(RequestOptions().override(55, 55))
                    .into(imgItemPhoto)
                tvItemName.text = hero.name
                tvItemDescription.text = hero.description
            }
        }
    }
}