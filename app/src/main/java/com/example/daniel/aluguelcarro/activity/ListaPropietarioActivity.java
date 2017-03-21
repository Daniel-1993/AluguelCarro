package com.example.daniel.aluguelcarro.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.daniel.aluguelcarro.R;
import com.example.daniel.aluguelcarro.adapter.PropietarioAdapter;
import com.example.daniel.aluguelcarro.models.Propietario;

import java.util.ArrayList;

public class ListaPropietarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_propietario);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListaPropietarioActivity.this, CadastroPropietarioActivity.class);
                intent.putExtra("id", 0);
                startActivity(intent);
            }
        });
    }


        protected void onResume()
        {
            super.onResume();
            ListView listaProprietario = (ListView) findViewById(R.id.lvProprietario);

            final ArrayList<Propietario> prop = (ArrayList<Propietario>)
                    Propietario.listAll(Propietario.class);

            ArrayAdapter adapter = new PropietarioAdapter(this, prop);
            listaProprietario.setAdapter(adapter);

            listaProprietario.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(ListaPropietarioActivity.this, CadastroPropietarioActivity.class);
                    intent.putExtra("id", prop.get(i).getId().intValue());
                    intent.putExtra("nome", prop.get(i).getNomePropietario());
                    intent.putExtra("endereco", prop.get(i).getEndereco());
                    intent.putExtra("telefone", prop.get(i).getTelefone());
                    intent.putExtra("data", prop.get(i).getData());

                    startActivity(intent);

                }
            });
        }

    }


    







