

package ejerciciopoo12;

import java.time.LocalDate;



public class Persona {
    private String nombre;
    private LocalDate fecha_nac;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fecha_nac) {
        this.nombre = nombre;
        this.fecha_nac = fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    


   
    
    
    

}
