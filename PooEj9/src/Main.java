import Entidad.Matematicas;
import ServicioMatematicas.SerOperaciones;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        SerOperaciones  sm = new SerOperaciones();
        Matematicas m = sm.CrearNum();
        sm.retornarMayor(m);
        sm.calcularPotencia(m);
        sm.calculaRaiz(m);



    }

}