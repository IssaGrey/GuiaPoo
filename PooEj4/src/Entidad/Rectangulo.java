package Entidad;

public class Rectangulo {
//ATRIBUTOS
    private float base;
    private float altura;
// CONSTRUCTORES

    public Rectangulo() {
    }
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

// GET AND SET
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
}
