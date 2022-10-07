package com.cristian.desafio1.calculadora.dominio;

import java.util.List;

public class Calculadora {
    private static double redondear(boolean redondear, double resultado){
        if (redondear)
            return Math.round(resultado);
        else
            return resultado;
    }

    public static double sumar(List<Double> numerosAOperar, boolean redondear){
        double resultado = numerosAOperar.stream().mapToDouble(n -> n).sum();
        return redondear(redondear, resultado);
    }

    public static double restar(List<Double> numerosAOperar, boolean redondear){
        double resultado = numerosAOperar.stream().mapToDouble(nro -> nro)
                .reduce((left, right) -> left - right).getAsDouble();
        return redondear(redondear, resultado);
    }

    public static double multiplicar(List<Double> numerosAOperar, boolean redondear){
        double resultado = numerosAOperar.get(0);
        for (int i = 1; i < numerosAOperar.size(); i++)
            resultado = resultado * numerosAOperar.get(i);
        return redondear(redondear, resultado);
    }

    public static double dividir(List<Double> numerosAOperar, boolean redondear){
        double resultado = numerosAOperar.get(0);
        for (int i = 1; i < numerosAOperar.size(); i++) {
            resultado = resultado/numerosAOperar.get(i);
        }
        return redondear(redondear, resultado);
    }
}