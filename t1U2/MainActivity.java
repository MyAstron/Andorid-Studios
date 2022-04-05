package com.example.guia1u2;

import androidx.appcompat.app.AppCompatActivity;

/* Importaciones... */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      // Declaracion e Igualacion de Variables con: activity_main.xml
        View fondo = this.getWindow().getDecorView();
        Button Nombre = (Button) findViewById(R.id.button);
        TextView tvDatos= (TextView) findViewById(R.id.datos);

      // Reconocimiento del Fondo de Pantalla
        fondo.setBackgroundResource(R.color.white);

      // Cuando se detecte una señal del boton
        Nombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              
              // Re-Establecer el Fondo
                fondo.setBackgroundResource(R.color.rojo_fuego);
              // Cambiar el Contenido Textual del: TextView
                tvDatos.setText("Cristopher Sic");
            }
        });
    }
}
