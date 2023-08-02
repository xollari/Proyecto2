package com.example.uploadimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.util.Patterns

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val INGRESAR = findViewById<Button>(R.id.Ingresar)
        val emailEditText = findViewById<EditText>(R.id.email1)
        val passEditText = findViewById<EditText>(R.id.pass)

        INGRESAR.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passEditText.text.toString()

            if (isValidEmail(email)) {
                val intent1 = Intent(this, Perfil::class.java)
                intent1.putExtra("EMAIL", email)
                intent1.putExtra("PASSWORD", password) // Pasamos la contraseña a la siguiente actividad
                startActivity(intent1)
            } else {
                emailEditText.error = "Ingrese un correo válido con dominio @unfv.edu.pe"
            }
        }
    }

    // Función para validar el formato del correo electrónico
    private fun isValidEmail(email: String): Boolean {
        val pattern = Patterns.EMAIL_ADDRESS
        return pattern.matcher(email).matches() && email.endsWith("@unfv.edu.pe")
    }
}