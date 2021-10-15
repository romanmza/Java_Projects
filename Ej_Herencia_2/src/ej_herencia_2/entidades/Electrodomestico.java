package ej_herencia_2.entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumo_energetico;
    protected Double peso;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumo_energetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(char consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    //    Método comprobarConsumoEnergetico(char letra): comprueba que la letra
//es correcta, sino es correcta usara la letra F por defecto. Este método se debe
//invocar al crear el objeto y no será visible.
    private void comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        switch (letra) {
            case 'A':
                consumo_energetico = letra;
                break;
            case 'B':
                consumo_energetico = letra;
                break;
            case 'C':
                consumo_energetico = letra;
                break;
            case 'D':
                consumo_energetico = letra;
                break;
            case 'E':
                consumo_energetico = letra;
                break;
            case 'F':
                consumo_energetico = letra;
                break;
            default:
                consumo_energetico = 'F';
        }
    }

//    Método comprobarColor(String color): comprueba que el color es correcto, y
//si no lo es, usa el color blanco por defecto. Los colores disponibles para los
//electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
//está en mayúsculas o en minúsculas. Este método se invocará al crear el
//objeto y no será visible
    private void comprobarColor(String color) {
        color = color.toUpperCase();
        switch (color) {
            case "BLANCO":
                this.color = "BLANCO";
                break;
            case "NEGRO":
                this.color = "NEGRO";
                break;
            case "AZUL":
                this.color = "AZUL";
                break;
            case "GRIS":
                this.color = "GRIS";
                break;
            default:
                this.color = "BLANCO";
        }

    }

// Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el
//consumo. Al precio se le da un valor base de $1000
    protected void crearElectrodomestico() {
        System.out.println("Ingrese los valores del nuevo electrodoméstico a crear: ");
        // System.out.println("1. Ingrese precio: ");
        //  double precio = leer.nextDouble();
        double precio_base = 1000;
        precio = precio_base;
        System.out.println("1. Ingrese color: ");
        color = leer.next();
        comprobarColor(color);
        System.out.println("1. Ingrese índice para consumo energético: ");
        System.out.println("[A],[B],[C],[D],[E],o [F] ");
        consumo_energetico = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumo_energetico);
        System.out.println("1. Ingrese peso: ");
        peso = leer.nextDouble();

    }

    protected void precioFinal() {
        switch (consumo_energetico) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;

        }

        if (peso >= 1 && peso <= 19) {
            precio += 100;
        }
        if (peso > 19 && peso <= 49) {
            precio += 500;
        }
        if (peso > 49 && peso <= 79) {
            precio += 800;
        }
        if (peso > 79) {
            precio += 1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo_energetico=" + consumo_energetico + ", peso=" + peso + '}';
    }



}
