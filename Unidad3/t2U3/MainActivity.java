package com.example.guia2u3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView Caja_Respuesta;
    EditText n1, n2;
    Spinner Seleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.x);
        n2 = (EditText) findViewById(R.id.y);
        Caja_Respuesta = (TextView) findViewById(R.id.resultado);
        Seleccion = (Spinner) findViewById(R.id.seleccion);

        Seleccion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String Opcion = adapterView.getItemAtPosition(i).toString();
                double resultado, numero_x, numero_y;
                resultado = 0;
                numero_x = Double.parseDouble(n1.getText().toString());
                numero_y = Double.parseDouble(n2.getText().toString());

                if (Opcion.equals("Suma")){
                    resultado = numero_x + numero_y;
                }else if (Opcion.equals("Resta")) {
                    resultado = numero_x - numero_y;
                }else if (Opcion.equals("Multiplicacion")) {
                    resultado = numero_x * numero_y;
                }else if (Opcion.equals("Division")) {
                    resultado = numero_x / numero_y;
                }
                Caja_Respuesta.setText(" R//  "+resultado);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
