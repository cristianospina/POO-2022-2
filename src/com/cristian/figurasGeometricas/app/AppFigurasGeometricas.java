package com.cristian.figurasGeometricas.app;

import com.cristian.figurasGeometricas.dominio.Circulo;
import com.cristian.figurasGeometricas.dominio.Cuadrado;

public class AppFigurasGeometricas {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(10,3);

        System.out.println("El area del cuadrado es: " + cuadrado.area());
        System.out.println("El perimetro del cuadrado es: " +cuadrado.perimetro());

        Circulo circulo = new Circulo(10);
        System.out.println("El perimetro del circulo es: " +circulo.perimetro());
    }

}
