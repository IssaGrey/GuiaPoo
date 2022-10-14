import Entidad.Cadena;
import ServicioCadena.SerCadena;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //crear el objeto
        Cadena cadena1 = new Cadena();

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase ");
        cadena1.setCadena(leer.nextLine());
        cadena1.setLongCadena(cadena1.getCadena().length());
        System.out.println(cadena1.getLongCadena());
       // uno clase servicio con el main
        SerCadena f1 = new SerCadena();

        f1.mostrarVocales(cadena1);

        System.out.println( "La frase invertida es:");
        f1.invertirFrase(cadena1);

        System.out.println("Ingrese un caracter a buscar en la frase ");
        String letra = leer.next().toLowerCase();
        f1.vecesRepetido(cadena1,letra);

        System.out.println("Ingrese una nueva frase ");
        leer.nextLine();
        String cadena2 = leer.nextLine();
        f1.compararLongitud(cadena1, cadena2);

        f1.unirFrases(cadena1,cadena2);

        System.out.println("Ingrese un caracter por el que quiera cambiar la letra 'a' en su frase ");
        String caracter = leer.next();
        f1.reemplazar(cadena1,caracter );

        System.out.println("Ingrese la letra que desea buscar ");
        char letra2 = leer.next().charAt(0);
        f1.contiene(cadena1,letra2);
    }
}