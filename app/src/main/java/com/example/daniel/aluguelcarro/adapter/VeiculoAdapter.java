package com.example.daniel.aluguelcarro.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.daniel.aluguelcarro.R;
import com.example.daniel.aluguelcarro.activity.ListaVeiculoActivity;
import com.example.daniel.aluguelcarro.models.Propietario;
import com.example.daniel.aluguelcarro.models.Veiculo;

import java.util.ArrayList;

/**
 * Created by daniel on 21/03/17.
 */
public class VeiculoAdapter extends ArrayAdapter<Veiculo> {
    private final Context context;
    private final ArrayList<Veiculo> listaVeiculos;

    public VeiculoAdapter(Context context, ArrayList<Veiculo> listaVeiculos) {
        super(context, R.layout.linhaveiculo, listaVeiculos);
        this.context = context;
        this.listaVeiculos = listaVeiculos;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linhaveiculo, parent, false);
        TextView placa = (TextView) rowView.findViewById(R.id.tvPlaca);
        TextView modelo = (TextView) rowView.findViewById(R.id.tvModelo);
        TextView ano = (TextView) rowView.findViewById(R.id.tvAno);
        TextView proprietario = (TextView) rowView.findViewById(R.id.tvPropietario);
        placa.setText(listaVeiculos.get(position).getPlaca());
        modelo.setText(listaVeiculos.get(position).getModelo());
        ano.setText(listaVeiculos.get(position).getAno());
        proprietario.setText(listaVeiculos.get(position).getPropietario().getNomePropietario());
        return rowView;
    }
}
