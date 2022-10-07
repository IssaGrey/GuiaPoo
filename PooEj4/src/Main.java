import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;

public class Main {
    public static void main(String[] args) {

        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo r1 =sr.crearRectangulo();

        sr.calcularSuperficie(r1);
        sr.calcularPerimetro(r1);
        sr.dibujarRectangulo(r1);
    }
}