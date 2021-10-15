package ejerciciocollect_2.servicios;

import ejerciciocollect_2.entidades.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPerro {

    private Scanner leer;

    private ArrayList<Perro> ListaPerros;

    //con el constructor vacío, cada vez que llamemos al método, hacemos nacer un nuevo objeto del tipo ArrayList
    public ServicioPerro() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.ListaPerros = new ArrayList();
    }

    private Perro crearPerro() {
        System.out.println("Ingrese nombre de raza de perro: ");
        String raza = leer.next();

        System.out.println("Ingrese nombre de perro:");
        String nombre = leer.next();

        return new Perro(raza, nombre);

    }

    private void agregarALista(Perro p) {
        ListaPerros.add(p);
    }

    public void agregarPerro() {
        agregarALista(crearPerro());
    }

    public void mostrarPerros() {
        System.out.println("Los perros de la lista son: ");
        for (Perro aux : ListaPerros) {
            System.out.println(aux);
        }
        System.out.println("Otra forma:");
        System.out.println(ListaPerros.toString());
        System.out.println("La cantidad de perros en la lista es: ");
        System.out.println(ListaPerros.size());

    }

//    public void buscarPerro(String index) {
//        Iterator iterator = ListaPerros.iterator();
//        String nombre = "raza=";
//        nombre = nombre + index;
//
//        while (iterator.hasNext()) {
//
//            Object objetoperro = iterator.next();
//
//            //System.out.println(objetoperro);
//            if (objetoperro.toString().contains(nombre)) {
//                System.out.println("Raza encontrada! Se eliminará de la lista");
//                iterator.remove();
//            }
//        }
//    }
    public void buscarPerro(String index) {
        Iterator<Perro> iterator = ListaPerros.iterator();

        while (iterator.hasNext()) {

            Perro aux = iterator.next();

            if (aux.getRaza().equals(index)) {
                System.out.println("Raza encontrada! Se eliminará de la lista");
                iterator.remove();
            }

        }
        Iterator <Perro> iterator2 = ListaPerros.iterator();
    }

    public void ordenarListaPorRaza() {
        System.out.println("Ordenamos la lista por raza");
        ListaPerros.sort(Perro.compararRaza);

    }

    @Override
    public String toString() {
        return "ServicioPerro{" + "leer=" + leer + ", ListaPerros=" + ListaPerros + '}';
    }

}
