package com.example.uploadimage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        // Declaración de los objetos correspondientes al layout
        val imageView = findViewById<ImageView>(R.id.imageView4)
        val asistenciaButton = findViewById<Button>(R.id.Asistencia)
        val changePassButton = findViewById<Button>(R.id.change_pass)
        val nombreTextView = findViewById<TextView>(R.id.Nombre)
        val apellidoTextView = findViewById<TextView>(R.id.Apellido)
        val codigoTextView = findViewById<TextView>(R.id.Codigo)
        val escuelaTextView = findViewById<TextView>(R.id.Escuela)
        val atrasButton = findViewById<Button>(R.id.Atras1)

        // Aquí puedes realizar cualquier acción con los elementos visuales, como establecer escuchadores de clic,
        // cargar imágenes, cambiar textos, etc.

        // Ejemplo: Establecer una imagen en el ImageView (reemplaza "R.drawable.imagen_perfil" con el recurso de imagen que desees)
        //imageView.setImageResource(R.drawable.imagen_perfil)

        // Ejemplo: Establecer textos en los TextViews
        nombreTextView.text = "Cristhian Manuel"
        apellidoTextView.text = "Manco Cambillo"
        codigoTextView.text = "2019235456"
        escuelaTextView.text = "Escuela de Ingenieria Informatica"

        // Ejemplo: Establecer escuchador de clic en el botón "Asistencia"
        asistenciaButton.setOnClickListener {
            // Acción a realizar cuando se hace clic en el botón "Asistencia"
            // Puedes agregar aquí el código que necesites para manejar el clic del botón

            // En este ejemplo, lanzamos la actividad MainActivity cuando se hace clic en el botón "Asistencia"
            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

        // Ejemplo: Establecer escuchador de clic en el botón "Cambiar Contraseña"
        changePassButton.setOnClickListener {
            // Acción a realizar cuando se hace clic en el botón "Cambiar Contraseña"
            // Puedes agregar aquí el código que necesites para manejar el clic del botón
            val intent3 = Intent(this, Change_pass::class.java)
            startActivity(intent3)
        }

        // Ejemplo: Establecer escuchador de clic en el botón "Atras"
        atrasButton.setOnClickListener {
            // Acción a realizar cuando se hace clic en el botón "Atras"
            // Puedes agregar aquí el código que necesites para manejar el clic del botón
            val intent2 = Intent(this, Principal::class.java)
            startActivity(intent2)
        }
    }
}