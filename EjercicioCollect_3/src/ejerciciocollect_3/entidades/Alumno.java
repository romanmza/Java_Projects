package ejerciciocollect_3.entidades;

public class Alumno {

    private String nombre;

    private int notas[] = new int[3];

    public Alumno(String nombre, int notas[]) {
        this.nombre = nombre;
        this.notas[0] = notas[0];
        this.notas[1] = notas[1];
        this.notas[2] = notas[2];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

//Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
//su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
//método. Dentro del método se usará la lista notas para calcular el promedio final
//de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
//main.
    public double notaFinal(String nombre) {
        double nota = 0;
        nota = (notas[0] + notas[2] + notas[2]) / 3;

        return nota;
    }

    public void prueba() {
        System.out.println("nombre: " + nombre);
        System.out.println("notas: " + notas.toString());
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

}
