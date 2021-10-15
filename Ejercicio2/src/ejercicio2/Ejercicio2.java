

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese número 1:");
        num1 = leer.nextInt();
        System.out.println("Ingrese número 2:");
        num2 = leer.nextInt();
        num3 = num1 + num2;

        System.out.println("La suma es: " + num3);

    }

}
