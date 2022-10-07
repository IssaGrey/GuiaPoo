package Entidad;

public class Cafetera {
    private int capMaxima = 1000;
    private int cantActual;

    public Cafetera() {
    }

    public Cafetera(int cantActual,int capMaxima) {
        this.cantActual = cantActual;
        this.capMaxima = capMaxima;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "capMaxima=" + capMaxima +
                ", cantActual=" + cantActual +
                '}';
    }
}
