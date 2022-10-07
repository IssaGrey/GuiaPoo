import Entidad.Persona;
import ServicioImc.ServicioPersona;

public class Main {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A TU APP 'SanoEstar' ");

       ServicioPersona ps = new ServicioPersona();

       Persona p1 = ps.crearPersona();

        //ServicioPersona pax2 = new ServicioPersona();
        Persona p2 = ps.crearPersona();

        //ServicioPersona pax3 = new ServicioPersona();
        Persona p3 =  ps.crearPersona();

        //ServicioPersona pax4 = new ServicioPersona();
        Persona p4 = ps.crearPersona();

        //PORCENTAJE DE IMC

        int contador1 = 0;
        int contador0 = 0;
        int contadorBajoPeso = 0;
        int contMayorEdad = 0;
        int contMenorEdad = 0;

// CREAR UN ARREGLO PARA HACER LOS PORCENTANJES

        Persona[] personas = new Persona[4];
        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        personas[3] = p4;
for (int x = 0; x < personas.length; x++){

    switch ((int) ps.calcularIMC(personas[x])){
        case -1:
            contadorBajoPeso++;
            break;
        case 0:
            contador0++;
            break;
        case 1:
            contador1++;
            break;
    }
if  (ps.mayorEdad(personas[x])){
    contMayorEdad++;
} else
    contMenorEdad++;
}
        System.out.println("El porcentaje de las personas que estan por debajo del peso ideal es: " + (contadorBajoPeso * 100 / 4) + "%");
        System.out.println("El porcentaje de las personas que estan  con peso ideal es: " + (contador0 * 100 / 4) + "%");
        System.out.println("El porcentaje de las personas que estan sobre peso es: " + (contador1 * 100 / 4) + "%");
        System.out.println("El porcentaje de las personas mayores de edad es: "+ contMayorEdad*100/4 +"%");
        System.out.println("El porcentaje de las personas menores de edad es: "+ contMenorEdad*100/4  +"%");
    }
}
/*for (int x = 0; x<=4; x++ ){

    ( == 0 || im2 == 0 || im3 == 0 || im4 == 0) {
        contador1++;
    }
    if (im1 == 1 || im2 == 1 || im3 == 1 || im4 == 1) {
        contador2++;
    }
    if (im1 == -1 || im2 == -1 || im3 == -1 || im4 == -1) {
        contador3++;

    }*/
