//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
//String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
//en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
//quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
package ejerciciocollect_1_1;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
//import java.util.Iterator;
import java.util.Scanner;

public class EjercicioCollect_1_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> perros = new ArrayList();

        System.out.println("Almacén de Raza de perros");
        boolean salir = false;
        String option = "";
        do {
            System.out.println("Ingrese A para agregar una nueva raza o S para salir.");
            option = leer.next();
            if (option.equals("A")) {
                System.out.println("Ingrese el nombre de la raza de perro:A ");
                perros.add(leer.next());
            } else if (option.equals("S")) {
                salir = true;
            } else {
                System.out.println("Opción incorrecta.");
            }

        } while (salir == false);
        System.out.println("Las razas de perro ingresadas son: ");
        //para recorrer la lista:
        for (String razas : perros) {
            System.out.println(razas);
            //System.out.println("");
        }
        System.out.println("Hasta Luego!");

//        System.out.println("Ordenadas:");
//        Collections.sort(perros);
//
//        for (String razas : perros) {
//            System.out.println(razas);
//            //System.out.println("");
//        }
    }

}

/*

        ArrayList<Integer> lista1 = new ArrayList();
        lista1.add(3);
        for (int i = 0; i < 10; i++) {
            lista1.add((int)(Math.random()*10));

        }

        //recorrer la lista:
//        for (int recorre : lista1) {
//            System.out.println("Valor: " + recorre);
//        }
//        Iterator iterator = lista1.iterator();
//        //recorremos con el iterator la lista, en un while
//
//        while (iterator.hasNext() == true) {
//            if (iterator.next() == "3") {
//                iterator.remove();
//            }
//            System.out.println(iterator.next() + " ");
//
//            System.out.println();
//        }
        Iterator iterator = lista1.iterator();
        // Devolvemos el iterador 
        
        System.out.println("Elementos de la lista : ");
// Usamos un while para recorrer la lista, siempre que el hasnext()
// devuelva true.
        
                while (iterator.hasNext()) // Mostramos los elementos con el iterator.next()
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        
        Collections.sort(lista1);
        
        Iterator <Integer> it = lista1.iterator();
        while (it.hasNext()) {
            if (it.next() ==3) { // Borramos si está el numero 3
                it.remove();
            }
        }
        
        
        Iterator it2 = lista1.iterator();

        while (it2.hasNext()) // Mostramos los elementos con el iterator.next()
        {
            System.out.print(it2.next() + " ");
        }
        
        System.out.println("Tamaño: "+lista1.size());
    }
}
 */
