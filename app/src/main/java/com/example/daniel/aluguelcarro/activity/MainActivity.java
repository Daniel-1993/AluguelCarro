package com.example.daniel.aluguelcarro.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.example.daniel.aluguelcarro.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnListaPropietario = (Button) findViewById(R.id.btnlistaPropietario);
        Button btnListaVeiculo = (Button) findViewById(R.id.btnListaveiculo);

        btnListaPropietario.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListaPropietarioActivity.class);
                startActivity(intent);

            }
        });


        btnListaVeiculo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListaVeiculoActivity.class);
                startActivity(intent);

            }
        });

    }
}
