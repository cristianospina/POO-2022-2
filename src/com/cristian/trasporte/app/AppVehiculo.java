package com.cristian.trasporte.app;

import com.cristian.trasporte.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class AppVehiculo {
    public static void main(String[] args) {

        List<Bicicleta> bicicletas = new ArrayList<>();
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new BicicletaMTB());
        vehiculos.add(new Bicicleta());
        vehiculos.add(new BiciRuta());
        vehiculos.add(new Vehiculo());
        vehiculos.add(new Taxi());

        vehiculos.forEach(System.out::println);
    }
}
