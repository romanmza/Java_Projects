package ej_herencia_1.entidades;


//colocamos la clase Animal como abstracta para que el usuario no pueda generar objetos del tipo Animal, sino objetos del tipo Gato, Perro, etc
//utilizando los constructores de las subclases
public abstract class Animal {

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //el método lo definimos como abstracto para "forzar" a las clases hijas a generar sus propios métodos "alimentarse", adaptando el código a cada 
    //caso en particular
    
    //ahora bien, si quisiéramos escribir sólo una vez el método alimentarse (en esta clase), no se podría adaptar a cada clase, pero todas las clases
    //hija podrían usarlo (para ello no debería ser abstracto el método)
    public abstract void alimentarse(); 
        //System.out.println(this.nombre + " se alimenta de " + this.alimento);
    

}
