package com.example.guia3u4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView Listado;
    String [][] Paises_Nombres = {
            {"Guatemala", "Guatemala"},
            {"Belice", "Belmopan"},
            {"El Salvador", "San Salvador"},
            {"Honduras", "Tegucigalpa"},
            {"Nicaragua", "Managua"},
            {"Costa Rica", "San Jose"},
            {"Panama", "Panama"}
    };
    int [] Banderas_Imgs = {
            R.drawable.guatemala,
            R.drawable.belice,
            R.drawable.el_salvador,
            R.drawable.honduras,
            R.drawable.nicaragua,
            R.drawable.costa_rica,
            R.drawable.panama
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Listado = findViewById(R.id.Listado);
        Adapter adaptador = new Adapter(this, Paises_Nombres, Banderas_Imgs);
        Listado.setAdapter(adaptador);

        Listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pais = Paises_Nombres[i][0];
                String capital = Paises_Nombres[i][1];

                String msg = "Pais: "+pais+"\nCapital: "+capital+"\nPosicion en Lista: "+(i+1);
                Toast.makeText(getApplication(), msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
