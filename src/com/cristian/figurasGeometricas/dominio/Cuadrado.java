package com.cristian.figurasGeometricas.dominio;

public class Cuadrado extends FigurasGeometricas{
    protected double lado1;
    protected double lado2;

    public Cuadrado(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double perimetro() {
        return (this.lado1 * 2) + (this.lado2 * 2);
    }

    @Override
    public double area() {
        return(this.lado1 * this.lado2);
    }
}
