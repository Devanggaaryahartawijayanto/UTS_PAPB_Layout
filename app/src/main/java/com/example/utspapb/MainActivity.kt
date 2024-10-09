package com.example.utspapb

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.utspapb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil data dari Relative Activity
        val name = intent.getStringExtra("EXTRA_NAME")

        // Set data ke TextView
        binding.tvName.text = "Name: $name"

        binding.btnKeluar.setOnClickListener {
            val intent = Intent(this, ConstraintActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"You have\n" +
                    "successfully logged out",Toast.LENGTH_SHORT).show();
            return@setOnClickListener
        }
    }
}