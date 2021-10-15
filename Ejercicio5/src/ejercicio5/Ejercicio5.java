//Dada una cantidad de grados centígrados se debe mostrar su equivalente en
//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)


package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        double temp_c;
        double temp_f;


        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese temperatura en grados Celsius: ");
        temp_c = leer.nextFloat();
        
        temp_f= 32+(9*temp_c/5);

        System.out.println("La temperatura en grados Farennheit es: " + temp_f);

    }

}
