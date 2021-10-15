//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
//debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
//números pares y la cantidad de números impares. Al igual que en el ejercicio
//anterior los números negativos no deben sumarse. Nota: recordar el uso de la
//sentencia break.
package ejercicioextra8;

import java.util.Scanner;

public class EjercicioExtra8 {

    public static void main(String[] args) {
        {

            int num;
            int cont_par = 0;
            int cont_impar = 0;
            int total = 0;
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            do {
                System.out.println("Ingrese un número: ");
                num = leer.nextInt();
                //verificamos si es múltiplo de 5:
                if (num % 5 == 0) {
                    break;

                } else if (num % 2 == 0 && num > 0) {
                    cont_par++;

                } else if (num % 2 != 0 && num > 0) {
                    cont_impar++;
                }

            } while (true);
            total = cont_impar + cont_par;
            System.out.println("La cantidad total de números positivos ingresados es de: " + total);
            System.out.println("La cantidad de números positivos pares ingresados es de: " + cont_par);
            System.out.println("La cantidad de números positivos impares ingresados es de: " + cont_impar);
        }
    }
}
