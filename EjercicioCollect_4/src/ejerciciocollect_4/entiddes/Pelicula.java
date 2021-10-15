package ejerciciocollect_4.entiddes;

public class Pelicula {

    private String titulo;
    private String director;
    private Integer duracion;

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void mostrarObjeto(Pelicula p) {

        System.out.println("----------");
        System.out.println("Título: " + p.getTitulo());
        System.out.println("Director: " + p.getDirector());
        System.out.println("Duración: " + p.getDuracion());
    }
}
