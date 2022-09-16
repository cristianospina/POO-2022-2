package com.cristian.calculadora.dominio;

public class Calculadora {
    private String marca;

    public Calculadora(String marca) {
        this.marca = marca;
    }

    public static float sumar(float n1, float n2) {
        return n1 + n2;
    }

    public static float sumar(float n1, float n2, float n3) {
        return n1 + n2 + n3;
    }

    public static float restar(float n1, float n2) {
        return n1 - n2;
    }

    public static float restar(float n1, float n2, float n3) {
        return n1 - n2 - n3;
    }

    public static float multi(float n1, int n2, int i) {
        return n1 * n2;
    }

    public static float multi(int n1, int n2) {
        return n1 * n2;
    }

    public static float divi(float n1, float n2) {
        if (n2 != 0) {
            return n1 / n2;
        }
        System.out.println("No podemos dividir por cero: " + n2);
        return n1;
    }

    public static String divi(float n1, float n2, float n3) {
        if (n2 != 0 & n3 != 0) {
            System.out.println(n1 / n2 / n3);
        } else {
            System.out.println("No se puede dividir por cero");
        }
        return null;
    }
}