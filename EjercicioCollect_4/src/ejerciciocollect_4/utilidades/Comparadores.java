package ejerciciocollect_4.utilidades;

import ejerciciocollect_4.entiddes.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> compDurMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDuracion().compareTo(p2.getDuracion());

        }
    };
    public static Comparator<Pelicula> compDurMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p2.getDuracion().compareTo(p1.getDuracion());

        }
    };

    public static Comparator<Pelicula> compTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getTitulo().compareTo(p2.getTitulo());

        }
    };

    public static Comparator<Pelicula> compDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDirector().compareTo(p2.getDirector());

        }
    };
}
