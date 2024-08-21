package com.fithelper;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RutinaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_detail);

        TextView nombreRutina = findViewById(R.id.nombreRutina);
        TextView descripcionRutina = findViewById(R.id.descripcionRutina);

        String nombre = getIntent().getStringExtra("nombreRutina");
        String descripcion = getIntent().getStringExtra("descripcionRutina");

        nombreRutina.setText(nombre);
        descripcionRutina.setText(descripcion);
    }
}
