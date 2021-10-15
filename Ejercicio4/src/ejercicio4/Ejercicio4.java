//Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java

package ejercicio4;
import java.util.Scanner;



public class Ejercicio4 {

    public static void main(String[] args) 
    {
        String frase; 
        String frase2;
        
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
                
        System.out.println("Ingrese Frase: ");
        
        frase = leer.next();
        
        
        frase = frase.toUpperCase();
        System.out.println("La frase en mayúsculas es: "+frase);
        
        frase = frase.toLowerCase();
        System.out.println("La frase en minúsculas es: "+frase);

    }
    
}