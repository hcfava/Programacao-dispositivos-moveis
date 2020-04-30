package com.example.aula2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ActivityEx62 extends AppCompatActivity {

    private Spinner spinner;
    String[] namecolors = {"Preto", "Gris", "Cinza", "Vermelho", "Verde", "Azul"};
    String[] colors = {"#000000", "#444444", "#888888", "#FF0000", "#00FF00", "#0000FF"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex62);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter adapter = new MeuArrayAdapter(this, android.R.layout.simple_spinner_item, namecolors);
        spinner.setAdapter(adapter);
    }

    private class MeuArrayAdapter extends ArrayAdapter {

        int resources;

        public MeuArrayAdapter(Context ctx, int item, String[] namecolors) {
            super(ctx, item, namecolors);
            resources = item;
        }

        private View CustomView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(resources, parent, false);

            TextView tv = view.findViewById(android.R.id.text1);
            tv.setText(namecolors[position]);
            tv.setTextColor(Color.WHITE);
            view.setBackgroundColor(Color.parseColor(colors[position]));
            return view;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            return CustomView(position, convertView, parent);
        }

        @Override
        public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            return CustomView(position, convertView, parent);
        }
    }
}
