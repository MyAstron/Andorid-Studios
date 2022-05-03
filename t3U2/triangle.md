## <img src="https://i.ibb.co/VSvC7pw/support-emoji-3.png" height="30"> Configuracion del  `activity_triangle`
```java
package com.example.guia3u2;

import androidx.appcompat.app.AppCompatActivity;

 /* Importaciones */

public class triangle extends AppCompatActivity {

    EditText Base, Altura, Lateral_A, Lateral_C;
    Button Perimetro, Area, Regreso;
    TextView rCuadro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        Base = (EditText) findViewById(R.id.base);
        Altura = (EditText) findViewById(R.id.altura);
        Lateral_A = (EditText) findViewById(R.id.lateral1);
        Lateral_C = (EditText) findViewById(R.id.lateral2);
        Perimetro = (Button) findViewById(R.id.perimetro);
        Area = (Button) findViewById(R.id.area);
        Regreso = (Button) findViewById(R.id.regresar);
        rCuadro = (TextView) findViewById(R.id.respuesta);

        Perimetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Resultado, nBase, nA, nC;
                nBase = Integer.parseInt(Base.getText().toString());
                nA = Integer.parseInt(Lateral_A.getText().toString());
                nC = Integer.parseInt(Lateral_C.getText().toString());
                    Resultado = (nBase+nA+nC);
                rCuadro.setText("R//  "+Resultado);
            }
        });
        Area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Resultado, nBase, nAltura;
                nBase = Integer.parseInt(Base.getText().toString());
                nAltura = Integer.parseInt(Altura.getText().toString());
                    Resultado = ((nBase*nAltura)/2);
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
```
