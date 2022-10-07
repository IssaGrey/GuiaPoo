package ServicioCafetera;

import Entidad.Cafetera;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ServicioCafetera {

Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera(){
        Cafetera cafecito = new Cafetera();
        cafecito.setCantActual(cafecito.getCapMaxima());

        System.out.println(cafecito);
        System.out.println(cafecito.getCantActual()+ " .."+ cafecito.getCapMaxima());
        return cafecito;
    }
    int tamTaza= 0;
    public void servirTaza(Cafetera c ){
        System.out.println("Ingrese el tamaño de su taza");
        tamTaza = leer.nextInt();
        if (c.getCantActual() < tamTaza ){

            System.out.println(" la taza no se lleno completamente");
            System.out.println("su taza tiene "+ c.getCantActual() + "Oz de cafe ");
        } else if (c.getCantActual()> tamTaza) {
            c.setCantActual(c.getCantActual()-tamTaza);
            System.out.println("Su taza esta llena de cafe "+
            "\n cantidad actual de cafe "+ c.getCantActual());
        }
    }
    public void vaciarCafetera (Cafetera c){
        c.setCantActual(0);
    }
    public  void agregarCafe(Cafetera c ){
        System.out.println( " Ingrese la cantidad de cafe ");
        c.setCantActual(leer.nextInt());
    }

 public int retorno (){
        int suma= 9+6;
        return suma;
 }
public void sinretor (){

      int nuevaSuma = retorno() +5;
    System.out.println(nuevaSuma);
}
}
