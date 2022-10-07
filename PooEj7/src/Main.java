/*7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.

 */
//Descripcion ejercicio IMC

import Entidad.Persona;
import ServicioImc.ServicioPersona;
public class Main {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A TU APP 'SanoEstar' ");

       ServicioPersona ps = new ServicioPersona();

       Persona p1 = ps.crearPersona();
       Persona p2 = ps.crearPersona();
       Persona p3 =  ps.crearPersona();
       Persona p4 = ps.crearPersona();

        int contador1 = 0;
        int contador0 = 0;
        int contadorBajoPeso = 0;
        int contMayorEdad = 0;
        int contMenorEdad = 0;

// CREAR UN ARREGLO PARA HACER LOS %

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

