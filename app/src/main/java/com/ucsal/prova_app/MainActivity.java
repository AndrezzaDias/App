package com.ucsal.prova_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

public class MainActivity extends AppCompatActivity {
    private EditText textNro1;
    private EditText textNro2;

     private Button dividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNro1 = findViewById(R.id.txtNro1);
        textNro2 = findViewById(R.id.txtNro2);

        dividir = findViewById(R.id.btDividir);

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Double.parseDouble(textNro1.getText().toString());
                double valor2 = Double.parseDouble(textNro2.getText().toString());

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("Valor1", valor1);
                intent.putExtra("Valor2", valor2);

                startActivity(intent);
            }
        });





    }

}