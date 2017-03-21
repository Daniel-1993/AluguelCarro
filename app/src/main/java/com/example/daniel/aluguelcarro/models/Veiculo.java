package com.example.daniel.aluguelcarro.models;

import android.os.Parcelable;

import com.orm.SugarRecord;

/**
 * Created by daniel on 20/03/17.
 */
public class Veiculo extends SugarRecord  {
    private String placa;
    private String modelo;
    private String ano;
    private Propietario propietario;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Veiculo(String placa, String modelo, String ano, Propietario propietario){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.propietario = propietario;
    }

    public Veiculo(){

    }


}
