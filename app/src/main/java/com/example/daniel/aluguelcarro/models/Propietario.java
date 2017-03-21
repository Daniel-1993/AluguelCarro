package com.example.daniel.aluguelcarro.models;

import com.orm.SugarRecord;
import android.database.sqlite.*;
import android.os.Parcel;
import android.os.Parcelable;

import com.orm.SugarApp;

/**
 * Created by daniel on 13/03/17.
 */
public class Propietario extends SugarRecord implements Parcelable{

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

        protected Propietario(Parcel in) {
            nomePropietario = in.readString();
            endereco = in.readString();
            telefone = in.readString();
            data = in.readString();
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(nomePropietario);
            dest.writeString(endereco);
            dest.writeString(telefone);
            dest.writeString(data);

        }

        public static final Creator<Propietario> CREATOR = new Creator<Propietario>() {
            @Override
            public Propietario createFromParcel(Parcel in) {
                return new Propietario(in);
            }

            @Override
            public Propietario[] newArray(int size) {
                return new Propietario[size];
            }
        };

    @Override
    public String toString()
    {
        return nomePropietario;
    }


}

