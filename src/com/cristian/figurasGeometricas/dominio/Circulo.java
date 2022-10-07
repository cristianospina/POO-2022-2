package com.cristian.figurasGeometricas.dominio;

public class Circulo extends FigurasGeometricas{
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return(2 * Math.PI * this.radio);
    }

    @Override
    public double area() {
        return(Math.PI * this.radio);
    }
}
