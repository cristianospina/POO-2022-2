package com.cristian.centroComercial.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CentroComercial {
    public static final byte CAPACIDAD = 100;
    private String nombre;
    private String tiendasConMasDeDosCategoria;
    private List<Tienda> tienda;

    public CentroComercial (){this.tienda = new ArrayList<>();}
    
    public boolean abrirTienda(long codigo, String nombre){
        Tienda nuevaTienda = new Tienda(codigo, nombre);
        if ((this.tienda.size() + 1 <= CAPACIDAD) && buscarTienda() == codigo){
            this.tienda.add(nuevaTienda);
        }
        return false;
    }

    public void cerrarTienda(long codigo){

    }

    public Tienda buscarTienda(String nombre){
        Tienda buscarTiendasPorNombre = this.tienda.stream()
                .filter(tienda -> tienda.getNombre() == nombre)
                .findFirst().orElse(null);
        if (buscarTiendasPorNombre != null){
            return buscarTiendasPorNombre;
        }
        else {
            return null;
        }
    }
    public Tienda buscarTienda(long codigo){
        Tienda buscarTiendaPorCodigo = this.tienda.stream()
                .filter(tienda -> tienda.getCodigo() == codigo)
                .findFirst().orElse(null);
        if (buscarTiendaPorCodigo != null){
            return buscarTiendaPorCodigo;
        }
        else {
            return null;
        }
    }

    public List<Tienda> buscarTiendas(String categoria){
        List<Tienda> buscarTeindasPorCategoria = (List<Tienda>) this.tienda.stream()
                .filter(tienda -> tienda.getClass() == categoria)
                .findFirst().orElse(null);
        if (buscarTeindasPorCategoria != null){
            return buscarTeindasPorCategoria
        }

        return null;
    }

    public void ordenarTiendasPorNombre(){
        this.tienda.sort(Comparator.comparing(Tienda::getNombre));
    }

    public String getTiendasConMasDeDosCategoria() {
        return tiendasConMasDeDosCategoria;
    }

}
