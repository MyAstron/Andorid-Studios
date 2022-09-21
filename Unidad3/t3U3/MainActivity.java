package com.example.guia3u3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Valor;
    TextView Respuesta;
    RadioButton Celsius, Fahrenheit;
    Button Calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Valor = (EditText) findViewById(R.id.Valor);
        Respuesta = (TextView) findViewById(R.id.Respuesta);
        Celsius = (RadioButton) findViewById(R.id.Celsius);
        Fahrenheit = (RadioButton) findViewById(R.id.Fahrenheit);
        Calcular = (Button) findViewById(R.id.Calcular);

        Fahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Celsius.setChecked(false);
            }
        });
        Celsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fahrenheit.setChecked(false);
            }
        });
        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Valor_Ingresado, num_Respuesta;
                Valor_Ingresado = Double.parseDouble(Valor.getText().toString());

                if((Celsius.isChecked()) && (!Fahrenheit.isChecked())){
                    num_Respuesta = (Valor_Ingresado-32)/1.8;
                    Respuesta.setText("R// "+num_Respuesta+" C°");
                }else if((!Celsius.isChecked()) && (Fahrenheit.isChecked())){
                    num_Respuesta = (Valor_Ingresado*1.8)+32;
                    Respuesta.setText("R// "+num_Respuesta+" F°");
                }else{
                    Respuesta.setText("R// Repete el Calculo");
                }
            }
        });
    }
}
