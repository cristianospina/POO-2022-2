package com.cristian.concesionario.dominio;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {

    private static final int CAPACIDAD_TOTAL = 15;
    private String nombre;
    private int capacidadActual;
    private List<Moto> moto;

    public Concesionario (){this.moto = new ArrayList<>();}

    public Concesionario(String nombre) {
        this.nombre = nombre;
    }

    public boolean ingresarMoto(long serial, String marca,int precio, int cilindraje, boolean esNueva){
        Moto motoIngresada = new Moto(serial, marca, precio, cilindraje, esNueva);
        if ((this.moto.size() + 1) <= this.capacidadActual){
            this.moto.add(motoIngresada);
        }
        else {
            return motoIngresada.isEsNueva();
        }

        return false;
    }

//    public boolean ingresarMoto(long serial, String marca,int precio, int cilindraje, boolean esNueva){
        //if (this.buscar(moto.toString()) == null && this.moto.size() < CAPACIDAD_TOTAL){
      //      Moto motoAIngresar = new Moto(serial, marca, precio, cilindraje, esNueva);
    //        this.moto.add(motoAIngresar);
  //      }
//
//        return false;
//    }

    public Moto buscar(long serial){
        Moto buscarSerial = this.moto.stream()
                .filter(moto -> moto.getSerial() == serial)
                .findFirst().orElse(null);
        if (buscarSerial != null) {

            return buscarSerial;
        }
        else {
            return null;
        }
    }

    public List<Moto> buscar(String marca){
        List<Moto> buscarMarca = (List<Moto>) this.moto.stream()
                .filter(moto -> moto.getMarca() == marca)
                .findFirst().orElse(null);
        if (buscarMarca != null) {
            return buscarMarca;
        }
        else {
            return null;
        }
    }

    public List<Moto> buscar(Boolean soloNuevas){
        List<Moto> buscarSoloNuevas = (List<Moto>) this.moto.stream()
                .filter(moto -> moto.isEsNueva() == soloNuevas)
                .findFirst().orElse(null);
        if (buscarSoloNuevas != null){
            return buscarSoloNuevas;
        }
        else {
            return null;
        }
    }

    public List<Moto> buscarQueTengaMasDe(int cilindraje){
        List<Moto> buscarQueTengaMasDe = (List<Moto>) this.moto.stream()
                .filter(moto -> moto.getCilindraje() == cilindraje)
                .findFirst().orElse(null);
        if (buscarQueTengaMasDe != null){
            return buscarQueTengaMasDe;
        }
        else {
            return null;
        }
    }

    public Moto vender(long serial){
        Moto motoAVender = buscar(serial);;
        if (motoAVender != null){
            this.moto.remove(motoAVender);
        }
        return motoAVender;

    }

    public int getCapacidadActual() {
        return capacidadActual;
    }
}









