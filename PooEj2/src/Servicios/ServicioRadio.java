package Servicios;

import Entidades.Circunferencia;

import java.util.Scanner;

public class ServicioRadio {
    Scanner leer = new Scanner (System.in);
    public Circunferencia crearCircunferencia () { //CREACION DEL METODO; nombre de la clase/ nombre metodo

        Circunferencia c1 = new Circunferencia();

        System.out.println("Ingresa el Radio");
        c1.setRadio(leer.nextFloat());
        return c1;
    }
    //METODO QUE CALCULA AREA
        public void area (Circunferencia  c1 ) {
            System.out.println(" El area de la circunferencia es: "+ Math.PI* (c1.getRadio()*2) );
        }
    //METODO CALCULAR PERIMETRO

    public void perimetro (Circunferencia  c1 ) {
        System.out.println(" El perimetro de la circunferencia es: " + (2 * Math.PI* c1.getRadio()));
    }
}







