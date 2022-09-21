package com.example.guia1u3;

import androidx.appcompat.app.AppCompatActivity;

/* Importaciones */

public class Calculo extends AppCompatActivity {

    Button Retornar, Calclas;
    EditText Valor_Ingresado;
    TextView Resultado_Metros;
    Intent Cambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        Retornar = (Button) findViewById(R.id.Retorno);
        Calclas = (Button) findViewById(R.id.Calcular);
        Valor_Ingresado = (EditText) findViewById(R.id.Valor_Pie);
        Resultado_Metros = (TextView) findViewById(R.id.Resultado_Metros);

        Calclas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Pies, Metros, Resultado;
                Pies = Double.parseDouble(Valor_Ingresado.getText().toString());
                Metros = 0.3048;
                Resultado = Pies * Metros;

                Resultado_Metros.setText(Resultado+" m");
                Valor_Ingresado.setText(""); Valor_Ingresado.setHint(Pies+" ft");
            }
        });

        Retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cambio = new Intent(getApplication(), MainActivity.class);
                startActivity(Cambio);
            }
        });
    }
}
