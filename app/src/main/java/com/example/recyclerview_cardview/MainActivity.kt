package com.example.recyclerview_cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

// Model file contains our data of recyclerview.
    // it conatain the class hobby.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
    }


    private fun setupRecyclerView() {
// below layoutManager use to set the orientation of the recyclerview.
        // it can be horizontal.
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
// Supplier.hobbies is our hobby array see in model class.
        val adapter= HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter
    }
}
