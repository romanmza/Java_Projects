//Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
//Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
//película (en horas). Implemente las clases y métodos necesarios para esta
//situación, teniendo en cuenta lo que se pide a continuación:
//En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
//usuario todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
//si quiere crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//en pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//en pantalla.
//• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
//Nota: recordar el uso del Comparator para ordenar colecciones con objetos
package ejerciciocollect_4;

import ejerciciocollect_4.entiddes.Pelicula;
import ejerciciocollect_4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class EjercicioCollect_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> listaPeliculas = new ArrayList();

        boolean salir = false;
        String option = "";
        do {
            System.out.println("----------AGREGAR PELÍCULA----------");
            System.out.println("Ingrese Título de la película: ");
            String titulo = leer.next();
            System.out.println("Ingrese Director de la película: ");
            String director = leer.next();
            System.out.println("Ingrese duración [minutos] de la película:");
            int duracion = leer.nextInt();
            //Agregamos a la lista el nuevo objeto creado desde el ingreso por teclado
            listaPeliculas.add(new Pelicula(titulo, director, duracion));

            System.out.println("¿Desea agregar otra película? (S para sí, N para no)");
            option = leer.next();
            if (option.equals("N")) {
                salir = true;
            } else if (option.equals("S")) {
                salir = false;
            } else {
                System.out.println("Opción incorrecta. Se cerrará el programa.");
                salir = true;
            }
        } while (salir == false);
        //• Mostrar en pantalla todas las películas.

        System.out.println("----------Lista de películas agregadas----------");
        for (Pelicula aux : listaPeliculas) {
            aux.mostrarObjeto(aux);
        }

//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        System.out.println("----------Lista de películas con duración mayor a una hora:----------");
        for (Pelicula aux : listaPeliculas) {

            if (aux.getDuracion() > 60) {
                aux.mostrarObjeto(aux);
            }
        }
        //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
        //en pantalla.

        System.out.println("----------Lista de películas ordenadas de mayor a menor por Duración:----------");

        listaPeliculas.sort(Comparadores.compDurMayor);
        for (Pelicula aux : listaPeliculas) {
            aux.mostrarObjeto(aux);
        }

        //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//en pantalla.
        System.out.println("----------Lista de películas ordenadas de menor a mayor por Duración:----------");

        listaPeliculas.sort(Comparadores.compDurMenor);
        for (Pelicula aux : listaPeliculas) {
            aux.mostrarObjeto(aux);
        }

//• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
        System.out.println("----------Lista de películas ordenadas alfabéticamente por Título:----------");

        listaPeliculas.sort(Comparadores.compTitulo);
        for (Pelicula aux : listaPeliculas) {
            aux.mostrarObjeto(aux);
        }

//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
        System.out.println("----------Lista de películas ordenadas alfabéticamente por Director:----------");

        listaPeliculas.sort(Comparadores.compDirector);
        for (Pelicula aux : listaPeliculas) {
            aux.mostrarObjeto(aux);
        }
        


    }

}
