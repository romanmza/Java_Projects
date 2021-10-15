//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
//promedio de n números (n>0). El valor de n se solicitará al principio del programa y
//los números serán introducidos por el usuario. Realice dos versiones del programa,
//una usando el bucle “while” y otra con el bucle “do - while
package ejercicioextra7;

import java.util.Scanner;
//import java.lang.Math;

public class EjercicioExtra7 {

    public static void main(String[] args) {
        {
            int dimensión;
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese la cantidad de números: ");

            int dim = leer.nextInt();

            int[] array = new int[dim];

            rell_manual(array, dim);

            f_calculo1(array, dim);
            f_calculo2(array, dim);

        }

    }

    public static void rell_manual(int[] in_array, int in_dim) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        float valor = 0;
        boolean check = false;

        for (int i = 1; i <= in_dim; i++) {

            System.out.println("Ingrese N° " + i + ": ");

            in_array[i - 1] = leer.nextInt();

        }
    }

    public static void f_calculo1(int[] in_array, int in_dim) {
        int mayor = 0;
        int menor = 0;
        float promedio = 0;
        int i = 0;

        do {
            if (i == 0) {
                menor = in_array[i];
            }

            mayor = Math.max(in_array[i], mayor);
            menor = Math.min(in_array[i], menor);
            promedio = promedio + in_array[i];

            // sum = sum + in_array[i];
            i++;

        } while (i < in_dim);
        promedio = promedio / in_dim;
        System.out.printf("Promedio de valores: %.2f \n", promedio);
        System.out.printf("Mayor de los valores ingresados: %d \n", mayor);
        System.out.printf("Menor de los valores ingresados: %d \n", menor);
    }

    public static void f_calculo2(int[] in_array, int in_dim) {
        int mayor = 0;
        int menor = 0;
        float promedio = 0;
        int i = 0;

        while (i < in_dim) {
            if (i == 0) {
                menor = in_array[i];
            }

            mayor = Math.max(in_array[i], mayor);
            menor = Math.min(in_array[i], menor);
            promedio = promedio + in_array[i];

            // sum = sum + in_array[i];
            i++;

        }
        promedio = promedio / in_dim;
        System.out.printf("Promedio de valores: %.2f \n", promedio);
        System.out.printf("Mayor de los valores ingresados: %d \n", mayor);
        System.out.printf("Menor de los valores ingresados: %d \n", menor);
    }
}
