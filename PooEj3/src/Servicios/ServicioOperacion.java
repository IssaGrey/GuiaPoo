package Servicios;

import Entidades.Operacion;

import java.util.Scanner;

public class ServicioOperacion {

    Scanner leer =  new Scanner ( System.in);

    public Operacion crearOperacion(){
        Operacion op1 = new Operacion();
        System.out.println("Ingrese el primer numero");
        op1.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        op1.setNum2(leer.nextInt());
        return op1;
    }
    public void sumar (Operacion op1){
            System.out.println("la suma es: "+ (op1.getNum1()+ op1.getNum2()));
    }
    public void restar (Operacion op1){
        System.out.println("la resta es: "+ (op1.getNum1() - op1.getNum2()));
    }
    public void multiplicar (Operacion op1) {
        if (op1.getNum1() == 0 && op1.getNum2() == 0) {
            System.out.println("Error No se puede multiplicar por 0 ");
            // COMO HACER PARA QUE EL METODO DEVULEVA 0
        } else if (op1.getNum1() != 0 && op1.getNum2() != 0) {
            System.out.println("La MultiplicaciOn es: " + (op1.getNum1() * op1.getNum2()));
        }
    }
        public void dividir (Operacion op1){
            if (op1.getNum1() == 0 && op1.getNum2() == 0) {
                System.out.println("Error No se puede multiplicar por 0 ");
                // COMO HACER PARA QUE EL METODO DEVULEVA 0
            } else if (op1.getNum1() != 0 && op1.getNum2() != 0) {
                System.out.println("La Divicion es: " + (op1.getNum1() / op1.getNum2()));
            }
        }

    }