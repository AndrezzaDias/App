package com.ucsal.prova_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ResultadoActivity extends AppCompatActivity {

    private EditText oResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        oResultado = findViewById(R.id.oResultado);

        double valor1;
        double valor2;

        valor1=getIntent().getDoubleExtra("Valor1", 0);
        valor2 =getIntent().getDoubleExtra("Valor2", 0);

        oResultado.setText(String.valueOf(valor1 / valor2));

    }



}