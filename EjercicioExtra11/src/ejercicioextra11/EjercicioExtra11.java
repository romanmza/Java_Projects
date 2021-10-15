//Escribir un programa que lea un número entero y devuelva el número de dígitos
//que componen ese número. Por ejemplo, si introducimos el número 12345, el
//programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
//utilizando el operador de división. Nota: recordar que las variables de tipo entero
//truncan los números o resultados
package ejercicioextra11;

import java.util.Scanner;

public class EjercicioExtra11 {

    public static void main(String[] args) {
        {
            double num;     //Se define double porque con float tenemos hasta 10 dígitos
            int cont_dig = 0;

            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese un número:");
            num = leer.nextDouble();

            do {
                num = num / 10;
                cont_dig++;

            } while (num > 1);
            System.out.println("El número ingresado tiene "+cont_dig+" dígitos.");
        }
    }
}
