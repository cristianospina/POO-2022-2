package com.cristian.trasporte.dominio;

public class BicicletaMTB extends Bicicleta{

    private String tipoSuspension;

    public BicicletaMTB(long serial, String marca) {
        super(serial, marca);
    }

    public String getTipoSuspension() {
        return tipoSuspension;
    }

    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }
}
