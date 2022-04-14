package com.nr.excerciseintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val person = intent.getParcelableExtra<Person>("PERSON")

        val tvNama = findViewById<TextView>(R.id.tv_nama)
        val tvUmur = findViewById<TextView>(R.id.tv_umur)
        val tvEmail = findViewById<TextView>(R.id.tv_email)
        val tvDomisili = findViewById<TextView>(R.id.tv_domisili)
        val tvStatusMenikah = findViewById<TextView>(R.id.tv_status_menikah)

        tvNama.text = "Nama\t: ${person!!.nama}"
        tvUmur.text = "Umur\t: " + person!!.umur
        tvEmail.text = "E-mai\t: " + person!!.email
        tvDomisili.text = "Domisili\t: " + person!!.domisili

        if (person.statusMenikah) {
            tvStatusMenikah.text = "Status Menikah : Sudah Menikah"
        } else {
            tvStatusMenikah.text = "Status Menikah : Lajang"
        }

    }
}