package com.brianvp.ejemplonavswipe.Clases;

/**
 * Created by IBVP on 05/11/2018.
 */

public class Personaje {
    String nombre,descripcion;
    int foto;
    public Personaje(){

    }

    public Personaje(String nombre, String descripcion, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
