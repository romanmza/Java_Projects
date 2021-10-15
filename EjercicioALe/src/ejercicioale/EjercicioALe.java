package ejercicio17.rs232cadena;

import java.util.Scanner;

public class Ejercicio17RS232CADENA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String S1 = "";
        int length = S1.length();
        do {
            System.out.println("Ingrese una palabra");
            S1 = leer.next();

            if (S1.length() == 5) {

                if (S1.substring(0, 1).equals("X") && S1.substring(4, 5).equals("O"));

                System.out.println("CORRECTO");
            } else {
                System.out.println("INCORRECTO");
            }
        }
            while (S1.equals("&&&&&"));
        
                System.out.println("La cantidad de palabras CORRECTAS fueron: ");
            
            S1
                    = leer.next("CORRECTAS");
            System.out.println(
            "La cantidad de palabras INCORRECTAS fueron😊;
            S1
                    = leer.next("INCORRECTAS");

        }


    
    

    
    }
