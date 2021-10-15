/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo.pkg1;

import java.util.Scanner;
import java.util.function.ToIntBiFunction;

/**
 *
 * @author Román
 *
 * los nombres de clases deben comenzar con mayúsculas
 *
 * las clases contienen a los objetos
 *
 * un objeto es una instancia de una clase, y cuando creamos un objeto lo
 * instanciamos (objeto e instancia es lo mismo)
 */
public class HolaMundo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //declaraciones
        int num;
        double numReal;
        String cadena = "Hola mundo";
        char caracter = 'e';
        boolean logico = false;
        int arreglo[] = new int[10];

        int azar = (int) (Math.random() * 10);

        String palabra;

        num = 5 + 4;
        //mostrar por pantalla
        System.out.println("El texto que quieras mostrar: " + cadena + caracter + num);

        //leer por teclado: Creamos un nuevo objeto de la clase Scanner (pasamos el objeto predefinido System.in que representa un flujo de entrada estandar
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresar una palabra: ");
        palabra = leer.next(); //leer cadena

        System.out.println("Ingresar un número: ");
        num = leer.nextInt();
        if (num < 5) {
            System.out.println("EL número ingresado es menor a 5.");
        } else if (num == 5) {
            System.out.println("El número ingresado es igual a 5");
        } else {
            System.out.println("El número ingresado es mayor a 5.");
        }

        System.out.println("Ingresar un Real: ");
        numReal = leer.nextDouble();

        switch (num) {
            case 1:
                System.out.println("salida 1");
                break;
            case 2:
                System.out.println("Salida 2");
                break;
            default:
                System.out.println("salida otra");
                break;
        }

        for (int i = 0; i < 10; i++) {
            arreglo[i] = i;
            System.out.println("Elemento [" + i + "]: " + arreglo[i]);
        }

        System.out.println("Ingresar un valor booleano: ");
        logico = leer.nextBoolean();

        System.out.println("Ingresar un caracter: ");
        caracter = leer.next().charAt(0);

    }

    private static int ToIntBiFunction(double numReal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
