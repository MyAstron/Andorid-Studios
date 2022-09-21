package com.example.guia4u3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Muestra extends AppCompatActivity {

    TextView dato_Nombre, dato_Precio, dato_Descripcion, dato_Fecha, dato_Cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra);

        dato_Nombre = (TextView) findViewById(R.id.dato_Nombre);
        dato_Precio = (TextView) findViewById(R.id.dato_Precio);
        dato_Descripcion = (TextView) findViewById(R.id.dato_Descripcion);
        dato_Fecha = (TextView) findViewById(R.id.dato_Fecha);
        dato_Cantidad = (TextView) findViewById(R.id.dato_Cantidad);

        Bundle Datos_Carga = getIntent().getExtras();

        String Nombre = Datos_Carga.getString("Nombre");
        String Precio = Datos_Carga.getString("Precio");
        String Descripcion = Datos_Carga.getString("Descripcion");
        String Fecha = Datos_Carga.getString("Fecha");
        String Cantidad = Datos_Carga.getString("Cantidad");

        dato_Nombre.setText(Nombre);
        dato_Precio.setText("Q. "+Precio);
        dato_Descripcion.setText(Descripcion);
        dato_Fecha.setText(Fecha);
        dato_Cantidad.setText(Cantidad+" unidad(es)");
    }
}
