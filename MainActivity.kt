package com.example.verificadordeidade

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val editTextIdade = findViewById<EditText>(R.id.editTextIdade)
            val buttonVerificar = findViewById<Button>(R.id.buttonVerificar)
            val textViewResultado = findViewById<TextView>(R.id.textViewResultado)

            buttonVerificar.setOnClickListener {
                val idadeStr = editTextIdade.text.toString()

                if (idadeStr.isNotEmpty()) {
                    val idade = idadeStr.toInt()

                    val mensagem = when {
                        idade < 18 -> "Você é menor de idade."
                        idade in 18..60 -> "Você está na meia idade."
                        else -> "Você é idoso."
                    }

                    textViewResultado.text = mensagem
                } else {
                    textViewResultado.text = "Por favor, insira sua idade."
                }
            }
        }
    }