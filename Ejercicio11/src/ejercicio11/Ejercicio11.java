///Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
////frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
////pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
////“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
//package ejercicio11;
//
//import java.util.Scanner;
//
//public class Ejercicio11 {
//
//    public static void main(String[] args) {
//        String frase;
//
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//
//        System.out.println("Ingrese Frase: ");
//
//        frase = leer.next();
//
//        if ((frase.substring(0,1)).equals("A")) {
//            System.out.println("Correcto!");
//        } else {
//            System.out.println("Incorrecto");
//        }
//
//    }
//
//}
package ejercicio11;

import java.util.Scanner;

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados.
 */
/**
 * ee
 *
 * @author aduo
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(
                System.in
        );
        boolean error = true;

        int n = 0;
        double resto = n;
        int cont = 0;
        do {

            try {
                do {
                    //error=true;// System.out.print("Ingres un número entero por favor");
                    System.out.printf("Ingrese un número: \n");
                    n = leer.nextInt();
                    resto = n;

                    do {

                        resto = Math.round(resto / 10);

                        cont = cont + 1;

                    } while (resto > 0);
                    if (cont == 1) {
                        System.out.println("El número ingresado tiene la cantidad de:" + cont + " dígito.");
                    } else {
                        System.out.println("El número ingresado tiene la cantidad de:" + cont + " dígitos.");
                    }

                } while (error == false);

            } catch (Exception e) {

                System.out.println("Ha ingresado un valor inválido.");
                error = false;

            }
        } while (error == false);

    }
}
