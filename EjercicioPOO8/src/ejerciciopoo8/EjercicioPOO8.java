//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
//String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
//una frase que puede ser una palabra o varias palabras separadas por un espacio en
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//automática según la longitud de la frase ingresada. Deberá además implementar los
//siguientes métodos:
//• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
//• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
//ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//• Método compararLongitud(String frase), deberá comparar la longitud de la frase
//que compone la clase con otra nueva frase ingresada por el usuario.
//• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y
//mostrar la frase resultante.
//• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no


package ejerciciopoo8;

import java.util.Scanner;


public class EjercicioPOO8 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Cadena cadena1 = new Cadena();
        
        System.out.println("Ingrese una frase: ");
        cadena1.setFrase(leer.next()); 
        
        cadena1.mostrarVocales();
        cadena1.invertirFrase();
        System.out.println("Ingrese un caracter para buscar en la frase: ");
        cadena1.vecesRepetido(leer.next());
        
        System.out.println("Ahora ingrese otra frase para comparar longitudes:");
        cadena1.compararLongitud(leer.next());
        
        System.out.println("Ahora ingrese otra frase para unir a la frase original:");
        cadena1.unirFrases(leer.next());
        
        System.out.println("Ahora ingrese un caracter para reemplazar todas las letras 'a' de la frase original: ");
        cadena1.reemplazar(leer.next());

        System.out.println("Ahora ingrese un caracter para buscarlo en la frase");
        if(cadena1.contiene(leer.next())==true)
        {
            System.out.println("Caracter encontrado en la frase.");
        }
        else{
            System.out.println("Caracter no encontrado en la frase.");
        }
        
       
        
    }

}
