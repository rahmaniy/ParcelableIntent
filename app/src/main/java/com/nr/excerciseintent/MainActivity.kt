package com.nr.excerciseintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = "Binarian"
        val umur = 22
        val email = "binar@binarian.co.id"
        val domisili = "Jakarta"
        val statusMenikah = false

        val btnIntent = findViewById<Button>(R.id.btn_intent)

        btnIntent.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            val person = Person(nama, umur, email, domisili, statusMenikah)

            intent.putExtra("PERSON", person)
            startActivity(intent)
        }
    }
}