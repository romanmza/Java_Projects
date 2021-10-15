//Simular la división usando solamente restas. Dados dos números enteros mayores
//que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
//restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
//que el divisor, este resultado es el residuo, y el número de restas realizadas es el
//cociente. Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada
//37 – 13 = 24 dos restas realizadas
//24 – 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3


package ejercicioextra9;

import java.util.Scanner;

public class EjercicioExtra9 {

    public static void main(String[] args) {
        {

            int dividendo,divisor,cociente;
            cociente = 0;
            
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            
            System.out.println("Ingrese el Dividendo de la operación: ");
            dividendo=leer.nextInt();
            
            System.out.println("Ahora, ingrese el Divisor de la operación: ");
            divisor=leer.nextInt();
            
            do {
                
                dividendo = dividendo - divisor;
                cociente ++;
                

            } while (dividendo>divisor);
            

            System.out.println("El cociente de la división es: " +cociente);
            System.out.println("El residuo de la división es: "+dividendo);
            
        }
    }
}
