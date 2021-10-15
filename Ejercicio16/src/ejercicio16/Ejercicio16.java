//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
//salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
//deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
//número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        int num, suma;
        suma = 0;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese 20 números (0 = salir): ");

        for (int i = 0; i < 20; i++) {
           // num = leer.nextInt();
           num = (int) (Math.random() * 10);
            System.out.println("Número aleatorio: "+num);
            if (num < 0) {
                continue;
            } else {
                suma = suma + num;
            }
            if (num == 0) {
                System.out.println("Se capturó el número 0");
                break;
            }
        }
        System.out.println("La suma de los números ingresados es: "+suma);

    }

}
