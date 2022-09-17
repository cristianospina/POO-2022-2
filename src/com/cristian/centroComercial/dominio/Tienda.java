package com.cristian.centroComercial.dominio;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private long codigo;
    private String nombre;

    private List<Categoria> categoria;

    public Tienda (){this.categoria = new ArrayList<>();}



    public Tienda(long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
