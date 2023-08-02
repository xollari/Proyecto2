package com.example.uploadimage
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Change_pass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_pass)

        val currentPassEditText = findViewById<EditText>(R.id.current_past)
        val newPassEditText = findViewById<EditText>(R.id.new_pass)
        val changePassButton = findViewById<Button>(R.id.change_pass_button)

        // Aquí puedes agregar la lógica para manejar el clic del botón "Cambiar Contraseña"
        changePassButton.setOnClickListener {
            val currentPass = currentPassEditText.text.toString()
            val newPass = newPassEditText.text.toString()

            // Aquí puedes realizar la validación de las contraseñas y realizar el cambio en la base de datos
            // Por ejemplo, podrías realizar una llamada a la API para actualizar la contraseña del usuario

            // Si la contraseña actual y la nueva contraseña son válidas y el cambio es exitoso, muestra un mensaje de éxito
            Toast.makeText(this, "Contraseña cambiada con éxito", Toast.LENGTH_SHORT).show()

            // Luego, puedes regresar a la actividad anterior (Perfil.kt)
            finish()
        }
    }
}