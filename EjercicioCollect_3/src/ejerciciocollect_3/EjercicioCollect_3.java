//Crear una clase llamada Alumno que mantenga información sobre las notas de
//distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
//de tipo Integer con sus 3 notas.
//En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Despues de ese bluce tendremos el siguiente método en la clase Alumno:
//Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
//su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
//método. Dentro del método se usará la lista notas para calcular el promedio final
//de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
//main.
package ejerciciocollect_3;

import ejerciciocollect_3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCollect_3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Alumno> Alumnos = new ArrayList();
        int notas[] = new int[3];

        boolean salir = false;
        String option = "";
        do {
            System.out.println("Ingrese A para agregar un nuevo Alumno, o S para salir.");
            option = leer.next();
            if (option.equals("A")) {
                System.out.println("Ingrese nombre del alumno: ");
                String nombre = leer.next();
                System.out.println("Ingrese nota 1 del alumno: ");
                notas[0] = leer.nextInt();
                System.out.println("Ingrese nota 2 del alumno: ");
                notas[1] = leer.nextInt();
                System.out.println("Ingrese nota 3 del alumno: ");
                notas[2] = leer.nextInt();

                //Agregamos a la lista el nuevo objeto creado desde el ingreso por teclado
                Alumnos.add(new Alumno(nombre, notas));

            } else if (option.equals("S")) {
                salir = true;
            } else {
                System.out.println("Opción incorrecta.");
            }

        } while (salir == false);
        System.out.println("Ingrese el alumno a buscar: ");
        String buscar = leer.next();

        //en este for, se crea un objeto del tipo Alumno, llamado index, para cada elemento de Alumnos. Al final de cada pasada se destruye y se crea
        //otro al comienzo nuevamente.
        for (Alumno index : Alumnos) {
            if (buscar.equals(index.getNombre())) {

                System.out.println("La nota final promedio de " + buscar + " es: " + index.notaFinal(buscar));

            }
        }

    }

}
