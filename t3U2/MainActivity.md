## <img src="https://i.ibb.co/VSvC7pw/support-emoji-3.png" height="30"> Configuracion del `activity_main`
```java
package com.example.guia3u2;

import androidx.appcompat.app.AppCompatActivity;

/* Importaciones */

public class MainActivity extends AppCompatActivity {

    Button Rectangulo, Triangulo, Circulo;
    Intent Cambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rectangulo = (Button) findViewById(R.id.square);
        Triangulo  = (Button) findViewById(R.id.triangle);
        Circulo    = (Button) findViewById(R.id.circle);

        Rectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cambio = new Intent(getApplication(), square.class);
                startActivity(Cambio);
            }
        });
        Triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cambio = new Intent(getApplication(), triangle.class);
                startActivity(Cambio);
            }
        });
        Circulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cambio = new Intent(getApplication(), circle.class);
                startActivity(Cambio);
            }
        });
    }
}
```
