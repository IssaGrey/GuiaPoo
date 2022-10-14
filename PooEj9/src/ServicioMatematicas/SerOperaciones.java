package ServicioMatematicas;

import Entidad.Matematicas;

import java.util.Random;

public class SerOperaciones {

    public Matematicas CrearNum (){
      Random randonobj = new Random();
      Matematicas m = new Matematicas();
      m.setNum1(-5 + randonobj.nextInt( 10-5)); // me da un numero aleatorio entre 10 y 50
      m.setNum2(1 + randonobj.nextInt(10 -1));
      //  m.setNum1(Math.random()*10);  /m.setNum2(Math.random()*10);

       System.out.println("m.setNum1(10 + randonobj.nextInt(50 -10))= "+ m.getNum1());
       System.out.println("m.setNum2(10 + randonobj.nextInt(50 -10)= "+ m.getNum2()+"\n");
       return m;
    }
// 1) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public  void  retornarMayor (Matematicas m){
        double numMayor=  Math.max(m.getNum1(),m.getNum2());
        System.out.println(">>>>>>> Atributo con mayor valor<<<<<<<<<<\n"+ numMayor);
    }
// 2) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado  al menor número. Previamente se deben redondear ambos valores.
     public void calcularPotencia(Matematicas m){

        if ( m.getNum1() > m.getNum2()) {
            double mayorNum = m.getNum1();
            double menorNum = m.getNum2();
            double potencia = Math.pow(mayorNum,menorNum );
            System.out.println(">>>>>>>>>>>>>>>>> Potencia <<<<<<<<<<<<<<<<<<");
            System.out.println(  mayorNum +" elevado en "+ menorNum+" = " +potencia+"\n");
        } else  {
            double mayorNum = m.getNum2() ;
            double menorNum = m.getNum1() ;
            double potencia = Math.pow( mayorNum,menorNum);
            System.out.println(">>>>>>>>>>>>>>>>> Potencia <<<<<<<<<<<<<<<<<<");
            System.out.println("LA POTENCIA de " + mayorNum +" elevado en "+ menorNum+" = " +potencia+"\n");
        }
         // return calcularPotencia(double mayorNum , double menorNum)??? como puedo pasar los valores de menor num y mayor num al metodo calcular Raiz
     }
  // 3) Método calculaRaiz, calcular la raíz cuadrada del menor de los dos valores.Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número */
     public void calculaRaiz (Matematicas m){
        m.setNum1(Math.abs(m.getNum1()));// valor absoluto
        m.setNum2(Math.abs(m.getNum2()));

         if ( m.getNum1() > m.getNum2()) {
             double mayorNum = m.getNum1();
             double menorNum = m.getNum2();
             double raiz = Math.sqrt(menorNum );
             System.out.println(">>>>>>>>>>>>>>> Raiz cuadrada <<<<<<<<<<<<<<<<");
             System.out.println(  menorNum+" elevado al cuadrado  = " +raiz);
         } else {
             double mayorNum = m.getNum2();
             double menorNum = m.getNum1();
             double raiz = Math.sqrt(menorNum);
             System.out.println(">>>>>>>>>>>>>>> Raiz cuadrada <<<<<<<<<<<<<<<<");
             System.out.println(menorNum + " elevado al cuadrado  = " + raiz);
         }
     }

}

