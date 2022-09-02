package com.cristian.dispensadoraSnack.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DispensadorDeSnack {
    private List<Snack> snacks;
    private long cantidadActual;
    private int capacidad = 12;

    public DispensadorDeSnack() {
        this.snacks = new ArrayList<>();
    }

    public void agregar(String nombre, String codigo, long valor) {
        Snack snackAAgregar = new Snack(nombre, codigo, valor);
        if ((this.snacks.size() + 1) <= this.capacidad){
            this.snacks.add(snackAAgregar);
        } else {
            System.out.println("No se pueden agregar mas snacks, Has excedido el limite.");
        }
    }

    public void retirarSnackPorCodigo(String codigo) {
        Snack snackARetirar = buscarSnackPorCodigo(codigo);
        if ((snackARetirar != null)&&(snackARetirar.getCantidad()>0)) {
            this.cantidadActual = snackARetirar.getCantidad()-1;
            snackARetirar.setCantidad(this.cantidadActual);
            System.out.println("El snack "+ snackARetirar.getNombre() + " ha sido retirado");
            System.out.println("Quedan: " + snackARetirar.getCantidad());
        }
        else if ((snackARetirar != null)&&(snackARetirar.getCantidad()==0)){
            System.out.println("El snack se encuentra agotado.");
        }
        else {
            System.out.println("No se ha podido retirar el snack, el snack no existe.");
        }
    }

    public void retirarSnackPorNombre(String nombre) {
        Snack snackARetirar = this.snacks.stream()
                .filter(snackName -> snackName.getNombre().equalsIgnoreCase(nombre))
                .findFirst().orElse(null);
        if ((snackARetirar != null)&&(snackARetirar.getCantidad()>0)){
            this.cantidadActual = snackARetirar.getCantidad()-1;
            snackARetirar.setCantidad(this.cantidadActual);
            System.out.println("El snack " + snackARetirar.getNombre() + " ha sido retirado");
            System.out.println("Quedan: " +snackARetirar.getCantidad());
        }
        else if ((snackARetirar != null)&&(snackARetirar.getCantidad()==0)) {
            System.out.println("El snack no esta disponible.");
        }
        else {
            System.out.println("El snack no existe, no ah sido retirado.");
        }
    }

    public void aumentarSnack(String codigo, long cantidadAAumentar) {
        Snack snackAumentado = buscarSnackPorCodigo(codigo);
        if ((snackAumentado != null)&&(snackAumentado.getCantidad()<6)){
            this.cantidadActual = snackAumentado.getCantidad() + cantidadAAumentar;
            if (this.cantidadActual <= 6) {
                snackAumentado.setCantidad(this.cantidadActual);
                System.out.println("El snack "+snackAumentado.getNombre() + "ha sido abastecido en "
                        + cantidadAAumentar + " unidades");
            }
            else {
                System.out.println("No se ha abastecido, ha excedido la cantidad permitida.");
            }
        } else {
            System.out.println("No se ha abastecido, el snack no existe.");
        }
    }

    public void quitarSnack(String codigo) {
        Snack snackAQuitar = buscarSnackPorCodigo(codigo);
        if (snackAQuitar != null) {
            this.snacks.remove(snackAQuitar);
            System.out.println("Se ha quitado el snack " + snackAQuitar.getNombre());
        } else {
            System.out.println("No se ha quitado, el snack no existe.");
        }
    }

    public Snack cantidadSnack(String codigo) {
        Snack cantidadSnack = buscarSnackPorCodigo(codigo);
        if ((cantidadSnack != null)&&(cantidadSnack.getCantidad()>0)){
            System.out.println("Quedan: " +cantidadSnack.getCantidad() + " unidades del snack " +cantidadSnack.getNombre());
            return cantidadSnack;
        } else {
            System.out.println("El snack no existe en la maquina, Se encuentra agotado.");
            return null;
        }
    }

    public List<Snack> snackAgotados() {
        List<Snack> snackAgotados = this.snacks.stream()
                .filter(snack -> snack.getCantidad()==0)
                .collect(Collectors.toList());
        if (snackAgotados != null) {
            System.out.println("Snacks agotados: ");
            snackAgotados.forEach(snackD -> System.out.println(snackD.getNombre()+" --> "+snackD.getValor()));
            return snackAgotados;
        } else {
            System.out.println("No hay ningun snack agotado.");
            return null;
        }
    }

    public List<Snack> snackDisponibles() {
        List<Snack> snackDisponibles = this.snacks.stream()
                .filter(snack -> snack.getCantidad()>0)
                .collect(Collectors.toList());
        if (snackDisponibles != null) {
            System.out.println("Snacks disponibles: ");
            snackDisponibles.forEach(snackD -> System.out.println(snackD.getNombre()+" --> "+snackD.getValor()));
            return snackDisponibles;
        } else {
            System.out.println("No queda ningun snack.");
            return null;
        }
    }

    public void snackOrdenadoPrecio () {
        this.snacks.sort(Comparator.comparing(Snack::getValor).reversed());
        this.listaDeSnacks();
    }

    public void snackOrdenadoCantidad () {
        this.snacks.sort(Comparator.comparing(Snack::getCantidad));
        this.listaDeSnacks();
    }

    private Snack buscarSnackPorCodigo(String codigo) {
        Snack snackCodigo = this.snacks.stream()
                .filter(snackCod -> snackCod.getCodigo().equalsIgnoreCase(codigo))
                .findFirst().orElse(null);
        if (snackCodigo != null) {
            return snackCodigo;
        } else {
            return null;
        }
    }

    private void listaDeSnacks () {
        this.snacks.forEach(snack -> System.out.println(snack.getNombre() + " "
                + snack.getCodigo() + " --> " + snack.getValor() + " cantidad: " + snack.getCantidad()));
    }



}