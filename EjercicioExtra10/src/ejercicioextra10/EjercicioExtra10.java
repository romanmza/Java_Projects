//Realice un programa para que el usuario adivine el resultado de una multiplicación
//entre dos números generados aleatoriamente entre 0 y 10. El programa debe
//indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
//incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
//realizar este ejercicio investigue como utilizar la función Math.random() de Java
package ejercicioextra10;

import java.util.Scanner;

public class EjercicioExtra10 {

    public static void main(String[] args) {
        {
            int num1, num2, resultado, respuesta;

            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            num1 = (int) (Math.random() * 10);
            num2 = (int) (Math.random() * 10);

            resultado = num1 * num2;

            System.out.println("(SPOILER: Resultado: " + resultado + ")");

            System.out.println("Se realizó la multiplicación entre 2 números aleatorios entre 0 y 10");
            System.out.println("Adivine la respuesta!");
            System.out.println("Ingrese un número:");

            do {

                respuesta = leer.nextInt();

                if (respuesta == resultado) {
                    System.out.println("Felicitaciones! Ha adivinado");
                } else {
                    System.out.println("Respuesta incorrecta. Inténtelo nuevamente.");
                }
            } while (respuesta != resultado);

        }
    }
}
