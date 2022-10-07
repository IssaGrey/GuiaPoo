import Entidades.Circunferencia;
import Servicios.ServicioRadio;

public class PrincipalMain {
    public static void main(String[] args) {


        //instanciamos un objeto llamado C1 de la clase ServicioRadio
        ServicioRadio c1 = new ServicioRadio();

        Circunferencia crearCircunferencia = c1.crearCircunferencia();

        c1.area(crearCircunferencia);
        c1.perimetro(crearCircunferencia);

    }
}