//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
//número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        int[] entrada = new int[4];

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese número " + i + ":");
            entrada[i] = leer.nextInt();

        }
        for (int i = 0; i < 4; i++) {
            System.out.print(entrada[i]);
            for (int j = 0; j < entrada[i]; j++) {
                   System.out.print("*");
            }
            System.out.println("");

        }

    }

}
