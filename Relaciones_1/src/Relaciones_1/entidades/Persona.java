


package Relaciones_1.entidades;

public class Persona {

    private String nombre;

    private String apellido;

    private int edad;

    private long documento;

    private Perro perro_adoptado;

    public Persona(String nombre, String apellido, int edad, long documento, Perro perro_adoptado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro_adoptado = perro_adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public Perro getPerro_adoptado() {
        return perro_adoptado;
    }

    public void setPerro_adoptado(Perro perro_adoptado) {
        this.perro_adoptado = perro_adoptado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro_adoptado=" + perro_adoptado + '}';
    }

    
}
