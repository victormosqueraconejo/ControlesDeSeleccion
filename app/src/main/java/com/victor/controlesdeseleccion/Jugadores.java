package com.victor.controlesdeseleccion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Jugadores extends AppCompatActivity {

    TextView nombreJugador;
    TextView descripcionJugador;
    ImageView imagenJugador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jugadores);

        nombreJugador = findViewById(R.id.nombreJugador);
        descripcionJugador = findViewById(R.id.descripcionJugador);
        imagenJugador = findViewById(R.id.imagenJugador);

        switch (MainActivity.valorPresionadoJugadores) {
            case 0:

                nombreJugador.setText("Falcao");
                descripcionJugador.setText(R.string.descripcion_falcao);
                imagenJugador.setImageResource(R.drawable.jugador1_falcao);

                break;
            case 1:
                nombreJugador.setText("James Rodriguez");
                descripcionJugador.setText(R.string.descripcion_james);
                imagenJugador.setImageResource(R.drawable.jugador2_james);
                break;
            case 2:
                nombreJugador.setText("Cuadrado");
                descripcionJugador.setText(R.string.descripcion_cuadrado);
                imagenJugador.setImageResource(R.drawable.jugador3__cuadrado);
                break;

        }


    }
}