package ejemplo_poo.entidades;

public class Mascota {

    private String nombre;
    private String apodo;

    //conejo, gato, perro, loro, etc
    public String tipo;
    public String color;
    public int edad;
    public boolean cola;
    public String raza;

    //definimos el método constructor
    public Mascota() //El nombre siempre debe ser el mismo que el de la clase, en este caso "Mascota"
    {

    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }

}
