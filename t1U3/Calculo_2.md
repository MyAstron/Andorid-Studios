## Configuracion de la convercion: -- **`Metros`(m)** a **`Pulgadas`(in)**
```java
package com.example.guia1u3;

import androidx.appcompat.app.AppCompatActivity;

/* Importaciones */

public class Calculo_2 extends AppCompatActivity {

    Button Calcular, Retornar;
    TextView Resultado;
    EditText Valor;
    Intent Cambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo2);

        Retornar = (Button) findViewById(R.id.Retorno);

        Calcular = (Button) findViewById(R.id.Calcular);
        Valor = (EditText) findViewById(R.id.Valor_Pie);
        Resultado = (TextView) findViewById(R.id.Resultado_Metros);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double metros, pulgadas, respuesta;
                metros = Double.parseDouble(Valor.getText().toString());
                pulgadas = 39.27;

                respuesta = pulgadas * metros;

                Resultado.setText(respuesta+" in");
                Valor.setText(""); Valor.setHint(metros+" m");
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
```
