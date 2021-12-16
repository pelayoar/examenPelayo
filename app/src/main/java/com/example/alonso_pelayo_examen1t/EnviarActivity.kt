package com.example.alonso_pelayo_examen1t

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.alonso_pelayo_examen1t.databinding.ActivityEnviarBinding
import com.example.alonso_pelayo_examen1t.databinding.ActivityMainBinding

class EnviarActivity : AppCompatActivity() {

    private lateinit var binding : ActivityEnviarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEnviarBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val extras = intent.extras
        binding.textView.text = extras?.getString("texto")

        binding.eliminar.setOnClickListener {
            binding.eliminar.isVisible = false
            binding.textView.isVisible = false
        }


    }
}