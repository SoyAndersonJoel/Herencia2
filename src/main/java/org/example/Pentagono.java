package org.example;

public class Pentagono extends FigurasGeometricas{
    String nom;
    int eda;

    public Pentagono(String nombre,String nom, int nLados, int eda) {
        super(nombre, nLados);
        this.nom = nom;
        this.eda = eda;
    }
    public Pentagono() {}


    public String getNom() {
        return nombre;
    }


    public void setNom(String nombre) {
        this.nombre = nombre;
    }

    public int getEda() {
        return eda;
    }

    public void setEda(int eda) {
        this.eda = eda;
    }
}
