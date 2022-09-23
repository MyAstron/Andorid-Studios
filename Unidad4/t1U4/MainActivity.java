package com.example.guia1u4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText cAlumno, cNota_1, cNota_2, cNota_3; // "c" de Caja, para decir "Caja de Texto sobre... "
    Button bEnviar, bLimpiar; // Lo mismo que "c" pero con "b" de "boton"
    Intent Procesar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cAlumno = findViewById(R.id.Alumno);
        cNota_1 = findViewById(R.id.Nota_1);
        cNota_2 = findViewById(R.id.Nota_2);
        cNota_3 = findViewById(R.id.Nota_3);
        bEnviar = findViewById(R.id.Enviar);
        bLimpiar= findViewById(R.id.Cancelar);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Alumno = cAlumno.getText().toString();
                double Nota1, Nota2, Nota3;
                Nota1 = Double.parseDouble(cNota_1.getText().toString());
                Nota2 = Double.parseDouble(cNota_2.getText().toString());
                Nota3 = Double.parseDouble(cNota_3.getText().toString());
                Procesar = new Intent(getApplication(), Alumno.class);
                Procesar.putExtra("Alumno", Alumno);
                Procesar.putExtra("Nota1", Nota1);
                Procesar.putExtra("Nota2", Nota2);
                Procesar.putExtra("Nota3", Nota3);
                startActivity(Procesar);
            }
        });
    }
}
