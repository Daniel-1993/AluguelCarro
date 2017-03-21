package com.example.daniel.aluguelcarro.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daniel.aluguelcarro.R;
import com.example.daniel.aluguelcarro.models.Propietario;
import com.example.daniel.aluguelcarro.models.Veiculo;

import java.util.ArrayList;

public class CadastroVeiculoActivity extends AppCompatActivity {

    EditText placa, modelo, ano;
    Spinner spnPropietario;
    Button btnSalvarVeiculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_veiculo);

        final ArrayList<Propietario> propietarios = (ArrayList) Propietario.listAll(Propietario.class);

        ArrayAdapter<Propietario> adapter = new ArrayAdapter<Propietario>(this, android.R.layout.simple_spinner_item, propietarios);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spnPropietario = (Spinner) findViewById(R.id.spnPropietario);
        spnPropietario.setAdapter(adapter);

        btnSalvarVeiculo = (Button) findViewById(R.id.btnSalvarVeiculo);


        btnSalvarVeiculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Salvar();
            }
        });

    }

    public void Salvar(){
        placa = (EditText) findViewById(R.id.idPlaca);
        modelo = (EditText) findViewById(R.id.idModelo);
        ano = (EditText) findViewById(R.id.idAnoVeiculo);

        Propietario propietario = ((Propietario)spnPropietario.getSelectedItem());

        Veiculo veiculo = new Veiculo(placa.getText().toString(),
                modelo.getText().toString(),
                ano.getText().toString(), propietario);

        veiculo.save();

        Toast.makeText(this,"Veiculo Cadastrado", Toast.LENGTH_LONG).show();
        this.finish();
    }
}
