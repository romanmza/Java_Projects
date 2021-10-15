//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los
//guarda en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
//si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
//error. Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
//pasar una división por cero, el método devuelve 0 y se le informa al usuario el
//error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
//al main
package ejerciciopoo3;

import ejerciciopoo3.entidades.Operacion;

public class EjercicioPOO3 {

    public static void main(String[] args) {

        double operacion = 0;
        double operacion2 = 0;

        Operacion mi_operacion1 = new Operacion();
        Operacion mi_operacion2 = new Operacion(2, 5);

        mi_operacion1.crearOperacion();
        
        System.out.println("suma de mi operacion 1: " + mi_operacion1.sumar());
        System.out.println("resta de mi operacion 1: " + mi_operacion1.restar());

        operacion = mi_operacion1.multiplicar();
        if (operacion == 0) {
            System.out.println("Número 2 de la operación igual a 0");
        } else {
            System.out.println("multiplicacion de mi operacion 1: " + operacion);
        }

        operacion = mi_operacion1.dividir();
        if (operacion == 0) {
            System.out.println("Número 2 de la operación igual a 0");
        } else {
            System.out.println("división de mi operacion 1: " + operacion);
        }
        
        

        System.out.println("suma de mi operacion 2: " + mi_operacion2.sumar());
        System.out.println("resta de mi operacion 2: " + mi_operacion2.restar());

        operacion = mi_operacion2.multiplicar();
        if (operacion == 0) {
            System.out.println("Algunos de los operandos es igual a 0");
        } else {
            System.out.println("multiplicacion de mi operacion 2: " + operacion);
        }

        operacion = mi_operacion2.dividir();
        if (operacion == 0) {
            System.out.println("Alguno de los operandos es igual a 0");
        } else {
            System.out.println("división de mi operacion 2: " + operacion);
        }

//        if (mi_operacion2.multiplicar() == 0) {
//            System.out.println("Número 2 de la operación igual a 0");
//        } else {
//            System.out.println("multiplicacion de mi operacion 2: " + mi_operacion2.multiplicar());
//        }
//
//        if (mi_operacion2.dividir() == 0) {
//            System.out.println("Número 2 de la operación igual a 0");
//        } else {
//            System.out.println("división de mi operacion 2: " + mi_operacion2.dividir());
//        }
    }

}
