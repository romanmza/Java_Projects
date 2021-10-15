package Relaciones_1.servicios;

import Relaciones_1.entidades.Perro;
import Relaciones_1.entidades.Persona;
import java.util.Scanner;

public class servicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private servicioPerro servicioPerro1 = new servicioPerro();

    public Persona crearPersona() {
        System.out.println("Ingrese los datos de la persona:");
        System.out.println("Nombre:");
        String nombre = leer.next();
        System.out.println("Apellido:");
        String apellido = leer.next();
        System.out.println("Edad:");
        int edad = leer.nextInt();
        System.out.println("Documento:");
        long dni = leer.nextLong();

        System.out.println("Ahora ingrese los datos del perro a adoptar:");

        Perro perro_adoptado1 = servicioPerro1.crearPerro();

        return new Persona(nombre, apellido, edad, dni, perro_adoptado1);
    }

    public void mostrarPersona(Persona p) {
        System.out.println("---------------------------------");
        System.out.println("Datos de la persona:");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido: " + p.getApellido());
        System.out.println("Edad: " + p.getEdad() + " años.");
        System.out.println("Documento: " + p.getDocumento());
        System.out.println("---------------------------------");
        System.out.println("Datos de su mascota adoptada:");

        servicioPerro1.mostrarPerro(p.getPerro_adoptado());

    }
}
