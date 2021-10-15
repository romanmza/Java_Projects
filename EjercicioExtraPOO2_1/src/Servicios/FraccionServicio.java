package Servicios;

import ejercicioextrapoo2_1.Fraccion;
import java.util.Scanner;

public class FraccionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Fraccion nuevafraccion() {

        System.out.println("Ingrese valor del numerador:");
        int numerador = leer.nextInt();
        System.out.println("Ingrese valor del denominador:");
        int denominador = leer.nextInt();
        return new Fraccion(numerador, denominador);
    }

    public void sumar(Fraccion f1, Fraccion f2) {

        int den_salida = (f1.getDenominador() * f2.getDenominador()) / maximoComunDivisor(f1.getDenominador(), f2.getDenominador());
        int num_salida = (den_salida / f1.getDenominador() * f1.getNumerador()) + (den_salida / f2.getDenominador() * f2.getNumerador());

        System.out.println("La suma de " + f1.getNumerador() + "/" + f1.getDenominador() + " + " + f2.getNumerador() + "/" + f2.getDenominador() + " es: " + num_salida + "/" + den_salida);

    }

    public void restar(Fraccion f1, Fraccion f2) {

        int den_salida = (f1.getDenominador() * f2.getDenominador()) / maximoComunDivisor(f1.getDenominador(), f2.getDenominador());
        int num_salida = (den_salida / f1.getDenominador() * f1.getNumerador()) - (den_salida / f2.getDenominador() * f2.getNumerador());

        System.out.println("La suma de " + f1.getNumerador() + "/" + f1.getDenominador() + " + " + f2.getNumerador() + "/" + f2.getDenominador() + " es: " + num_salida + "/" + den_salida);

    }

    public void multiplicar(Fraccion f1, Fraccion f2) {

        int den_salida = f1.getDenominador() * f2.getDenominador();
        int num_salida = f1.getNumerador() * f2.getNumerador();
        
        //ahora reducimos la fracción, si es posible
        int mcm = maximoComunDivisor(num_salida, den_salida);
        num_salida = num_salida / mcm;
        den_salida = den_salida / mcm;
        System.out.println("La multiplicacion de " + f1.getNumerador() + "/" + f1.getDenominador() + " + " + f2.getNumerador() + "/" + f2.getDenominador() + " es: " + num_salida + "/" + den_salida);

    }

    public void dividir(Fraccion f1, Fraccion f2) {

        int den_salida = f1.getDenominador() * f2.getNumerador();
        int num_salida = f1.getNumerador() * f2.getDenominador();
        
        int mcm = maximoComunDivisor(num_salida, den_salida);
        num_salida = num_salida / mcm;
        den_salida = den_salida / mcm;

        System.out.println("La división de " + f1.getNumerador() + "/" + f1.getDenominador() + " + " + f2.getNumerador() + "/" + f2.getDenominador() + " es: " + num_salida + "/" + den_salida);

    }

    //función auxiliar para obtener el máximo común divisor
    public static int maximoComunDivisor(int a, int b) {
        int temporal;//Para no perder b
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }
}
