package com.fithelper;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SeleccionGeneroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_genero);

        Button btnHombres = findViewById(R.id.btnHombres);
        Button btnMujeres = findViewById(R.id.btnMujeres);

        btnHombres.setOnClickListener(v -> {
            Intent intent = new Intent(SeleccionGeneroActivity.this, RutinasHombresActivity.class);
            startActivity(intent);
        });

        btnMujeres.setOnClickListener(v -> {
            Intent intent = new Intent(SeleccionGeneroActivity.this, RutinasMujeresActivity.class);
            startActivity(intent);
        });
    }
}
