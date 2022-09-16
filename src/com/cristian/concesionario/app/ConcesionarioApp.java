package com.cristian.concesionario.app;

import com.cristian.concesionario.dominio.Concesionario;
import com.cristian.concesionario.dominio.Moto;

public class ConcesionarioApp {
    public static void main(String[] args) {
        Concesionario ingresarMoto = new Concesionario();

        ingresarMoto.ingresarMoto(12345,"Pulsar",8000000,200,true);
        ingresarMoto.ingresarMoto(67890,"Yamaha",5200000,150,true);
        ingresarMoto.ingresarMoto(24680,"Boxer",2500000,100,false);
        ingresarMoto.ingresarMoto(13579,"KTM",16000000,400,true);
        ingresarMoto.ingresarMoto(17283,"AKT",4000000,180,false);

        System.out.println(ingresarMoto);

        ingresarMoto.buscar(12345);
        ingresarMoto.buscar(17283);

        ingresarMoto.buscar("Boxer");
        ingresarMoto.buscar("KTM");

        ingresarMoto.buscar(true);

        ingresarMoto.buscarQueTengaMasDe(180);

        ingresarMoto.vender(13579);
        ingresarMoto.vender(67890);









    }
}
