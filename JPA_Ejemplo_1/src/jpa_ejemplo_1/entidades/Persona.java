package jpa_ejemplo_1.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
    
    private String nombre;
    @Id
    private Integer id;

    public Persona() {
    }

    public Persona(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return id;
    }

    public void setEdad(Integer id) {
        this.id = id;
    }
    
    
    

}
