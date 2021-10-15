//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
//cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
package ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        int dimension = 0;
        String temp = "";

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese tamaño del vector:");
        dimension = leer.nextInt();

        int[] vector = new int[dimension];
        int[] cont_digitos = new int[5];

        for (int i = 0; i < dimension; i++) {
                System.out.println("Ingrese elemento "+i+" del vector: ");
                vector[i]= leer.nextInt();
            //vector[i] = (int) (Math.random() * 10);

        }

        for (int i = 0; i < dimension; i++) {

            //   System.out.println("valor "+i+": "+vector[i]);
            temp = String.valueOf(vector[i]);
            
            switch (temp.length()) {
                case 1:
                    cont_digitos[0]++;
                    break;
                case 2:
                    cont_digitos[1]++;
                    break;
                case 3:
                    cont_digitos[2]++;
                    break;
                case 4:
                    cont_digitos[3]++;
                    break;
                case 5:
                    cont_digitos[4]++;
                    break;
            }

        }
        for (int i = 1; i <= dimension; i++) {
            
        
        System.out.println("Cantidad de valores de "+i+" dígito/s: " + cont_digitos[i-1]);
        }
    }

}
