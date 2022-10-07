package com.cristian.trasporte.dominio;

public class Bicicleta extends Vehiculo{
    private double cadencia;
    private double talla;

    public Bicicleta(long serial, String marca) {
        super(serial, marca);
    }

    @Override
    public void acelerar() {
        super.acelerar();
    }

    public double getCadencia() {
        return cadencia;
    }

    public double getTalla() {
        return talla;
    }
}
