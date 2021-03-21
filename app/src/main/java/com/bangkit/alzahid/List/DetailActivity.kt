package com.bangkit.alzahid.List

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bangkit.alzahid.List.data.Hero2
import com.bangkit.alzahid.R
import com.bangkit.alzahid.databinding.ActivityDetailBinding
import com.bangkit.alzahid.databinding.ActivityRecyclerViewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    lateinit var image: ImageView
    lateinit var name: TextView
    lateinit var desc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val hero = intent.getParcelableExtra<Hero2>("HERO_OBJECT") as Hero2
        image = binding.imgPhoto
        name = binding.txtName
        desc = binding.txtDescription

        Glide.with(this)
            .load(hero.photo)
            .apply(RequestOptions().override(55, 55))
            .into(image)
        name.text = hero.name
        desc.text = hero.description

    }
}