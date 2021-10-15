//Crear una clase llamada fracción que contenga 2 atributos (denominador y numerador de cada
//fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
//fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
package ejercicioextrapoo2_1;

import Servicios.FraccionServicio;
import java.util.Scanner;

public class EjercicioExtraPOO2_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opcion = 0;

        FraccionServicio service1 = new FraccionServicio();

        System.out.println("Calculador de Fracciones.");
        System.out.println("Primero ingrese los valores de la fracción 1:");

        Fraccion fraccion1 = service1.nuevafraccion();

        System.out.println("Ahora ingrese los valores de la fracción 2:");
        
        Fraccion fraccion2 = service1.nuevafraccion();

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Elija una de las opciones: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("-----------------------------------------------");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    service1.sumar(fraccion1,fraccion2);
                    break;
                case 2:
                    service1.restar(fraccion1, fraccion2);
                    break;
                case 3:
                    service1.multiplicar(fraccion1, fraccion2);
                    break;
                case 4:
                    service1.dividir(fraccion1,fraccion2);
                    break;
                case 5:
                    opcion = 0;
                    break;
                default:
                    System.out.println("Opción incorrecta. Inténtelo nuevamente.");
                    break;
            }

        } while (opcion != 0);

        System.out.println("Hasta luego!");

    }

}
