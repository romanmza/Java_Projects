//Crea una aplicación que a través de una función nos convierta una cantidad de
//euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
//libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
//converir que será una cadena, este no devolverá ningún valor y mostrará un
//mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        double monto = 0;
        int moneda = 0;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese monto (Euros) a convertir: ");

        monto = leer.nextDouble();

        System.out.println("Ingrese tipo de moneda a convertir:");
        System.out.println("1. Dólares");
        System.out.println("2. Yenes");
        System.out.println("3. Libras");

        moneda = leer.nextInt();

        convertir(monto, moneda);

    }

    public static void convertir(double in_monto, int in_moneda) {
        double salida = 0;

        switch (in_moneda) {
            case 1:  //dólares 1.28611 u$d es un 1 €
                salida = in_monto * 1.28611;
                System.out.println("La suma de " + in_moneda+"euro/s" + " equivale a " + salida + " dólares.");
                break;
            case 2:  //yenes 129.852 yenes es un 1 €
                salida = in_monto * 129.852;
                System.out.println("La suma de " + in_moneda+"euro/s" + " equivale a " + salida + " yenes.");
                break;
            case 3:  //libras 0.86 libras es un 1 €
                salida = in_monto * 0.86;
                System.out.println("La suma de " + in_moneda+"euro/s" + " equivale a " + salida + " libras1.");
                break;
            default:
                System.out.println("Tipo de moneda incorrecto. Inténtelo nuevamente.");

        }

        return;
    }

}
