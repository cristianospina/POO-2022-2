package com.cristian.trasporte.app;

import com.cristian.trasporte.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class AppVehiculo {
    public static void main(String[] args) {

        List<Bicicleta> bicicletas = new ArrayList<>();
        List<Vehiculo> vehiculos = new ArrayList<>();

        Carro carro = new Carro(444,"BMW","WER789");
        carro.acelerar();


        vehiculos.add(new BicicletaMTB(456,"GW"));
        vehiculos.add(new Bicicleta(789,"SCOOT"));
        vehiculos.add(new BiciRuta(369,"Trek"));
        vehiculos.add(new Vehiculo(123,"Mazda"));
        vehiculos.add(new Taxi(741,"Chevrolet","POI654"));

        vehiculos.forEach(vehi -> vehi.acelerar());
    }
}
