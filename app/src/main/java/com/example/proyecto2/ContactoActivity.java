package com.example.proyecto2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ContactoActivity extends AppCompatActivity {

    private EditText etNombre, etCorreo, etMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        etNombre = findViewById(R.id.etNombreContacto);
        etCorreo = findViewById(R.id.etCorreoContacto);
        etMensaje = findViewById(R.id.etMensajeContacto);
        Button btnEnviarComentario = findViewById(R.id.btnEnviarComentario);

        btnEnviarComentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarCorreo();
            }
        });
    }

    private void enviarCorreo() {
        String nombre = etNombre.getText().toString();
        String correo = etCorreo.getText().toString();
        String mensaje = etMensaje.getText().toString();

        // Implementar lógica para enviar el correo usando JavaMail API
        // Mostrar un mensaje de confirmación
        Toast.makeText(this, "Comentario enviado", Toast.LENGTH_SHORT).show();
    }
}
