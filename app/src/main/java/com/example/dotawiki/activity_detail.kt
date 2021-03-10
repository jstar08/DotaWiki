package com.example.dotawiki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.dotawiki.model.hero
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail.imageView_imageDetail
import kotlinx.android.synthetic.main.activity_detail.textView_nameDetail

class activity_detail : AppCompatActivity() {

    companion object{
        val HEROES = "heroes"
    }

    private lateinit var heroes : hero

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        heroes = intent.getSerializableExtra(HEROES) as hero

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Glide.with(this)
                .load(heroes.heroImage)
                .into(imageView_imageDetail)

        Glide.with(this)
                .load(heroes.typeImage)
                .into(imageView_typeDetail)

        textView_nameDetail.text = heroes.name
        textView_descDetail.text = heroes.desc

        imageView_actionback.setOnClickListener { onBackPressed() }
    }
}