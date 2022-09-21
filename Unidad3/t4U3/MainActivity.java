package com.example.guia4u3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt_Nombre, txt_Precio, txt_Descripcion, txt_Fecha, txt_Cantidad;
    Button btn_Procesar, btn_Cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Nombre = (EditText) findViewById(R.id.dato_Nombre);
        txt_Precio = (EditText) findViewById(R.id.dato_Precio);
        txt_Descripcion = (EditText) findViewById(R.id.dato_Descripcion);
        txt_Fecha = (EditText) findViewById(R.id.dato_Fecha);
        txt_Cantidad = (EditText) findViewById(R.id.dato_Cantidad);
        btn_Cancelar = (Button) findViewById(R.id.btn_Cancelar);
        btn_Procesar = (Button) findViewById(R.id.btn_Procesar);

        btn_Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_Nombre.setText(""); txt_Precio.setText(""); txt_Descripcion.setText("");
                txt_Fecha.setText(""); txt_Cantidad.setText("");
            }
        });
        btn_Procesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Envio = new Intent(getApplication(), Muestra.class);
                Envio.putExtra("Nombre", txt_Nombre.getText().toString());
                Envio.putExtra("Precio", txt_Precio.getText().toString());
                Envio.putExtra("Descripcion", txt_Descripcion.getText().toString());
                Envio.putExtra("Fecha", txt_Fecha.getText().toString());
                Envio.putExtra("Cantidad", txt_Cantidad.getText().toString());
                startActivity(Envio);
            }
        });
    }
}
