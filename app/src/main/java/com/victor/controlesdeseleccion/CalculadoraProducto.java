package com.victor.controlesdeseleccion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class CalculadoraProducto extends AppCompatActivity {

    Button btnCalcular;
    CheckBox chDescuento;
    RadioGroup rgProducto;
    RadioButton rbTelevisor, rbRadio;

    TextView textValorProducto, valorDescuento;
    TextView textValorFinal;
    DecimalFormat formato = new DecimalFormat("0.0");
    String mostrarValor;
    double valor = 0;
    double nuevoValor;
    double valorFinal = valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculadora_producto);

        btnCalcular = findViewById(R.id.btnCalcular);
        chDescuento = findViewById(R.id.chDescuento);
        rgProducto = findViewById(R.id.rgProducto);
        rbTelevisor = findViewById(R.id.rdTelevisor);
        rbRadio = findViewById(R.id.rdRadio);
        textValorProducto = findViewById(R.id.textValorProducto);
        textValorFinal = findViewById(R.id.textValorFinal);
        valorDescuento = findViewById(R.id.textValorDescuento);


        rgProducto.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rdTelevisor) {
                    valor = 100000;
                    mostrarValor = formato.format(valor);
                    textValorProducto.setText(mostrarValor);

                }
                else if (checkedId == R.id.rdRadio) {
                    valor = 50000;
                    mostrarValor = formato.format(valor);
                    textValorProducto.setText(mostrarValor);
                }
            }

        });

        chDescuento.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                valorDescuento.setText("0.0");
                if (isChecked) {
                    nuevoValor = valor * 0.1;

                    mostrarValor = formato.format(nuevoValor);
                    valorDescuento.setText(mostrarValor);
                }

            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorFinal = valor - nuevoValor;
                mostrarValor = formato.format(valorFinal);
                textValorFinal.setText(mostrarValor);
            }
        });

    }
}