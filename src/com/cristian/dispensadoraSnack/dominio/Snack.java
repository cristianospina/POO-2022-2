package com.cristian.dispensadoraSnack.dominio;

public class Snack {
    private String nombre;
    private String codigo;
    private long valor;
    private long cantidad;

    public Snack(String nombre, String codigo, long valor, long cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public long getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setValor() {
        this.valor = valor;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

}