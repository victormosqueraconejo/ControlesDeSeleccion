package com.victor.controlesdeseleccion;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RadioGroup extends AppCompatActivity {

    android.widget.RadioGroup rgGenero;
    RadioButton rbFemenino;
    RadioButton rbMasculino;

    CheckBox chEspanol, chIngles, chChino, chAleman;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_radio_group);

        rgGenero = findViewById(R.id.rgGenero);
        rbMasculino = findViewById(R.id.rbMasculino);
        rbFemenino = findViewById(R.id.rbFemenino);

        chAleman = findViewById(R.id.chAleman);
        chIngles = findViewById(R.id.chIngles);
        chChino = findViewById(R.id.chChino);
        chEspanol = findViewById(R.id.chEspanol);

        rgGenero.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbFemenino) {
                    Toast.makeText(RadioGroup.this, "Femenino", Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == R.id.rbMasculino) {
                    Toast.makeText(RadioGroup.this, "Masculino", Toast.LENGTH_SHORT).show();
                }
            }
        });

        chAleman.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(RadioGroup.this, "Hablas Aleman", Toast.LENGTH_SHORT).show();
                }
            }
        });
        chIngles.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(RadioGroup.this, "Hablas Ingles", Toast.LENGTH_SHORT).show();
                }
            }
        });
        chEspanol.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(RadioGroup.this, "Hablas Español", Toast.LENGTH_SHORT).show();
                }
            }
        });
        chChino.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(RadioGroup.this, "Hablas Chino", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}