package com.example.daniel.aluguelcarro.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.daniel.aluguelcarro.R;
import com.example.daniel.aluguelcarro.models.Propietario;

import java.util.ArrayList;

/**
 * Created by daniel on 20/03/17.
 */
public class PropietarioAdapter extends ArrayAdapter<Propietario> {
    private final Context context;
    private final ArrayList<Propietario> listaProprietarios;


    public PropietarioAdapter(Context context, ArrayList<Propietario> listaPropietarios) {
        super(context, R.layout.linhaproprietario, listaPropietarios);
        this.context = context;
        this.listaProprietarios = listaPropietarios;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linhaproprietario, parent, false);
        TextView nome = (TextView) rowView.findViewById(R.id.pNome);
        TextView endereco = (TextView) rowView.findViewById(R.id.pEndereco);
        TextView telefone = (TextView) rowView.findViewById(R.id.pTelefone);
        TextView data = (TextView) rowView.findViewById(R.id.pData);
        nome.setText(listaProprietarios.get(position).getNomePropietario());
        endereco.setText(listaProprietarios.get(position).getEndereco());
        telefone.setText(listaProprietarios.get(position).getTelefone());
        data.setText(listaProprietarios.get(position).getData());
        return rowView;
    }
}
