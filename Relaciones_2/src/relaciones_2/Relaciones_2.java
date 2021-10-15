//Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
//trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
//carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:
//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
//(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
//posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
//aleatoriamente.
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
//valores deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
//Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
//(indica si está mojado o no el jugador). El número de jugadores será decidido por el
//usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
//Métodos:
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
//Jugadores) y Revolver
//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
//jugadores y el revolver para guardarlos en los atributos del juego.
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
//sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
//tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
package relaciones_2;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones_2.entidades.Juego;
import relaciones_2.entidades.Jugador;
import relaciones_2.entidades.RevolverAgua;

public class Relaciones_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Jugador> lista_jugadores = new ArrayList();
        RevolverAgua revolver_de_juego = new RevolverAgua();
        Juego juego1 = new Juego();
        

        //primero cargamos el revolver de juego:
        revolver_de_juego.llenarRevolver();

        System.out.println(revolver_de_juego.toString());

        //Luego le pedimos al usuario que ingrese la cantidad de jugadores:
        System.out.println("Ingrese la cantidad de jugadores:");
        int n_jugadores = leer.nextInt();
        if (n_jugadores > 6 || n_jugadores < 1) {
            System.out.println("Valor fuera de rango. Se hará el juego con 6 jugadores.");
            n_jugadores = 6;
        }

        //Ahora cargamos los datos para esta lista de jugadores:
        for (int i = 1; i <= n_jugadores; i++) {
            String nombre = "Jugador" + i;
            Jugador j = new Jugador(i, nombre, false);
            j.toString();
            lista_jugadores.add(j);

        }
        juego1.llenarJuego(lista_jugadores, revolver_de_juego);

        System.out.println(juego1.toString());

        juego1.ronda();

        for (Jugador aux : lista_jugadores) {

            if (aux.isMojado()) {
                System.out.println("Datos del jugador mojado: ");
                System.out.println(aux.toString());
            }

        }

    }

}
