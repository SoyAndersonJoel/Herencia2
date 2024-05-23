package org.example;

public class FigurasGeometricas  {
    String nombre;
    int nLados;

    public FigurasGeometricas(String nombre, int nLados) {
        this.nombre = nombre;
        this.nLados = nLados;
    }
    public FigurasGeometricas(){}

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getnLados() {
        return nLados;
    }
    public void setnLados(int nLados) {
        this.nLados = nLados;
    }
    public void imprimir(){

        System.out.println("comprobacion commit");
    }







}
