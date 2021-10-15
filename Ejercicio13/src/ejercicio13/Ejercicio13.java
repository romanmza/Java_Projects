//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
//la nota se pedirá de nuevo hasta que la nota sea correcta.

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        int num;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese nota: ");
      

        
        do {            
            
              num = leer.nextInt();
              if (0>num || num >10)
            System.out.println("El número ingresado es incorrecto");    
              
        } while (0>num || num >10);
        
        
        
        



    }

}