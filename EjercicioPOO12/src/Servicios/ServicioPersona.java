package Servicios;

import ejerciciopoo12.Persona;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class ServicioPersona {

    private int anios;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
//al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
//que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    public Persona crearPersona() {
        System.out.println("Ingrese Nombre:");
        String nombre = leer.next();

        System.out.println("Ingrese Año de fecha de nacimiento:");
        int anio = leer.nextInt();
        System.out.println("Ingrese Mes de fecha de nacimiento:");
        int mes = leer.nextInt();
        System.out.println("Ingrese Día de fecha de nacimiento:");
        int dia = leer.nextInt();

        LocalDate date_nacimiento = LocalDate.of(anio, mes, dia);

        return new Persona(nombre, date_nacimiento);

    }

//Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
//Tener en cuenta que para conocer la edad de la persona también se debe
//conocer la fecha actual.
    public void calcularEdad(Persona p) {

        LocalDate actual_date = LocalDate.now();

        anios = Period.between(p.getFecha_nac(), actual_date).getYears();
        System.out.println("La persona tiene " + anios + " años.");
        

    }

    public boolean menorQue(int edad) {

        //  System.out.println("anios:" + anios);
        if (anios > edad) {
            return true;
        } else {
            return false;
        }

    }

//• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
    public void mostrarPersona(Persona p) {

        int anio, mes, dia;

        anio = p.getFecha_nac().getYear();
        mes = p.getFecha_nac().getMonthValue();
        dia = p.getFecha_nac().getDayOfMonth();

        System.out.println("El nombre de la persona es: " + p.getNombre());

        System.out.println("Y nació el " + dia + " del mes n° " + mes + " de " + anio + ".");
    }
}
