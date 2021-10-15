//Crea una clase en Java donde declares una variable de tipo array de Strings que
//contenga los doce meses del año, en minúsculas. A continuación declara una variable
//mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
//mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
//Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
//adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
//Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
//No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
//No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
//¡Ha acertado!
package ejercicioextrapoo5;

import java.util.Scanner;

public class EjercicioExtraPOO5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        mesSecreto mes1 = new mesSecreto();
        mes1.inicio();
        boolean salida = false;

        System.out.println("Adivine el mes secreto!!");
        System.out.println("Introduzca el nombre del mes en minúsculas:");
        do {

            String mes = leer.next();

            if (mes1.comparador(mes) == true) {
                System.out.println("¡¡Ha Acertado!!");
                salida = true;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            }

        } while (salida==false);

    }

}
