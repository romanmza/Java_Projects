package ejerciciocollect_2.entidades;

import java.util.Comparator;

public class Perro {

    private String raza;
    private String nombre;

    public Perro() {
    }

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", nombre=" + nombre + '}';
    }
    
    
    public static Comparator<Perro> compararRaza = new Comparator<Perro>() {
        @Override
        public int compare(Perro p1, Perro p2) {
            return p1.getRaza().compareTo(p2.getRaza());
        }
    };

}
