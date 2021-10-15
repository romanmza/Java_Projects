//Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
//constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
//además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
//Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
//animas a simular el paso del tiempo en consola?
package ejercicioextrapoo2_2;

import java.util.Scanner;

public class EjercicioExtraPOO2_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el valor de horas del reloj (formato 24hs): ");
        int horas = leer.nextInt();
        System.out.println("Ingrese el valor de minutos del reloj: ");
        int minutos = leer.nextInt();
        System.out.println("Ingrese el valor de segundos del reloj: ");
        int segundos = leer.nextInt();

        Tiempo reloj1 = new Tiempo(horas,minutos,segundos);
        
        //reloj1.imprimirHoraCompleta();
        reloj1.runClock();

    }

}
