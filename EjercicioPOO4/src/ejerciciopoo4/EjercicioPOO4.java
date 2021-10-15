//Crear una clase Rectángulo que modele rectángulos por medio de un atributo
//privado base y un atributo privado altura. La clase incluirá un método para crear el
//rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
//método para calcular la superficie del rectángulo y un método para calcular el
//perímetro del rectángulo. Por último, tendremos un método que dibujará el
//rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
//los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2


package ejerciciopoo4;

import java.util.Scanner;


public class EjercicioPOO4 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int base;
        int altura;
        
        System.out.println("Ingrese base del rectángulo: ");
        base = leer.nextInt();

        System.out.println("Ingrese altura del rectángulo: ");
        altura = leer.nextInt();
        
        Rectangulo miRectangulo = new Rectangulo(base, altura);
        
        System.out.println("Superficie del rectángulo: "+miRectangulo.calc_super());
        System.out.println("Perímetro del rectángulo: "+miRectangulo.calc_perim());
        
        miRectangulo.dibujar();

    }

}
