package ServicioCadena;

import Entidad.Cadena;

public class SerCadena {
    //1) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(Cadena cadena1){
        int contadorVocales = 0;
        cadena1.setCadena(cadena1.getCadena().toLowerCase());

        for (int i = 0; i < cadena1.getLongCadena(); i++){
            if (cadena1.getCadena().charAt(i)=='a'||
               cadena1.getCadena().charAt(i)=='e' ||
               cadena1.getCadena().charAt(i)=='i' ||
               cadena1.getCadena().charAt(i)=='o' ||
               cadena1.getCadena().charAt(i)=='u') {

                contadorVocales++;
            }
        }
        System.out.println("La frase ingresada contiene "+ contadorVocales+" vocales");
    }
// 2) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. EJM Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena cadena1){
      // como pasar aun arreglo la frase ingresada por el usuario ?
        //  char[] fraseInvertida = new char[cadena1.getLongCadena()];
        // fraseInvertida[i] =  cadena1.getCadena();
        //fraseInvertida = cadena1.getCadena().charAt(i);
        for (int i = cadena1.getLongCadena()-1; i >= 0; i--){
            System.out.print(cadena1.getCadena().charAt(i));
        }
        System.out.println(" ");
    }
//3) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase,
// Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(Cadena Cadena1, String letra) {
        String frase1 = Cadena1.getCadena().toLowerCase();
        int contadorLetra = 0;
        for (int i = 0; i< Cadena1.getLongCadena(); i++){

            if (Cadena1.getCadena().charAt(i) == letra.charAt(0)){
                contadorLetra++;
            }
        }
        if (contadorLetra == 0){
            System.out.println("El caracter No se encontro en la frase ");
        }
        System.out.println("El caracter "+" ' "+ letra + " ' "+" se repite " +contadorLetra + " veces en la frase ");
    }
//4) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena cadena, String frase){
       int longCadena2 =  frase.length();
       if (cadena.getLongCadena()== longCadena2){
           System.out.println("las frases ingresadas tiene la misma longitud ");
       } else System.out.println( " La longitud de las frases ingresadas son distintas ");
        System.out.println(longCadena2);
        System.out.println(cadena.getLongCadena());
    }
//5) Método unirFrases(String frase), deberá CONCATENAR la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena cadena,String frase){
        System.out.println(cadena.getCadena().concat(" "+frase));
        System.out.println(cadena.getCadena()+" "+ frase);
    }
//6) Método reemplazar(String letra) REEMPLAZAR las letras “a” de la frase por otro carácter seleccionado por el usuario y mostrar la frase modificada

    public void reemplazar(Cadena cadena,String caracter){
        System.out.println(cadena.getCadena().replace("a", caracter));
    }

//7) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no
    public void contiene(Cadena Cadena1, char letra2){
        //String.valueOf(letra2);

       boolean resultado =  Cadena1.getCadena().contains(String.valueOf(letra2).toLowerCase());
        int resultado1 =  Cadena1.getCadena().indexOf(letra2);
       if (resultado == true) {
           System.out.println(letra2);
           System.out.println("La frase contiene la" + "'"+letra2+"'," +" letra a buscar ");
        } else System.out.println(" la frase NO CONTIENE la"  + "'" + letra2+ "'," + "letra a buscar ");
        System.out.println(resultado);
    }


}
