package ej_jpa_ejemplo_1.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Curso {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private Integer precio;
private String nombreCurso;

@OneToOne
private Profesor profesor;

    public Curso() {
    }

    public Curso(Integer id, Integer precio, String nombreCurso, Profesor profesor) {
        this.id = id;
        this.precio = precio;
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }


}
