package com.example.guia2u2;

import androidx.appcompat.app.AppCompatActivity;

/*  Importaciones  */

public class MainActivity extends AppCompatActivity {
    EditText c, i, t;
    Button Alumno, Calulo;
    TextView Texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c = (EditText) findViewById(R.id.Capital);
        i = (EditText) findViewById(R.id.Intereses);
        t = (EditText) findViewById(R.id.Tiempo);
        Alumno = (Button) findViewById(R.id.btnAlumno);
        Calulo = (Button) findViewById(R.id.btnCalcular);
        Texto = (TextView) findViewById(R.id.CapitalProducido);

        Alumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Datos = new Intent(getApplication(), Alumno.class);
                startActivity(Datos);
            }
        });
        Calulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operacion();
            }
        });

    }
    private void Operacion() {
        double capital, interes, tiempo;
        double reslutado;
        capital = Integer.parseInt(c.getText().toString());
        interes = Integer.parseInt(i.getText().toString());
        tiempo = Integer.parseInt(t.getText().toString());

        reslutado = capital*(interes/100)*tiempo;
        Texto.setText("Q."+reslutado);


    }
}
