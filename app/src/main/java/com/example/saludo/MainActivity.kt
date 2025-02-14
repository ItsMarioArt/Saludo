package com.example.saludo

import android.os.Bundle
import android.view.TextureView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btn1: Button
    private lateinit var nameInput: EditText
    private lateinit var message: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        btn1 = findViewById(R.id.btn1)
        nameInput = findViewById(R.id.nameInput)
        message = findViewById(R.id.message)

    /* 1st. Method
        val btn1 = findViewById<Button>(R.id.btn1)
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val message = findViewById<TextView>(R.id.message)

        btn1.setOnClickListener {
            val nom = nameInput.text.toString()
            if (nom.isEmpty()) {
                Toast.makeText(this, "Escribe tu nombre", Toast.LENGTH_SHORT).show()
            }
            else {
                message.text = "Hola $nom" + " Como estas?"

                Toast.makeText(this, "Hola $nom" + " Como estas?", Toast.LENGTH_SHORT).show()


            }

        }*/
    }

    fun saludar(view: android.view.View) {
        val nom = nameInput.text.toString()
        if (nom.isEmpty()) {
            Toast.makeText(this, "Escribe tu nombre", Toast.LENGTH_SHORT).show()
        }
        else {
            message.text = "Hola $nom" + " Como estas?"

            Toast.makeText(this, "Hola $nom" + " Como estas?", Toast.LENGTH_SHORT).show()


        }

    }
}

