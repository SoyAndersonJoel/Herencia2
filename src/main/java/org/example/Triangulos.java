package org.example;

public class Triangulos extends FigurasGeometricas {
    double base;
    double altura;
    double ladoA;
    double ladoB;
    double ladoC;

    public Triangulos(double base, double altura) {
    }

    public Triangulos() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double Area() {
        return base * altura;
    }
    public double Perimetro() {
        return ladoA + ladoB + ladoC;
    }






}
