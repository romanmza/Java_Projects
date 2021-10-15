package pooej7.entidades;


public class Persona {
    
    private String nombre;
    private String sexo;
    private int dni;
    private int edad;
    private double peso;
    private double altura;
    private int imc;
    private boolean mayor;
    
    
    public Persona() {
    }

    public Persona(String nombre, String sexo, int dni, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int getImc() {
        return imc;
    }
    
    public void setImc(int imc) {
        this.imc = imc;
    }

    public boolean isMayor() {
        return mayor;
    }
    
    
    
    public void setMayor(boolean mayor) {
        this.mayor = mayor;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", dni=" + dni + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + ", mayor=" + mayor + '}';
    }

    
    
    
    
    
    
    
      
    

    

    
    
    
    
    
    
    
}
