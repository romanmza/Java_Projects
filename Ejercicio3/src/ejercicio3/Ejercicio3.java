//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
//por pantalla.

package ejercicio3;
import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) 
    {
        String nombre; 
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
                
        System.out.println("Ingrese Su nombre: ");
        
        nombre = leer.next();
        
        System.out.println("Su nombre es: "+nombre);
        

    }
    
}
