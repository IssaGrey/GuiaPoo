package Servicios;

import Entidades.Libro;

import java.util.Scanner;

public class LibroServicio {
    private Scanner leer = new Scanner(System.in);

    public Libro llenar(){
        System.out.println(" Ingrese ISBN");
        String isbn = leer.next();
        System.out.println(" Ingrese Titulo del Libro");
        String titulo = leer.next();
        System.out.println(" Ingrese el Autor");
        String autor = leer.next();
        System.out.println(" Ingrese numero de paginas");
        int numPag = leer.nextInt();

        return new Libro(isbn,titulo,autor,numPag);
    }

}
