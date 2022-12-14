package com.cristian.banco.app;

import com.cristian.banco.domino.CuentaBancaria;
import com.cristian.banco.domino.Persona;

public class AppBanco {
    public static void main(String[] args) {
        Persona alfredo = new Persona("Alfredo");
        Persona viviana = new Persona("Viviana", 123);

        CuentaBancaria cuentaAlfredo = new CuentaBancaria(alfredo, "Ahorros", 47853);
        CuentaBancaria cuentaViviana = new CuentaBancaria(viviana, "Ahorros", 78790);


        cuentaAlfredo.consignar(1000000);
        cuentaAlfredo.retirar(500000);
        cuentaAlfredo.transferir(cuentaViviana, 450000);


        System.out.println(cuentaAlfredo.consultarSaldoActual());
        System.out.println(cuentaViviana.consultarSaldoActual());
    }
}