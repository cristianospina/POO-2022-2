package com.cristian.trasporte.dominio;

public class Vehiculo {
    protected long serial;
    protected String marca;
    protected String modelo;
    protected int capacidad;
    protected String color;
    protected double velocidad;

    public Vehiculo(long serial, String marca) {
        this.serial = serial;
        this.marca = marca;
    }

    public void acelerar(){
        System.out.println("El vehiculo "+ this.marca +" esta acelerando");
    }

    public void frenar(){
        System.out.println("El vehiculo esta frenando");

    }

    public long getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
