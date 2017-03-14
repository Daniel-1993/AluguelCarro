package com.example.daniel.aluguelcarro.models;

import com.orm.SugarRecord;

/**
 * Created by daniel on 13/03/17.
 */
public class Propietario extends SugarRecord {
    private String nomePropietario;
    private String endereco;
    private String telefone;
    private String data;

    public Propietario(){

    }

    public Propietario(String nomePropietario, String endereco, String telefone, String data){
        this.nomePropietario = nomePropietario;
        this.endereco = endereco;
        this.telefone = telefone;
        this.data = data;

    }

    public String getNomePropietario() {
        return nomePropietario;
    }

    public void setNomePropietario(String nomePropietario) {
        this.nomePropietario = nomePropietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
