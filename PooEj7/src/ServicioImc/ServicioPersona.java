package ServicioImc;

import Entidad.Persona;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("' Por favor ingrese los siguientes datos para crearte en el sistema' ");
        System.out.println("----------------------------------------------------------------------");

        System.out.println ("Ingrese su nombre");
        p1.setNombre(leer.next());
        System.out.println("su nombre es "+ p1.getNombre());
        System.out.println ("Ingrese su edad");
        p1.setEdad ((int) leer.nextInt());
        System.out.println ("Ingrese su peso");
        p1.setPeso(leer.nextFloat());
        System.out.println ("Ingrese su altura");
        p1.setAltura(leer.nextFloat());

        String sex = " ";
        do {
            System.out.println("Ingrese su sexo \n 'M' mujer - \n 'H' hombre ");
            sex = leer.next().toUpperCase();
            if (sex.equals("M")  || sex.equals("H")) {
                p1.setSexo(sex);
            } else
                System.out.println("Sexo incorrecto");

        } while (!sex.equalsIgnoreCase("H") && !sex.equalsIgnoreCase("M"));
        return p1;
    }
    public float calcularIMC(Persona p) {
        float IMC = 0;

        IMC = p.getPeso() / (p.getAltura() * p.getAltura());
        if (IMC < 20) {
            System.out.println(p.getNombre()+ " su peso esta por debajo de lo ideal " + IMC);
            p.setIMC(-1);
        } else if (IMC > 20 && IMC <= 25) {
            System.out.println(p.getNombre()+ " se encuentra con un peso IDEAL " +  IMC);
            p.setIMC(0);
        } else if (IMC > 25) {
            System.out.println(p.getNombre()+ "se encuentra por encima de su peso ideal " + IMC);
            p.setIMC(1);
        }
        return p.getIMC();
    }
    public boolean mayorEdad(Persona p) {
        boolean esMayor = false;

        if (p.getEdad() >= 18){
            esMayor = true;
            //System.out.println("Es mayor de edad");
        } //else System.out.println( "Es menor de edad");
        return esMayor;
    }

    }
