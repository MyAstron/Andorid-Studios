```java
package com.example.guia4u2;

import androidx.appcompat.app.AppCompatActivity;

/* Importaciones */

public class MainActivity extends AppCompatActivity {

    Button Calcular, Alumno, A_;
    EditText I_Bruto;
    TextView Respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calcular = (Button) findViewById(R.id.Calcular);
        Alumno = (Button) findViewById(R.id.Alumno);
        A_ = (Button) findViewById(R.id.button);
        I_Bruto = (EditText) findViewById(R.id.importe_bruto);
        Respuesta = (TextView) findViewById(R.id.respuesta);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num_Bruto, nResultado;
                nResultado = 0;
                num_Bruto = Integer.parseInt(I_Bruto.getText().toString());

                if (num_Bruto >= 20000) {
                    nResultado = (num_Bruto*15)/100;
                }else{
                    nResultado = num_Bruto;
                }

                Respuesta.setText("R// "+nResultado);
            }
            });
            Alumno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent Cristopher = new Intent(getApplication(), Alumno.class);
                    startActivity(Cristopher);
                }
            });
            A_.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent A = new Intent(getApplication(), Activity.class);
                    startActivity(A);
                }
            });
    }
}
```
