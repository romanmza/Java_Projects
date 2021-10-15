package ej_herencia_2.servicios;

import ej_herencia_2.entidades.Electrodomestico;
import java.util.Scanner;

public class servicio_Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//    Método comprobarConsumoEnergetico(char letra): comprueba que la letra
//es correcta, sino es correcta usara la letra F por defecto. Este método se debe
//invocar al crear el objeto y no será visible.
    public boolean comprobar_Consumo_Energetico(char letra) {
        if (letra != 'A' || letra != 'B') {
            return false;
        } else {
            return true;
        }
    }

//    Método comprobarColor(String color): comprueba que el color es correcto, y
//si no lo es, usa el color blanco por defecto. Los colores disponibles para los
//electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
//está en mayúsculas o en minúsculas. Este método se invocará al crear el
//objeto y no será visible
    public boolean comprobar_color(String color) {
        if (color.equals("blanco") == false && color.equals("negro") == false) {
            return false;
        } else {
            return true;
        }

    }

// Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el
//consumo. Al precio se le da un valor base de $1000
    public Electrodomestico crearElectrodomestico() {
        System.out.println("Ingrese los valores del nuevo electrodoméstico a crear: ");
        // System.out.println("1. Ingrese precio: ");
        //  double precio = leer.nextDouble();
        double precio_base = 1000;
        System.out.println("1. Ingrese color: ");
        String color = leer.next();
        System.out.println("1. Ingrese índice para consumo energético: ");
        System.out.println("[A],[B],[C],[D],[E],o [F] ");
        char consumo = leer.next().charAt(0);
        System.out.println("1. Ingrese peso: ");
        double peso = leer.nextDouble();
        if (comprobar_Consumo_Energetico(consumo) == false) {
            consumo = 'F';
        }
        if (comprobar_color(color) == false) {
            color = "blanco";
        }
        return new Electrodomestico(precio_base, color, consumo, peso);
    }
}
