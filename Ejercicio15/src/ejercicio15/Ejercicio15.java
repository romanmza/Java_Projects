//Realizar un programa que pida dos números enteros positivos por teclado y
//muestre por pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
//pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
//del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
//¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
//carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        int num1, num2, suma, resta, multi, opcion;
        double divi;
        char salir;
        suma = 0;
        resta = 0;
        multi = 1;
        divi = 0;
        opcion = 0;
        salir = 'N';

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese Operando N° 1: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese Operando N° 2: ");
        num2 = leer.nextInt();

        do {
            System.out.println("Elija una opción: ");

            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("La suma de los operandos es: " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("La resta de los operandos es: " + resta);
                    break;
                case 3:
                    multi = num1*num2;
                    System.out.println("La multiplicación de los operandos es: " + multi);
                    break;
                case 4:
                    divi = num1/num2;
                    System.out.println("La división de los operandos es: " + divi);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir? S/N ");
                    do {                  
                        salir = leer.next().charAt(0);
                        if (salir!='S' && salir != 'N')
                        {
                            System.out.println("Opción incorrecta. Ingrese 'S' para salir o 'N' para continuar");
                        }

                            
                    } while (salir!='S' && salir != 'N');
                    break;
                default:
                     System.out.println("Opción incorrecta. Seleccione una de las opciones del menú.");

            }

          
        } while (salir != 'S');

        System.out.println("Hasta luego!");

    }

}
