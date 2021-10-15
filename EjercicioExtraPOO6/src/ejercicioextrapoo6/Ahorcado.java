package ejercicioextrapoo6;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

    private String[] palabra;
    private int encontradas = 0;
    private int intentos;
    private String str_palabra;
    private int restantes;

    public Ahorcado(String[] palabra, int intentos) {
        this.palabra = palabra;
        this.intentos = intentos;
    }

    public Ahorcado() {
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void crearJuego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese palabra para jugar");
        str_palabra = leer.next();
        System.out.println("Ahora ingrese la cantidad de intentos disponibles:");
        intentos = leer.nextInt();
        //creamos el arreglo con la dimension de la palabra que ingreso el usuario
        palabra = new String[str_palabra.length()];

        //igualamos la variable "restantes" a la cantidad de letras de la palabra
        restantes = str_palabra.length();

        //con la funcion split metemos cada caracter en un elemento del arreglo anterior 
        //para ello el separador del split es nada o sea ""
        palabra = str_palabra.split("");

        System.out.println(Arrays.toString(palabra));
    }

    //Metodo longitud() muestra la longitud de la palabra que se desea encintrar
    public void longitud() {
        System.out.println("La longitud de la palabra a encontrar es de: " + str_palabra.length() + " caracteres.");
    }

    //Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
    //letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public void buscar(String c) {

        //una forma: buscar el caracter directamente en el string
        int index = str_palabra.indexOf(c);

        if (index > 0) {
            System.out.println("La letra pertenece a la palabra");

        } else {
            System.out.println("La letra no pertenece a la palabra");

        }

    }
//Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.

    public boolean encontradas(String c) {

        int contador = 0;

        for (int i = 0; i < palabra.length; i++) {
            if (c.equals(palabra[i])) {
                contador++;
                restantes--;

            }

        }

        if (contador > 0) {
            System.out.println("La cantidad de letras '" + c + "' encontradas fue de: " + contador);
            if (restantes > 0) {
                System.out.println("¡Todavía faltan encontrar " + restantes + " letras en la palabra!");
            }

            return true;
        } else {

            return false;
        }

    }
    //  Método intentos(): para mostrar cuantas oportunidades le queda al jugador.

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + intentos);
    }

    //  Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
    public void juego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Juego del Ahorcado!");
        crearJuego();
        do {
            System.out.println("----------------------------");
            longitud();
            System.out.println("Ingrese una letra a buscar en la palabra:");
            String letra = leer.next();
            buscar(letra);
            if (encontradas(letra) == false) {
                intentos--;
                System.out.println("Número de oportunidades restantes: " + intentos);
            }

        } while (intentos > 0&& restantes >0);
        if (intentos == 0) {
            System.out.println("Se agotaron las oportunidades. Gracias por jugar!");
        } else {
            System.out.println("¡Felicidades, ha descubierto la palabra!");
        }
    }
}
