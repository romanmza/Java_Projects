//Implementar un programa que dado dos números enteros determine cuál es el
//mayor y lo muestre por pantalla
package ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese número 1: ");
        num1 = leer.nextInt();

        System.out.println("Ingrese número 2: ");
        num2 = leer.nextInt();

        if (num1 > num2) {
            System.out.println("El numero mayor es: "+num1);

        } else if (num1 == num2) {
            System.out.println("Los números ingresados son iguales");
        } else {
            System.out.println("El número mayor es: "+num2);
        }

        // Otra forma:
        System.out.println("Otra forma: (utilizando la función 'max' de math)");
        int mayor;
        
        mayor=Math.max(num1,num2);

        System.out.println("El mayor número es: "+mayor);
    }

}
