package com.example.utspapb

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.utspapb.databinding.ActivityRelativeBinding

class RelativeActivity : AppCompatActivity() {

    // Inisialisasi binding
    private lateinit var binding: ActivityRelativeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup binding
        binding = ActivityRelativeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Handle button register click
        binding.btnSubmit.setOnClickListener {
            val name = binding.etName.text.toString()

            if (name.isEmpty()) {
                Toast.makeText(this,"Enter your name first",Toast.LENGTH_SHORT).show();
                return@setOnClickListener
            }

            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("EXTRA_NAME", name)
            }
            startActivity(intent)
        }
    }
}