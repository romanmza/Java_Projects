package ejerciciopoo1.entidades;

import java.util.Scanner;

public class Libro {

    private long isbn;
    private String autor;
    private String titulo;
    private int n_pag;

    //constructor completo
    public Libro(long isbn, String autor, String titulo, int n_pag) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.n_pag = n_pag;
    }
//constructor vacío

    public Libro() {
    }

    //getter para todos los atributos de la clase
    public long getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getN_pag() {
        return n_pag;
    }

    //setter para todos los atributos de la clase
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setN_pag(int n_pag) {
        this.n_pag = n_pag;
    }

    public void cargar_libro() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese ISBN:");
        this.isbn = leer.nextInt();
        System.out.println("Ingrese el Autor:");
        this.autor = leer.next();
        System.out.println("Ingrese el título:");
        this.titulo = leer.next();
        System.out.println("Ingrese Nro. de páginas del libro:");
        this.n_pag = leer.nextInt();
    }

    public void mostrar() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Autor: " + this.autor);
        System.out.println("Título del libro: " + this.titulo);
        System.out.println("Número de páginas del libro: " + this.n_pag);
    }

}
