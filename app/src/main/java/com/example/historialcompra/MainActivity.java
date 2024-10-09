package com.example.historialcompra;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        LinearLayout contenedor = findViewById(R.id.linearLayoutCompras);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        VistaCompra vista1 = new VistaCompra(this);
        vista1.setDatos("Total:", "$9999", "Tienda:", "Soriana Doe", "Fecha", "00 sep 2024");
        vista1.setBotonListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción del botón para vista1
            }
        });

        VistaCompra vista2 = new VistaCompra(this);
        vista2.setDatos("Total:", "$9999", "Tienda:", "Soriana Doe", "Fecha", "00 sep 2024");
        vista2.setBotonListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción del botón para vista1
            }
        });

        VistaCompra vista3 = new VistaCompra(this);
        vista3.setDatos("Total:", "$9999", "Tienda:", "Soriana Doe", "Fecha", "00 sep 2024");
        vista3.setBotonListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción del botón para vista1
            }
        });

        VistaCompra vista4 = new VistaCompra(this);
        vista4.setDatos("Total:", "$9999", "Tienda:", "Soriana Doe", "Fecha", "00 sep 2024");
        vista4.setBotonListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción del botón para vista1
            }
        });
        contenedor.addView(vista1);
        contenedor.addView(vista2);
        contenedor.addView(vista3);
        contenedor.addView(vista4);

    }
}