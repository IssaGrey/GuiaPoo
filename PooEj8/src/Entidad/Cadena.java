/*Realizar una clase llamada Cadena que tenga como atributos una frase (String) y su longitud
En el Main  crear el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada.
Implementar los métodos:
1) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
2) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. EJM Entrada: "casa blanca", Salida: "acnalb asac".
3) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase,
 Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
4) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
5) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
6) Método reemplazar(String letra) reemplazar las letras “a” de la frase por otro carácter seleccionado por el usuario y mostrar la frase modificada
7) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
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
