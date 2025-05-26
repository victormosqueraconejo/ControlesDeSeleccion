package com.victor.controlesdeseleccion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.net.InetSocketAddress;

public class MainActivity extends AppCompatActivity {

    public static int valorPresionadoEquipos;
    public static int valorPresionadoJugadores;

    ListView lvJugadores;
    Spinner spEquipos;

    String [] jugadores = {"Falcao", "James Rodriguez", "Juan Cuadrado", "RadioGroup Actividad", "Calculadora Productos"};
    String [] equipos = {"Seleccionar Equipo","Barcelona", "Real Madrid", "Magallanes"};

    ArrayAdapter jugadoresAdaptador;
    ArrayAdapter equiposAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvJugadores = findViewById(R.id.lvJugadores);
        spEquipos = findViewById(R.id.spEquipos);

        jugadoresAdaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, jugadores);
        equiposAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, equipos);


        lvJugadores.setAdapter(jugadoresAdaptador);
        spEquipos.setAdapter(equiposAdapter);

        spEquipos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                valorPresionadoEquipos = position;
                    if (position >  0) {
                        Intent irEquipos = new Intent(MainActivity.this, Equipos.class);
                        startActivity(irEquipos);
                    }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        lvJugadores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                valorPresionadoJugadores = position;
                if (position > 0 && position <= 2) {
                    Intent vistaJugadores = new Intent(MainActivity.this, Jugadores.class);
                    startActivity(vistaJugadores);
                } else if (position == 3) {
                    Intent vistaJugadores = new Intent(MainActivity.this, RadioGroup.class);
                    startActivity(vistaJugadores);
                }
                else if (position == 4 ) {
                    Intent vistaJugadores = new Intent(MainActivity.this, CalculadoraProducto.class);
                    startActivity(vistaJugadores);
                }

            }
        });

    }
}