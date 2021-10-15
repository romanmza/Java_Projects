//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//Autor
//, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
//datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//el autor del libro y el numero de páginas.
package ejerciciopoo1;

import ejerciciopoo1.entidades.Libro;


public class EjercicioPOO1 {


    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        libro1.cargar_libro();
        
        System.out.println("Datos de Libro 1: ");
        libro1.mostrar();
        
        Libro libro2 = new Libro(12345678,"Roman","Titulo del libro", 750);
        
        System.out.println("Datos de Libro 2: ");
        libro2.mostrar();

    }
    
}
