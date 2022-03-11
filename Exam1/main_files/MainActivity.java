package com.example.examen_base;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /* Declarar Variables */
    Button btnPaella;
    Button btnPulpo;
    Button btnSalmonero;
    Button btnAlumno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Asignar Relacion con el Grafico */
        btnPaella = (Button) findViewById(R.id.btnPaella);
        btnPulpo = (Button) findViewById(R.id.btnPulpo);
        btnSalmonero = (Button) findViewById(R.id.btnSalmonero);
        btnAlumno = (Button) findViewById(R.id.btnAlumno);

        /* Activar al Momento del Click */
        btnPaella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear Objeto tipo Intent
                Intent cambio = new Intent(getApplication(), Paella.class);

                /* Ejecutar el Cambio de Pantalla */
                startActivity(cambio);
            }
        });
        btnPulpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear Objeto tipo Intent
                Intent cambio = new Intent(getApplication(), Pulpo.class);

                /* Ejecutar el Cambio de Pantalla */
                startActivity(cambio);
            }
        });
        btnSalmonero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear Objeto tipo Intent
                Intent cambio = new Intent(getApplication(), Salmonero.class);

                /* Ejecutar el Cambio de Pantalla */
                startActivity(cambio);
            }
        });
        btnAlumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Crear Objeto tipo Intent
                Intent cambio = new Intent(getApplication(), Alumno.class);

                /* Ejecutar el Cambio de Pantalla */
                startActivity(cambio);
            }
        });
    }
}
