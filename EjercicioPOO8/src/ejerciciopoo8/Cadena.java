package ejerciciopoo8;

public class Cadena {

    private String frase;
    private int long_frase;

    public Cadena() {
        //this.long_frase = frase.length();
    }

//    public Cadena(String frase) {
//        this.long_frase = frase.length();
//        this.frase = frase;
//    }
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.long_frase = frase.length();
    }

    public int getLong_frase() {
        return long_frase;
    }

    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
    public void mostrarVocales() {

        int contador = 0;
        System.out.println("Contador de vocales: ");
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).matches("[aeiouAEIOU]")) {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " vocales.");

    }
//Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public void invertirFrase() {
        System.out.println("Frase invertida: ");
        for (int i = frase.length(); i > 0; i--) {
            //stem.out.println(i);
            System.out.print(frase.substring(i - 1, i));
        }
        System.out.println("");
    }
//Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
//ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

    public void vecesRepetido(String c) {
        int contador = 0;
        //String caracter = String.valueOf(c);
        System.out.println("Contador de caracter repetido: ");
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equals(c)) {
                contador++;
            }
        }
        System.out.println("La frase tiene el caracter " + c + " repetido " + contador + " veces.");

    }
//Método compararLongitud(String frase), deberá comparar la longitud de la frase
//que compone la clase con otra nueva frase ingresada por el usuario.

    public void compararLongitud(String f) {
        if (f.length() == frase.length()) {
            System.out.println("La frase ingresada tiene la misma longitud");
        } else {
            System.out.println("La frase ingresada no tiene la misma longitud.");
        }

    }
//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.

    public void unirFrases(String f) {

        String salida = frase.concat(f);
        System.out.println("La frase concatenada es: ");
        System.out.println(salida);

    }
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y
//mostrar la frase resultante.

    public void reemplazar(String c) {
        String salida = "";

        System.out.println("Reemplazador de caracteres 'a'.");

        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equals(c)) {
                salida = salida.concat("a");
            } else {
                salida = salida.concat(frase.substring(i, i + 1));
            }
        }

        System.out.println("Frase resultante: " + salida);
    }

    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no
    public boolean contiene(String letra) {
//        System.out.println(frase.indexOf(letra));
//        return true;
        
       if (frase.indexOf(letra) > 0) {
          return true;
       } else {
            return false;
       }
    }
//    public void setLong_frase(int long_frase) {
//        this.long_frase = long_frase;
//    }

}
