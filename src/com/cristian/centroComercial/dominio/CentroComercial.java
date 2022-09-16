package com.cristian.centroComercial.dominio;

import java.util.ArrayList;
import java.util.List;

public class CentroComercial {
    public static final byte CAPACIDAD = 100;
    private String nombre;
    private String tiendasConMasDeDosCategoria;
    private List<Tienda> tienda;

    public CentroComercial (){this.tienda = new ArrayList<>();}
    
    public boolean abrirTienda(long codigo, String nombre){

        return false;
    }

    public void cerrarTienda(long codigo){

    }

    public Tienda buscarTienda(String nombre){

        return null;
    }

    public Tienda buscarTienda(long codigo){

        return null;
    }

    public List<Tienda> buscarTiendas(String categoria){

        return null;
    }


}
