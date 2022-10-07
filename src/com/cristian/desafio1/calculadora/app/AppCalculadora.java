package com.cristian.desafio1.calculadora.app;


import com.cristian.desafio1.calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppCalculadora {
    public static final String TITULO = "Calculadora";
    public static final JCheckBox checkBox = new JCheckBox("Redondear");
    public static final int CERRAR = -1;
    public static final int SUMAR = 0;
    public static final int RESTAR = 1;
    public static final int MULTIPLICAR = 2;
    public static final int DIVIDIR = 3;

    public static void main(String[] args) {
        while (true) {
            int operacionElegida = JOptionPane.showOptionDialog(null,
                    "Que quieres hacer?",TITULO, JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, Arrays.asList("Sumar", "Restar",
                            "Multiplicar", "Dividir", checkBox).toArray(), "Sumar");
            if (operacionElegida == CERRAR) {
                System.exit(0);
            }

            List<Double> numerosAOperar = new ArrayList<>();
            double numeroIngresado = 0;
            double resultado = 0;
            boolean pudoCastear;
            int ingresoOtro;

            do{
                do {
                    try {
                        numeroIngresado = Double.parseDouble(JOptionPane
                                .showInputDialog("Ingrese un numero"));
                        if (numeroIngresado == CERRAR) {
                            System.exit(0);
                        }
                        pudoCastear = true;
                        numerosAOperar.add(numeroIngresado);
                    } catch (NumberFormatException e) {
                        pudoCastear = false;
                    }
                } while (!pudoCastear);
                ingresoOtro = JOptionPane.showConfirmDialog(null,"Desea ingresar otro numero?", TITULO, JOptionPane.YES_NO_OPTION);
                if (ingresoOtro == CERRAR) {
                    System.exit(0);
                }
            } while (ingresoOtro == 0);

            if (operacionElegida == SUMAR) {
                resultado = Calculadora.sumar(numerosAOperar, checkBox.isSelected());
                mostrarMensaje(numerosAOperar, resultado, "Suma");
            } else if (operacionElegida == RESTAR) {
                resultado = Calculadora.restar(numerosAOperar, checkBox.isSelected());
                mostrarMensaje(numerosAOperar, resultado, "Resta");
            } else if (operacionElegida == MULTIPLICAR) {
                resultado = Calculadora.multiplicar(numerosAOperar, checkBox.isSelected());
                mostrarMensaje(numerosAOperar, resultado, "Multiplicacion");
            } else if (operacionElegida == DIVIDIR) {
                resultado = Calculadora.dividir(numerosAOperar, checkBox.isSelected());
                mostrarMensaje(numerosAOperar, resultado, "Division");
            }
        }
    }

    public static void mostrarMensaje(List numerosAOperar, double resultado, String operacionActual) {
        JOptionPane.showMessageDialog(null, numerosAOperar + " = "
                + resultado, operacionActual, 1, null);
    }
}
