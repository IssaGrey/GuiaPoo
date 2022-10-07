package Servicio;

import Entidad.Rectangulo;

import java.util.Scanner;

public class ServicioRectangulo {
    Scanner leer = new Scanner(System.in);

    // metodo para ingresar datos x el usuario base y altura

    public Rectangulo crearRectangulo() {
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese  la base del rectangulo");
        r1.setBase(leer.nextFloat());
        System.out.println("Ingrese  la altura del rectangulo");
        r1.setAltura(leer.nextFloat());

        return r1;
    }

    // metodo para calcular la superficie del rectangulo
    public void calcularSuperficie(Rectangulo r) {
        System.out.println("La superficie es: " + (r.getBase() * r.getAltura()) + "Cm2");
    }

    // metodo para calcular perimetro
    public void calcularPerimetro(Rectangulo r) {
        System.out.println("El perimetro es: " + (r.getBase() + r.getAltura() * 2) + "Cm2");
    }

    // metodo que dibuja el rectangulo
    public void dibujarRectangulo(Rectangulo r) {
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if (i == 0 || i == r.getAltura() - 1 || j == 0 || j == r.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println( " base "+r.getBase()+ "altura"+ r.getAltura());
    }
}