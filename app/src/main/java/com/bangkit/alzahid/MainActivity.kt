package com.bangkit.alzahid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.bangkit.alzahid.Fragment.FragmentActivity
import com.bangkit.alzahid.List.ActivityListView
import com.bangkit.alzahid.List.ActivityRecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var button3 : Button
    lateinit var button4 : Button
    lateinit var button5 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button10)

        button3.setOnClickListener {
            Toast.makeText(this@MainActivity, "Move to ListView", Toast.LENGTH_SHORT).show()
            val moveIntent = Intent(
                    this@MainActivity,
                    ActivityListView::class.java
            )
            startActivity(moveIntent)
        }
        button5.setOnClickListener {
            Toast.makeText(this@MainActivity, "Move to RecyclerView", Toast.LENGTH_SHORT).show()
            val moveIntent = Intent(
                    this@MainActivity,
                    ActivityRecyclerView::class.java
            )
            startActivity(moveIntent)
        }
        button4.setOnClickListener {
            Toast.makeText(this@MainActivity, "Move to Fragment", Toast.LENGTH_SHORT).show()
            val moveIntent = Intent(
                    this@MainActivity,
                    FragmentActivity::class.java
            )
            startActivity(moveIntent)
        }
    }
}