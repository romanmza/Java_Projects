//Escribir un programa que lea un número entero por teclado y muestre por pantalla
//el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().


package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int num;
        int num2;
        int num3;
        double raiz;


        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un número: ");
        num = leer.nextInt();
        
        num2 = num*2;
        num3 = num*3;
        raiz = Math.sqrt(num);
                
        System.out.println("El doble del número ingresado es: " + num2);
        System.out.println("El triple del número ingresado es: " + num3);
        System.out.println("La raíz cuadrada del número ingresado es: %.2f" + raiz);
        System.out.print("La raíz cuadrada del número ingresado (sólo dos decimales) es: ");
        System.out.println(String.format("%.2f", raiz));

    }

}