package com.bangkit.alzahid.List

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bangkit.alzahid.List.data.Hero2
import com.bangkit.alzahid.R
import com.bangkit.alzahid.databinding.ActivityRecyclerViewBinding


class ActivityRecyclerView : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewBinding
    private val list = ArrayList<Hero2>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvHeroes.setHasFixedSize(true)

        list.addAll(getListHeroes())
        showRecyclerList()
    }
    private fun getListHeroes(): ArrayList<Hero2> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo_url)
        val listHero = ArrayList<Hero2>()
        for (position in dataName.indices) {
            val hero = Hero2(
                dataPhoto[position],
                dataName[position],
                dataDescription[position],
            )
            listHero.add(hero)
        }
        return listHero
    }

    private fun showRecyclerList() {
        binding.rvHeroes.layoutManager = LinearLayoutManager(this)
        //binding.rvHeroes.layoutManager = GridLayoutManager(this, 2)
        val listHeroAdapter = ListHeroAdapter(list)
        binding.rvHeroes.adapter = listHeroAdapter
    }
}