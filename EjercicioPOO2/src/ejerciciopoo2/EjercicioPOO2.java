//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
//de tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
//del objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
package ejerciciopoo2;

import ejerciciopoo2.entidades.Circunferencia;

public class EjercicioPOO2 {

    public static void main(String[] args) {

        //Instancio un nuevo objeto de la clase Circunferencia
        Circunferencia circun1 = new Circunferencia(5);

        //utilizo el método area para calcular area. Este método no devuleve nada, y muestra por pantalla el resultado
        circun1.area();

        //utilizo el método perímetro para calcular per. Este método sólo devuelve el perímetro por lo que la salida por pantalla la hago
        //desde el main
        System.out.println("El perímetro es: " + circun1.perimetro());

    }

}
