package org.example;
public class Main {
    public static void main(String[] args){
        FigurasGeometricas miFigura1 = new FigurasGeometricas();
        Circulos mifigura2 = new Circulos();
        Triangulos mifigura3 = new Triangulos();
        Cuadrilateros mifigura4 = new Cuadrilateros();

        Circulos mifigura5 = new Circulos(3.00);
        Triangulos mifura6 = new Triangulos(6.00,8.00);
        Cuadrilateros mifigura7 = new Cuadrilateros(5.00,5.00);
        Cuadrilateros mifigura8 = new Cuadrilateros(5.00,10.00);

        Hexagono mifigura9 = new Hexagono();


        mifigura2.setNombre("El cir");
        System.out.println("\n\nNombre: "+mifigura2.getNombre());
        mifigura2.setRadio(4.00);
        System.out.println("las medidas son: \n Radio"+mifigura2.getRadio());
        System.out.println("Y su area :  "+mifigura2.CalcularArea());

        mifigura3.setNombre("El tri");
        System.out.println("\n\nNombre: "+mifigura3.getNombre());
        mifigura3.setAltura(8.00);
        mifigura3.setBase(5.00);
        System.out.println("Las  medidas son: \n Altura: "+mifigura3.getAltura()+"\n Base: "+mifigura3.getBase());
        System.out.println("El Area es: "+mifigura3.Area());

        mifigura4.setNombre("El cua");
        System.out.println("\n\nNombre: "+mifigura4.getNombre());
        mifigura4.setAlto(9.00);
        mifigura4.setAncho(8.00);
        System.out.println("Las  medidas son: \n Alto: "+mifigura4.getAlto()+"\n Ancho: "+mifigura4.getAncho());
        System.out.println("El Area es : "+mifigura4.calcularArea());





















    }

}