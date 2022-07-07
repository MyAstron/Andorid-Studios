## Configuracion de la convercion: -- **`Pulgadas`(in)** a **`Pies`(ft.)**
```java
package com.example.guia1u3;

import androidx.appcompat.app.AppCompatActivity;

/* Importaciones */

public class Calculo_3 extends AppCompatActivity {

    Button Calcular, Retornar;
    TextView Resultado;
    EditText Valor;
    Intent Cambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo3);
        View Back = this.getWindow().getDecorView();
        Back.setBackgroundResource(R.color.jamon);

        Retornar = (Button) findViewById(R.id.Retorno);

        Calcular = (Button) findViewById(R.id.Calcular);
        Valor = (EditText) findViewById(R.id.Valor_Pie);
        Resultado = (TextView) findViewById(R.id.Resultado_Metros);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double pie, pulgadas, respuesta;
                pulgadas = Double.parseDouble(Valor.getText().toString());
                pie = 0.0833333;

                respuesta = pulgadas * pie;

                Resultado.setText(respuesta+" ft");
                Valor.setText(""); Valor.setHint(pulgadas+" in");
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
