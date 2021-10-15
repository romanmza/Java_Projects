//Crear un programa que dibuje una escalera de números, donde cada línea de
//números comience en uno y termine en el número de la línea. Solicitar la altura de
//la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3
//1
//12
//123
package ejercicioextra12;

import java.util.Scanner;

public class EjercicioExtra12 {

    public static void main(String[] args) {
        int num;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese altura de la escalera: ");
        num = leer.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= i + 1; j++) {

                System.out.print(j);

            }
            System.out.println("");
        }

    }

}
