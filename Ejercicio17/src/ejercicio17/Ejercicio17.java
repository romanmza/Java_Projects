//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
//tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
//con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
//carácter tiene que ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la
//secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
//secuencia distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
//correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
//se utilizan las siguientes funciones de Java Substring(), Length(), equals()
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        String input_RS232;
        int c_correcta = 0;
        int c_incorrecta = 0;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        do {
            System.out.println("Ingrese cadena RS232: ");

            input_RS232 = leer.next();

            boolean salida = validar(input_RS232);
            if (salida == true) {
                if (input_RS232.equals("&&&&&")) {
                    System.out.println("La cantidad de tramas RS232 válidas ingresadas es: " + c_correcta);
                    System.out.println("La cantidad de tramas RS232 inválidas ingresadas es: " + c_incorrecta);
                } else {
                    c_correcta++;

                }

            }
            else
            {
                c_incorrecta++;
            }
        } while (input_RS232.equals("&&&&&") == false);

    }

    public static boolean validar(String in_cadena) {

        if (in_cadena.length() == 5) {
            if (in_cadena.equals("&&&&&")) {
                return true;
            } else if (in_cadena.substring(0, 1).equals("X") && in_cadena.substring(in_cadena.length()-1).equals("0")) {
                
                return true;
            } else {
                return false;
            }

        }
        return false;

    }

}
