package org.example;

public class Cuadrilateros extends FigurasGeometricas{
    double ancho;
    double alto;
    public Cuadrilateros(double ancho, double alto) {

    }
    public Cuadrilateros() {}


    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return ancho * alto;
    }
    public double calcularPerimetro() {
        return 2 * ancho;
    }













}
