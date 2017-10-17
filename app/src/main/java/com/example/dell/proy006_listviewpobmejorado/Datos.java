package com.example.dell.proy006_listviewpobmejorado;

import java.io.Serializable;

/**
 * Created by dell on 11/10/2017.
 */

public class Datos implements Serializable{
    private int id;
    private String nombre;
    private String poblacion;
    private String lema;
    private int escudo;
    private int mapa;

    public Datos(int id, String nombre, String poblacion, String lema, int escudo, int mapa) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.lema = lema;
        this.escudo = escudo;
        this.mapa = mapa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getMapa() {
        return mapa;
    }

    public void setMapa(int mapa) {
        this.mapa = mapa;
    }
}
