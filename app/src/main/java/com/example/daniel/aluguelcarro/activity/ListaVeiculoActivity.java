package com.example.daniel.aluguelcarro.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.daniel.aluguelcarro.R;
import com.example.daniel.aluguelcarro.adapter.PropietarioAdapter;
import com.example.daniel.aluguelcarro.adapter.VeiculoAdapter;
import com.example.daniel.aluguelcarro.models.Propietario;
import com.example.daniel.aluguelcarro.models.Veiculo;

import java.util.ArrayList;

public class ListaVeiculoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_veiculo);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListaVeiculoActivity.this, CadastroVeiculoActivity.class);
                intent.putExtra("id", 0);
                startActivity(intent);
            }
        });
    }

    protected void onResume()
    {
        super.onResume();
        ListView listaveiculo = (ListView) findViewById(R.id.lvVeiculo);

        final ArrayList<Veiculo> prop = (ArrayList<Veiculo>)
                Veiculo.listAll(Veiculo.class);

        ArrayAdapter adapter = new VeiculoAdapter(this, prop);
        listaveiculo.setAdapter(adapter);

        listaveiculo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListaVeiculoActivity.this, CadastroVeiculoActivity.class);
                intent.putExtra("id", prop.get(i).getId().intValue());
                intent.putExtra("placa", prop.get(i).getPlaca());
                intent.putExtra("modelo", prop.get(i).getModelo());
                intent.putExtra("ano", prop.get(i).getAno());
                intent.putExtra("proprietario", prop.get(i).getPropietario());

                startActivity(intent);

            }
        });
    }

}
