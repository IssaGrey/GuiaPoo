package Entidad;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private float peso;
    private float altura;
    private float IMC;
//CONSTRUCTORES
    public Persona(String nombre, int edad, String sexo, float peso, float altura, float IMC) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.IMC = IMC;
    }
    public Persona() {
    }
    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
       this.nombre = nombre;
   }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
