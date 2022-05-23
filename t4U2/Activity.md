```java
package com.example.guia4u2;

/* Importaciones */

public class Activity extends AppCompatActivity {

    Button Calcular;
    TextView Dia_Resul;
    EditText Numero_Dia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_2);

        Calcular = (Button) findViewById(R.id.Calcular_Dia);
        Dia_Resul = (TextView) findViewById(R.id.Dia);
        Numero_Dia = (EditText) findViewById(R.id.Numero);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Num;
                Num = Integer.parseInt(Numero_Dia.getText().toString());

                if (Num == 1) {
                    Dia_Resul.setText("Lunes");
                }else if (Num == 2) {
                    Dia_Resul.setText("Martes");
                }else if (Num == 3) {
                    Dia_Resul.setText("Miercoles");
                }else if (Num == 4) {
                    Dia_Resul.setText("Jueves");
                }else if (Num == 5) {
                    Dia_Resul.setText("Viernes");
                }else if (Num == 6) {
                    Dia_Resul.setText("Sabado");
                }else if (Num == 7) {
                    Dia_Resul.setText("Domingo");
                }else{
                    Dia_Resul.setText(" El numero "+Num+" No forma parte de los 7 dias de la Semana ");
                }
            }
        });

    }
}
```
