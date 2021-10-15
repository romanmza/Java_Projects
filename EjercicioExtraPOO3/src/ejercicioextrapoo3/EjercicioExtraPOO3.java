//Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
//ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
//y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
//constructor. Luego, las operaciones que se podrán realizar son las siguientes:
//• Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
//• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
//• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
//para que esto ocurra, el discriminante debe ser igual que 0.
//• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2
//posibles soluciones.
//• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
//• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
//caso de no existir solución, se mostrará un mensaje.
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
//delante de -b


package ejercicioextrapoo3;

import java.util.Scanner;


public class EjercicioExtraPOO3 {


    public static void main(String[] args) {
        int a,b,c;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        
        System.out.println("Ingrese el valor de la constante A de la ecuación: ");
        a=leer.nextInt();
        System.out.println("Ingrese el valor de la constante B de la ecuación: ");
        b=leer.nextInt();        
        System.out.println("Ingrese el valor de la constante C de la ecuación: ");
        c=leer.nextInt();   
        
        Raices raiz1 = new Raices(a,b,c);
        raiz1.calcular();
        
    }

}
