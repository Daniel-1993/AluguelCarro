package com.example.daniel.aluguelcarro.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daniel.aluguelcarro.R;
import com.example.daniel.aluguelcarro.models.Propietario;

public class CadastroPropietarioActivity extends AppCompatActivity {
    EditText idPropietario, idEndereco, idTelefone, idData;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_propietario);

        idPropietario = (EditText) findViewById(R.id.idPropietario);
        idEndereco = (EditText) findViewById(R.id.idEndereco);
        idTelefone = (EditText) findViewById(R.id.idTelefone);
        idData = (EditText) findViewById(R.id.idData);


        btnSalvar = (Button) findViewById(R.id.btnSalvar);


        btnSalvar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvar();
            }
        });
    }
    public void salvar() {
        Propietario p = new Propietario(idPropietario.getText().toString(), idEndereco.getText().toString(), idTelefone.getText().toString(), idData.getText().toString());
        p.save();
        Toast.makeText(this, "Local Cadastrado", Toast.LENGTH_LONG).show();
        this.finish();
    }
}
