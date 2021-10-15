//Leer la altura de N personas y determinar el promedio de estaturas que se
//encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
package ejercicioextra6;

import java.util.Scanner;

public class EjercicioExtra6 {

    public static void main(String[] args) {
        {
            int dimensión;
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese la cantidad de personas: ");

            int dim = leer.nextInt();

            float[] array = new float[dim];

            rell_manual(array, dim);

            f_prom_altura(array, dim);

        }

    }

    public static void rell_manual(float[] in_array, int in_dim) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        float valor = 0;
        boolean check = false;

        for (int i = 1; i <= in_dim; i++) {

            System.out.println("Ingrese altura N° " + i + ": ");

            in_array[i - 1] = leer.nextFloat();

        }
    }

    public static void f_prom_altura(float[] in_array, int in_dim) {

        float sum1_6 = 0;
        int cont1_6 = 0;
        float sum = 0;

        for (int i = 0; i < in_dim; i++) {
            sum = sum + in_array[i];

            if (in_array[i] < 1.6) {
                cont1_6++;
                sum1_6 = sum1_6 + in_array[i];

            }
        }

        if (cont1_6 > 0) {
            sum1_6 = sum1_6 / cont1_6;

        }

        if (in_dim > 0) {
            sum = sum / in_dim;
        }

        System.out.printf("Promedio de alturas menor a 1.6m: %.2f m \n", sum1_6);
        System.out.printf("Promedio de alturas General: %.2f m \n", sum);
    }
}
