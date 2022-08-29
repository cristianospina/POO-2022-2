package com.cristian.agendaTelefonica.dominio;

public class Contacto {
    private String nombre;
    private String apellidp;
    private long celular;

    public Contacto(String nombre, String apellidp, long celular) {
        this.nombre = nombre;
        this.apellidp = apellidp;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidp() {
        return apellidp;
    }

    public void setApellidp(String apellidp) {
        this.apellidp = apellidp;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }
}
