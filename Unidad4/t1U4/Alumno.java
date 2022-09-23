package com.example.guia1u4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Alumno extends AppCompatActivity {

    TextView cNombre, cPromedio, cEstado;
    String sNombre, sEstado;
    Bundle Receptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);
        double nNota1, nNota2, nNota3, nPromedio;
        cNombre = findViewById(R.id.R_Alumno);
        cPromedio = findViewById(R.id.R_Promedio);
        cEstado = findViewById(R.id.R_Estado);
        Receptor = getIntent().getExtras();
        sNombre = Receptor.getString("Alumno");
        nNota1 = Receptor.getDouble("Nota1");
        nNota2 = Receptor.getDouble("Nota2");
        nNota3 = Receptor.getDouble("Nota3");
        nPromedio = (nNota1 + nNota2 + nNota3) / 3;

        if(nPromedio < 70)
            sEstado = "Reprobado...";
        else
            sEstado = "¡Aprobado!";

        cNombre.setText(sNombre);
        cPromedio.setText(nPromedio+"");
        cEstado.setText(sEstado);
    }
}
