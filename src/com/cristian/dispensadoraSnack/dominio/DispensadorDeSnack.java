package com.cristian.dispensadoraSnack.dominio;

import java.util.ArrayList;
import java.util.List;

public class DispensadorDeSnack {

    private List<Snack> snacks;
    private long cantidadActual;
    private int capacidad = 12;

    public DispensadorDeSnack(){ this.snacks = new ArrayList<>();}



    public void agregar(String nombre, String codigo, long valor){
        
    }

    public void retirarSnackPorCodigo(String codigo){

    }

    public void retirarSnackPorNombre(String nombre){

    }

    public void aumentarSnack(String codigo){

    }

    public void quitarSnack(String codigo){

    }

    public Snack cantidadSnack(String codigo){

        return null;
    }

    public List<Snack> sanckAgotados(){

        return null;
    }

    public List<Snack> snackDisponible(){

        return null;
    }

    public void SnackOrdenadoPrecio(){

    }

    public void snackOrdenadoCantidad(){

    }

    private Snack buscarSnackPorCodigo(String codigo){

        return null;
    }

    private void listaDeSnacks(){

    }

}
