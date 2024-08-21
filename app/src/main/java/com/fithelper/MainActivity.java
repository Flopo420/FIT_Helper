package com.fithelper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRutinas = findViewById(R.id.btnRutinas);
        Button btnContactanos = findViewById(R.id.btnContactanos);

        btnRutinas.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SeleccionGeneroActivity.class);
            startActivity(intent);
        });

        btnContactanos.setOnClickListener(v -> {
            String phoneNumber = "+3624170608"; // Reemplazar con el número real
            String message = getString(R.string.contact_message);
            Uri uri = Uri.parse("https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message));
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
    }
}
