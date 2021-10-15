//Se requiere un programa que lea y guarde países, y para evitar que se ingresen
//repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
//guardará el país en el conjunto y después se le preguntará al usuario si quiere
//guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
//guardados en el conjunto.
//Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
//recordar como se ordena un conjunto.
//Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
//Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
//país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
//en el conjunto se le informará al usuario
package ejerciciocollect_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EjercicioCollect_5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        HashSet<String> paises = new HashSet();
        boolean salir = false;
        String continuar;
        do {
            System.out.println("Ingrese el nombre del país a guardar: ");
            paises.add(leer.next());

            do {
                System.out.println("Ingrese [G] para guardar otro país, o [S] para salir");
                continuar = leer.next();
                if (continuar.equals("S")) {
                    salir = true;
                    break;
                }
                if (continuar.equals("G")) {
                    break;
                } else if (continuar.equals("G") == false && continuar.equals("S") == false) {
                    System.out.println("Opción incorrecta. Inténtelo nuevamente.");
                }

            } while (true);

        } while (salir == false);

        //Mostrar lista de países agregados:
        System.out.println("-----------Lista de Países agregados:-----------");
        for (String index : paises) {

            System.out.println(index);

        }

//Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
//recordar como se ordena un conjunto. 
        ArrayList<String> paisesLista = new ArrayList(paises); //Se convierte el HashSet a Lista.
        Collections.sort(paisesLista);

        System.out.println("-----------Lista de Países ordenados:-----------");
        mostrarLista(paisesLista);

//Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
//Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
//país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
//en el conjunto se le informará al usuario 
        System.out.println("Ahora ingrese país a buscar:");
        String busqueda = leer.next();

        Iterator<String> it = paisesLista.iterator();

        while (it.hasNext()) {
            if (busqueda.equals(it.next())) {
                System.out.println("Se encontró a " + busqueda + " en la lista. Se eliminará de la misma.");
                it.remove();
            } else {
                System.out.println("No se encontró el país.");
                break;
            }
        }

        System.out.println("-----------Lista de Países Final:-----------");
        mostrarLista(paisesLista);

    }

    //método para mostrar la ArrayList (se coloca static porque ambos tanto el del método como el del main, apuntan a la misma lista
    static void mostrarLista(ArrayList<String> lista) {
        //lista = new ArrayList();
        for (String index : lista) {

            System.out.println(index);

        }
    }

}
