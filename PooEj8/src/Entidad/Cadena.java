package Entidad;

public class Cadena {
    private String cadena;
    private int longCadena;
//constructores
    public Cadena(String cadena,int longCadena) {
        this.cadena = cadena;
        this.longCadena = longCadena;
    }
    public Cadena() {
    }
    // Get- Set
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public int getLongCadena() {
        return longCadena;
    }
    public void setLongCadena(int longCadena) {
        this.longCadena = longCadena;
    }


}
