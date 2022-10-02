package com.cristian.calculadora.app;

import com.cristian.calculadora.dominio.Calculadora;

import javax.swing.*;

public class AppCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora("casio");

        int opcion = 5;
        while (opcion == 5){
            int opciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion: \n (1) Suma." + "\n (2) Resta. \n (3) Multiplicacion. \n (4) Division. \n (5) Salir. "));
            switch (opciones){
                case 1:

            }
        }


    }
}
