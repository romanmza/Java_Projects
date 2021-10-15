//Una obra social tiene tres clases de socios:
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
//descuento en todos los tipos de tratamientos.
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
//descuento para los mismos tratamientos que los socios del tipo A.
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
//dichos tratamientos.
//Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
//que represente el costo del tratamiento (previo al descuento) y determine el importe
//en efectivo a pagar por dicho socio.
package ejercicioextra5;

import java.util.Scanner;

public class EjercicioExtra5 {

    public static void main(String[] args) {
        {
            float importe;
            String tipo;

            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese tipo de socio: ");

            tipo = leer.next();
            tipo = tipo.toUpperCase();

            System.out.println("Ingrese costo del tratamiento: ");
            importe = leer.nextFloat();

            switch (tipo) {
                case "A":
                    importe = importe * 0.5f;                    
                    break;
                case "B":
                    importe = importe * 0.65f;
                    break;
                case "C":
                    importe = importe * 1f;
                    break;
                default:
                    System.out.println("El tipo ingresado no es correcto.");
                    break;

            }
            System.out.println("El socio deberá pagar $"+importe+" por el tratamiento.");

        }

    }
}

        