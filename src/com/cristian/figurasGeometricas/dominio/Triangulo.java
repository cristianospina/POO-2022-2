package com.cristian.figurasGeometricas.dominio;

public class Triangulo extends FigurasGeometricas{
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return super.perimetro();
    }

    @Override
    public double area() {
        return((this.base * this.altura) / 2);
    }

}
