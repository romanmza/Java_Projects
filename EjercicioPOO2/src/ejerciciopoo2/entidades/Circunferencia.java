package ejerciciopoo2.entidades;

import java.util.Scanner;

public class Circunferencia {
    
    //definición de clases:

    private double radio;

    //Metodo contructor que inicialice el radio pasado como parámetro:
    public Circunferencia(float radio) {
        this.radio = radio;
    }

    //metodos getter y setter:
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
//del objeto.
    public void crear_circunferencia() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el radio de la circunferencia: ");
        this.radio = leer.nextFloat();

    }

    //Método area(): para calcular el área de la circunferencia (Area = π * radio^2). Este método muestra directamente la salida
    public void area() {
        double area_circ;
        area_circ = Math.PI * this.radio * this.radio;

        System.out.println("El área de la circunferencia es: " + area_circ);
        

    }

    //e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * π * radio) Este método sólo devuelve la salida para verla desde el main
    public double perimetro() {
        double perim_circ;
        perim_circ = Math.PI * this.radio * 2;

       // System.out.println("El perímetro de la circunferencia es: " + perim_circ);
        return perim_circ;

    }
}
