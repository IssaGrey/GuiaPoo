import Entidad.CuentaBancaria;
import ServicioCuenta.ServicioCuenta;

public class Main {
    public static void main(String[] args) {
        ServicioCuenta c = new ServicioCuenta();

        CuentaBancaria x = c.crearCuenta();

        c.ingresar(x);
        c.retirar(x);
        c.ExtraccionRapida(x);
        c.consultarSaldo(x);
        c.consultarDatos(x);

    }
    }
