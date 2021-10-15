//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
//pida al usuario un numero a buscar en el vector. El programa mostrará donde se
//encuentra el numero y si se encuentra repetido
package ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        int dimension = 0;
        int valor = 0;
        int contador = 0;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese tamaño del vector:");
        dimension = leer.nextInt();

        int[] vector = new int[dimension];

        for (int i = 0; i < dimension; i++) {

            vector[i] = (int) (Math.random() * 10);

        }

        System.out.println("Ingrese valor a buscar en el vector:");
        valor = leer.nextInt();

        for (int i = 0; i < dimension; i++) {

            //   System.out.println("valor "+i+": "+vector[i]);
            if (valor == vector[i]) {
                System.out.println("Coincidencia encontrada en posición " + i + " del vector.");
                contador++;
            }

        }
        System.out.println("Cantidad de coincidencias encontradas: " + contador);

    }

}
