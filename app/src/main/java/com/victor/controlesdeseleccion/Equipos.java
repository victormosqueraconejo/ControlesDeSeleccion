package com.victor.controlesdeseleccion;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Equipos extends AppCompatActivity {

    TextView nombreEquipo;
    TextView descripcionEquipos;
    ImageView logoEquipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_equipos);

        nombreEquipo = findViewById(R.id.nombreEquipo);
        descripcionEquipos = findViewById(R.id.descripcionEquipos);
        logoEquipos = findViewById(R.id.logo_equipos);

        switch (MainActivity.valorPresionadoEquipos) {
            case 1:
                nombreEquipo.setText("Barcelona");
                logoEquipos.setImageResource(R.drawable.equipo1_barcelona);

                descripcionEquipos.setText(R.string.descripcion_barcelona);
                break;

            case 2:
                nombreEquipo.setText("Real Madrid");
                logoEquipos.setImageResource(R.drawable.equipo2_realmadrid);
                descripcionEquipos.setText(R.string.descripcion_realmadrid);
                break;
            case 3:
                nombreEquipo.setText("Magallanes");
                logoEquipos.setImageResource(R.drawable.equipo3_magallanes);
                descripcionEquipos.setText(R.string.descripcion_magalanes);
                break;

        }

    }
}