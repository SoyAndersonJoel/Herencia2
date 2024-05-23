package org.example;

public class Circulos extends FigurasGeometricas{
    double radio;
    public Circulos(){}
    public Circulos(double radio){}
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double CalcularArea(){
        return Math.PI * radio * radio;
    }
    public double CalcularPerimetro(){
        return 2 * Math.PI * radio;
    }

    public void imprimirCirculo(){
        System.out.println("Circulo: " + this.getRadio());
    }




}
