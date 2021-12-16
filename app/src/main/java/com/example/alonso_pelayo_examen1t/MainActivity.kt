package com.example.alonso_pelayo_examen1t

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alonso_pelayo_examen1t.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var contador = 0


        binding.contar.setOnClickListener {
            contador++
            binding.textoPersonalizable.setText(contador.toString())
        }



        binding.enviar.setOnClickListener {

            val intent = Intent(this, EnviarActivity::class.java)
            intent.putExtra("texto", binding.textoPersonalizable.text.toString())
            startActivity(intent)
        }

        binding.registrar.setOnClickListener {

            val intent = Intent(this, Registrar::class.java)
            startActivity(intent)
        }

    }
}