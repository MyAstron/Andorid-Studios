package com.example.examen_base;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Paella extends AppCompatActivity {

    /* Declarar Variables */
    Button btnRegresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paella);

        /* Asignar Relacion con el Grafico */
        btnRegresar = (Button) findViewById(R.id.btnRegresar);

        /* Activar al Momento del Click */
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Crear Objeto tipo Intent
                Intent cambio = new Intent(getApplication(), MainActivity.class);

                /* Ejecutar el Cambio de Pantalla */ 
                startActivity(cambio);
            }
        });
    }
}
