package Relaciones_1.servicios;

import Relaciones_1.entidades.Perro;
import java.util.Scanner;

public class servicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {

        System.out.println("Nombre del perro:");
        String nombre_perro = leer.next();
        System.out.println("Raza del perro:");
        String raza = leer.next();
        System.out.println("Edad del perro:");
        int edad_perro = leer.nextInt();
        System.out.println("Tamaño del perro:");
        String tamanio_perro = leer.next();

        return new Perro(nombre_perro, raza, edad_perro, tamanio_perro);

    }

    public void mostrarPerro(Perro p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Raza: " + p.getRaza());
        System.out.println("Edad: " + p.getEdad() + " años.");
        System.out.println("Tamaño: " + p.getTamanio());
    }

}
