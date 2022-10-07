import Entidad.Cafetera;
import ServicioCafetera.ServicioCafetera;

public class Main {
    public static void main(String[] args) {

        ServicioCafetera c1 = new ServicioCafetera();

        Cafetera x = c1.llenarCafetera();

        //c1.agregarCafe(x);
        c1.servirTaza(x);
        c1.vaciarCafetera(x);
        c1.agregarCafe(x);

    }
}