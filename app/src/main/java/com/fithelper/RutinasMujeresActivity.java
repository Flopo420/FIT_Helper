package com.fithelper;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class RutinasMujeresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutinas_mujeres);

        Button btnRutina1 = findViewById(R.id.btnRutina1);

        btnRutina1.setOnClickListener(v -> {
            Intent intent = new Intent(RutinasMujeresActivity.this, RutinaDetailActivity.class);
            intent.putExtra("nombreRutina", getString(R.string.rutina_1));
            intent.putExtra("descripcionRutina", getString(R.string.desc_rutina_1));
            startActivity(intent);
        });
    }
}
