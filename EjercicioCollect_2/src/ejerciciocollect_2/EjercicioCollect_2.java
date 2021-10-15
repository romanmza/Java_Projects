//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
//y se mostrará la lista ordenada
package ejerciciocollect_2;

import ejerciciocollect_2.servicios.ServicioPerro;
import java.util.Scanner;

public class EjercicioCollect_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioPerro servicio1 = new ServicioPerro();

        boolean salir = false;
        String option = "";
        do {
            System.out.println("Ingrese A para agregar una nueva raza o S para salir.");
            option = leer.next();
            if (option.equals("A")) {
                servicio1.agregarPerro();
            } else if (option.equals("S")) {
                salir = true;
            } else {
                System.out.println("Opción incorrecta.");
            }

        } while (salir == false);

        System.out.println("Ingrese el nombre de una raza a buscar: ");
        servicio1.buscarPerro(leer.next());
        servicio1.mostrarPerros();
        
        servicio1.ordenarListaPorRaza();
        servicio1.mostrarPerros();

    }

}
