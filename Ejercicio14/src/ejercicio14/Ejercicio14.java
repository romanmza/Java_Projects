//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere
//el límite inicial.

package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        int lim,sum;
        sum = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese límite positivo para sumar: ");
        lim = leer.nextInt();
       
        do {            
              System.out.println("Ingrese número para sumar: ");
              sum = sum + leer.nextInt();
                  
              
        } while (lim>sum);
        
        System.out.println("La suma de los números ingresados es: "+sum);
    
    }

}