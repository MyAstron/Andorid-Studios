package com.example.guia3u2;

import androidx.appcompat.app.AppCompatActivity;

 /* Importaciones */

public class circle extends AppCompatActivity {

    EditText Radio;
    Button Perimetro, Area, Regreso;
    TextView rCuadro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        Radio = (EditText) findViewById(R.id.base);
        Perimetro = (Button) findViewById(R.id.perimetro);
        Area = (Button) findViewById(R.id.area);
        Regreso = (Button) findViewById(R.id.regresar);
        rCuadro = (TextView) findViewById(R.id.respuesta);

        Perimetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Resultado, nRadio;
                nRadio = Integer.parseInt(Radio.getText().toString());
                Resultado = ((3.14)*(nRadio*nRadio));
                rCuadro.setText("R//  "+Resultado);
            }
        });
        Area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Resultado, nRadio;
                nRadio = Integer.parseInt(Radio.getText().toString());
                Resultado = ((3.14)*nRadio*(2));
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
