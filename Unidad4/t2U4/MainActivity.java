package com.example.guia2u4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView Lista_Paises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lista_Paises = (ListView) findViewById(R.id.Paises);

        Lista_Paises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String Pais_Seleccionado = Lista_Paises.getItemAtPosition(i).toString();

                Toast.makeText(getApplication(), "Pais Seleccionado: "+Pais_Seleccionado+"\nPosicion del Item: "+(i+1), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
