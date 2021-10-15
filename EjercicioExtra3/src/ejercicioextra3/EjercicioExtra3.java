//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
//vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
//clase String
package ejercicioextra3;

import java.util.Scanner;

public class EjercicioExtra3 {

    public static void main(String[] args) {
        {
            String letra;

            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese letra: ");

            letra = leer.next();
            letra = letra.toLowerCase();

            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                System.out.println("Correcto!");
            } else {
                System.out.println("Incorrecto");
            }

        }
    }
}
