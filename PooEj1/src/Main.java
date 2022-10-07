import Entidades.Libro;
import Servicios.LibroServicio;

public class Main {
    public static void main(String[] args) {

        LibroServicio nuevoLibro = new LibroServicio();

        Libro nuevo = nuevoLibro.llenar();

        System.out.println(nuevo);


    }
}