package com.example.slideshowapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private val imageList = listOf(
        ImageItem(R.drawable.hello, "Hello"),
        ImageItem(R.drawable.citylights, "City Lights"),
        ImageItem(R.drawable.desert, "Desert"),
        ImageItem(R.drawable.fireworks, "Fireworks"),
        ImageItem(R.drawable.forestopath, "Forest Path"),
        ImageItem(R.drawable.beachvibes, "Beach Vibes"),
        ImageItem(R.drawable.lakemirror, "Lake Mirror"),
        ImageItem(R.drawable.mountainroad, "Mountain Road"),
        ImageItem(R.drawable.rainystreet, "Rainy Street"),
        ImageItem(R.drawable.starrynight, "Starry Night"),
        ImageItem(R.drawable.sunsetview, "Sunset View"),
        ImageItem(R.drawable.thankyouforwatching, "Thanks for Watching")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ImageAdapter(imageList)
    }
}
