package ServicioCuenta;

import Entidad.CuentaBancaria;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

public class ServicioCuenta {
    Scanner leer = new Scanner (System.in);


    public CuentaBancaria crearCuenta (){
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("Ingrese numero de cuenta ");
        c1.setNumCuenta(leer.nextInt());
        System.out.println("Ingrese  su DNI ");
        c1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese  su saldo ");
        c1.setSaldoActual(leer.nextFloat());

        return  c1;
    }
    //double ingreso=0;
    public void ingresar(CuentaBancaria c1){
        System.out.println("Su saldo actual es $ "+c1.getSaldoActual());
        System.out.println("Ingrese valor a depositar");

        c1.setSaldoActual(c1.getSaldoActual() + leer.nextDouble());
        System.out.println("Su saldo actualizado es $ "+ c1.getSaldoActual());
    }
    public void retirar (CuentaBancaria c1){

        System.out.println("Ingrese valor a retirar ");
        c1.setSaldoActual(c1.getSaldoActual() - leer.nextDouble());
        System.out.println("Su saldo actualizado es $ "+ c1.getSaldoActual());
    }
    public void ExtraccionRapida (CuentaBancaria c){
        System.out.println("puedes sacar solo un 20% de tu saldo actual" + (c.getSaldoActual()*0.2));
        float x=0;
        do {
            System.out.println("Ingrese el valor a retirar");
            x= leer.nextFloat();
            if (x > c.getSaldoActual()*0.2){
                System.out.println("El monto a retirar es superior al permitido ");
            }
            } while (x > c.getSaldoActual()*0.2);

        c.setSaldoActual(c.getSaldoActual()-x) ;
        System.out.println("RETIRO EXITOSO");

    }
    public void consultarSaldo (CuentaBancaria c){
        System.out.println(" Saldo actual es  $ " + c.getSaldoActual());
    }
    public void consultarDatos (CuentaBancaria c){
        System.out.println("\n"+ c.toString() );
    }


    }


