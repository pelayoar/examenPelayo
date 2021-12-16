package com.example.alonso_pelayo_examen1t

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.alonso_pelayo_examen1t.databinding.ActivityEnviarBinding
import com.example.alonso_pelayo_examen1t.databinding.ActivityRegistrarBinding

class Registrar : AppCompatActivity() {

    private lateinit var binding : ActivityRegistrarBinding



    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityRegistrarBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonRegistrar.setOnClickListener {

            val alertDialogBuilder = AlertDialog.Builder(this)

            val nombre = binding.textNombre.text.toString() + " " + binding.textApellido1.text.toString() + " " + binding.textApellido2.text.toString()
            var sexo = ""
            val sexButton = binding.radioSexo.checkedRadioButtonId
            if (sexButton == binding.sexHombre.id){
                sexo = "Hombre"
            } else if (sexButton == binding.sexMujer.id){
                sexo = "Mujer"
            } else {
                sexo = "No especificado"
            }

            val fechaContrato = binding.textIncorporacion.text.toString()






            alertDialogBuilder.setTitle("Registrando:")
            alertDialogBuilder.setMessage("Nombre: " + nombre + "\nSexo: " + sexo + "\nFecha de contrato: " + fechaContrato)
            alertDialogBuilder.setPositiveButton("Ok", null)
            alertDialogBuilder.show()



        }


    }
}