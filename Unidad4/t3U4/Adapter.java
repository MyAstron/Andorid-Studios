package com.example.guia3u4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
    Context context;
    String [][] data;
    int imgs[];

    private static LayoutInflater inflater=null;
    public Adapter(Context context, String [][] data, int [] imgs){
        this.context=context;
        this.data=data;
        this.imgs=imgs;

        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View Vista = inflater.inflate(R.layout.activity_muestra, null);

        TextView Pais = Vista.findViewById(R.id.Pais);
        TextView Capital = Vista.findViewById(R.id.Capital);
        ImageView Bandera = Vista.findViewById(R.id.Bandera);

        Pais.setText(data[position][0]);
        Capital.setText(data[position][1]);
        Bandera.setImageResource(imgs[position]);
        return Vista;
    }

    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
