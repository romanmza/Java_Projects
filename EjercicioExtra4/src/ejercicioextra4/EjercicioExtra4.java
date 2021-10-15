//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//equivalente en romano.
package ejercicioextra4;

import java.util.Scanner;

public class EjercicioExtra4 {

    public static void main(String[] args) {
        {
            int num;
            String var = "";

            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese número entre 1 y 10: ");

            num = leer.nextInt();

            switch (num) {
                case 1:
                    var = "I";
                    break;
                case 2:
                    var = "II";
                    break;
                case 3:
                    var = "III";
                    break;
                case 4:
                    var = "IV";
                    break;
                case 5:
                    var = "V";
                    break;
                case 6:
                    var = "VI";
                    break;
                case 7:
                    var = "VII";
                    break;
                case 8:
                    var = "VIII";
                    break;
                case 9:
                    var = "IX";
                    break;
                case 10:
                    var = "X";
                    break;
                default:
                    System.out.println("El número ingresado no es correcto.");
                    break;

            }

            if (num <= 10 && num >= 1) {
                System.out.println("El número " + num + " en Romano es: " + var);
            }

        }
    }
}
