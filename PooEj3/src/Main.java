import Entidades.Operacion;
import Servicios.ServicioOperacion;

public class Main {
    public static void main(String[] args) {

        ServicioOperacion operacion1 = new ServicioOperacion();

        Operacion op1 = operacion1.crearOperacion();

        operacion1.restar(op1);
        operacion1.sumar(op1);
        operacion1.multiplicar(op1);
        operacion1.dividir(op1);
    }
}