package com.cristian.trasporte.dominio;

public class Carro extends Vehiculo{
    protected String placa;
    protected String tipoCaja;

    public Carro(long serial, String marca, String placa) {
        super(serial, marca);
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }
}
