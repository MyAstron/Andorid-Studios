package com.example.guia3u2;

import androidx.appcompat.app.AppCompatActivity;

 /* Importaciones */

public class square extends AppCompatActivity {

    EditText Base, Altura;
    Button Perimetro, Area, Regreso;
    TextView rCuadro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        Base = (EditText) findViewById(R.id.base);
        Altura = (EditText) findViewById(R.id.altura);
        Perimetro = (Button) findViewById(R.id.perimetro);
        Area = (Button) findViewById(R.id.area);
        Regreso = (Button) findViewById(R.id.regresar);
        rCuadro = (TextView) findViewById(R.id.respuesta);

        Perimetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Resultado, nBase, nAltura;
                nBase = Integer.parseInt(Base.getText().toString());
                nAltura = Integer.parseInt(Altura.getText().toString());
                    Resultado = ((nBase+nBase)+(nAltura+nAltura));
                rCuadro.setText("R//  "+Resultado);
            }
        });
        Area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Resultado, nBase, nAltura;
                nBase = Integer.parseInt(Base.getText().toString());
                nAltura = Integer.parseInt(Altura.getText().toString());
                    Resultado = (nBase*nAltura);
                rCuadro.setText("R//  "+Resultado);
            }
        });
        Regreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Cambio = new Intent(getApplication(), MainActivity.class);
                startActivity(Cambio);
            }
        });
    }
}
