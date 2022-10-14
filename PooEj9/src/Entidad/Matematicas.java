/*9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
        La clase deber tener un  constructor vacío, parametrizado y get y set.
    MAIN== se creará el objeto y se usará el Math.random para generar los dos números
        y se guardaran en el objeto con  su respectivos set.

    CLASE SERVICIO==  Deberá además implementar los siguientes métodos:
        1) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
        2) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
        al menor número. Previamente se deben redondear ambos valores.
        3) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
        Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número*/



package Entidad;

public class Matematicas {
   double num1;
   double num2;

    public Matematicas() {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Matematicas(double num1) {
        this.num1 = num1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
