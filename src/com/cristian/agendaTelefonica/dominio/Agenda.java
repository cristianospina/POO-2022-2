package com.cristian.agendaTelefonica.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    private int capacidad = 50;

    public Agenda(){this.contactos = new ArrayList<>();}

    public void agregar(String nombre, String apellido, long celular){


    }

    public void eliminar(long celular){

    }

    public Contacto buscarPorCelularConFulter(long celular){

        return null;
    }

    public void buscarPorApellido(String apellido){

    }

    public List<Contacto> buscarPorNombre(String nombre){

        return null;
    }

    public void editar(long celularViejo, long celularNuevo){

    }
    public void ordenarAlfabeticamente(){

    }

    public Contacto buscarConForEach(long celular){

        return null;
    }

    private void imprimirAgenda(){

    }

    public List<Contacto> getContactos() {
        return contactos;
    }
}
