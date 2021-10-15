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
package relaciones_2.entidades;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    //en el main ( o en alguna clase de servicio) hago un array de jugadores y lo transfiero aquí
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        this.jugadores = jugadores;
        this.revolver = r;
    }

    public int ronda() {
        int i = 1;
        boolean flag_mojado = false;

        do {

            for (Jugador aux : jugadores) {
                System.out.println("-------------------------------------");
                System.out.println("¡Turno del jugador " + i + "!");
                System.out.println("Dispara!! ");

                if (aux.disparo(revolver) == true) {
                    System.out.println("Jugador mojado! Fin del juego.");
                    aux.setMojado(true);
                    flag_mojado = true;
                    //System.out.println("El jugador que se mojó fue el número " + i);
                    break;

                } else {
                    System.out.println("¡Se ha salvado! ...próximo jugador.");
                    i++;
                }

            }
            i = 1;
        } while (flag_mojado == false);

        return i;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
}
