//Crear un programa que dado un numero determine si es par o impar


package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        int num;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese número: ");
        num = leer.nextInt();

        if (num%2==0)
            System.out.println("El número ingresado es PAR");
        else
            System.out.println("El número ingresado es IMPAR");
        
        
        



    }

}

