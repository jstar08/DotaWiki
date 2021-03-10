package com.example.dotawiki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dotawiki.data.getData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = MainAdapter(this)
        recyclerView_main.adapter = adapter
        adapter.submitList(getData())

        cardView_profile.setOnClickListener{
            startActivity(
                    Intent(
                            this,
                            activity_about::class.java
                    )
            )
        }
    }
}