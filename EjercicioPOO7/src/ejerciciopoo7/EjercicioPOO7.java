//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
//otro atributo, puede hacerlo. Los métodos que se implementarán son:
//• Un constructor por defecto.
//• Un constructor con todos los atributos como parámetro.
//• Métodos getters y setters de cada atributo.
//• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
//función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
//(incluidos), significa que el peso está por debajo de su peso ideal y la función
//devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
//significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
//hacer uso de constantes para devolver estos valores.
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
//en distintas variables, para después en el main, calcular un porcentaje de esas 4
//personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
//encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
//cuantos menores
package ejerciciopoo7;

import Servicios.ServicioPersona;

public class EjercicioPOO7 {

    public static void main(String[] args) {
        int dim = 4;
        //arrays para guardar los porcentajes:
        int listaIMC[] = new int[dim];
        boolean listaMayores[] = new boolean[dim];

        ServicioPersona servicio1 = new ServicioPersona();

        //para cargar múltiples objetos en un bucle, usamos un array de objetos de la clase Persona,
        //entonces creamos ese array: 
        Persona personas[] = new Persona[dim];
        


        for (int i = 0; i < dim; i++) {
            //instanciamos cada elemento del array, que será cada objeto de la clase Persona
            personas[i] = servicio1.NuevaPersona();
            
            //aplicamos los métodos para calculos en cada objeto creado:
            listaIMC[i] = servicio1.calcularIMC(personas[i]);
            listaMayores[i] = servicio1.esMayorDeEdad(personas[i]);

        }

        cal_porc(listaIMC, listaMayores, dim);

    }
    
    
    
    
    
    
    

    static public void cal_porc(int in_lista[], boolean in_mayores[], int in_dim) {
        double cont_1 = 0;
        double cont_2 = 0;
        double cont_3 = 0;
        double cont_4 = 0;
        double cont_5 = 0;

        for (int i = 0; i < in_dim; i++) {

            switch (in_lista[i]) {
                case -1:
                    cont_1++;
                    break;
                case 0:
                    cont_2++;
                    break;
                case 1:
                    cont_3++;
                    break;
            }

            if (in_mayores[i] == true) {
                cont_4++;

            } else {
                cont_5++;
            }

        }
        cont_1 = cont_1 * 100 / in_dim;
        cont_2 = cont_2 * 100 / in_dim;
        cont_3 = cont_3 * 100 / in_dim;
        cont_4 = cont_4 * 100 / in_dim;
        cont_5 = cont_5 * 100 / in_dim;

        System.out.println("Porcentaje de personas por debajo de su peso: " + cont_1+"%");
        System.out.println("Porcentaje de personas con peso ideal: " + cont_2+"%");
        System.out.println("Porcentaje de personas con sobrepeso: " + cont_3+"%");
        System.out.println("Porcentaje de personas mayores de edad: " + cont_4+"%");
        System.out.println("Porcentaje de personas menores de edad: " + cont_5+"%");

    }


}
