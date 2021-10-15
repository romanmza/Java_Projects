package Servicios;

import ejerciciopoo7.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //   Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
//    
    public Persona NuevaPersona() {
        System.out.println("Ingrese Nombre:");
        String nombre = leer.next();

        System.out.println("Ingrese Edad:");
        int edad = leer.nextInt();

        System.out.println("Ingrese Sexo: 'H', 'M' u 'O'");
        String sexo = leer.next();

        System.out.println("Ingrese Peso:");
        double peso = leer.nextDouble();

        System.out.println("Ingrese Altura:");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

//Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
//función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
//(incluidos), significa que el peso está por debajo de su peso ideal y la función
//devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
//significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
//hacer uso de constantes para devolver estos valores.
    public int calcularIMC(Persona p) {
        double imc = p.getPeso() / (p.getAltura() * p.getAltura());
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
    public boolean esMayorDeEdad(Persona p) {
        if (p.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
