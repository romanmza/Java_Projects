package ejerciciopoo3.entidades;

import java.util.Scanner;

public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese número 1: ");
        numero1 = leer.nextInt();

        System.out.println("Ingrese número 2: ");
        numero2 = leer.nextInt();

    }

    public int sumar() {
        int suma = 0;
        suma = numero1 + numero2;
        return suma;
    }

    public int restar() {
        int resta = 0;
        resta = numero1 - numero2;
        return resta;
    }

    public int multiplicar() {
        int multiplicacion = 1;
        if (numero2 == 0 || numero1 == 0) {
            return 0;
        } else {
            multiplicacion = numero1 * numero2;
            return multiplicacion;
        }
    }

    public double dividir() {
        double division = 1;
        if (numero2 == 0 || numero1==0) {
            return 0;
        } else {
            division =(double) numero1 / numero2;
            return division;
        }

    }

}
