package com.example.guia1u3;

import androidx.appcompat.app.AppCompatActivity;

/* Importaciones */

public class MainActivity extends AppCompatActivity {

    Button Pies_Metros, Metros_Pulgadas, Pulgadas_Pies;
    Intent Cambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pies_Metros = (Button) findViewById(R.id.Calculo_1);
        Metros_Pulgadas = (Button) findViewById(R.id.Calculo_2);
        Pulgadas_Pies = (Button) findViewById(R.id.Calculo_3);

        Pies_Metros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cambio = new Intent(getApplication(), Calculo.class);
                startActivity(Cambio);
            }
        });
        Metros_Pulgadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cambio = new Intent(getApplication(), Calculo_2.class);
                startActivity(Cambio);
            }
        });
        Pulgadas_Pies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cambio = new Intent(getApplication(), Calculo_3.class);
                startActivity(Cambio);
            }
        });

    }
}
