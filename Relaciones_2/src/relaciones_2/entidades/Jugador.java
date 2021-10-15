//Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
//(indica si está mojado o no el jugador). El número de jugadores será decidido por el
//usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
//Métodos:
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.


package relaciones_2.entidades;


public class Jugador {
    private long id;
    private String nombre;
    private boolean mojado;

    public Jugador(long id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = "Jugador "+id;
        this.mojado = mojado;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
    
    
    
    public boolean disparo (RevolverAgua r)
    {
        System.out.println("Disparando gatillo...");
        mojado= r.mojar();
        r.siguienteChorro();
        if(mojado == true)
        {
            mojado =false;
            return true;
        }
        else
        {
           return false;
        }
        
    }

    
    
    }
    


