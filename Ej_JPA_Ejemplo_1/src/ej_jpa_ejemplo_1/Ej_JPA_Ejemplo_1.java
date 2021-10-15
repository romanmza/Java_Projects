package ej_jpa_ejemplo_1;

import ej_jpa_ejemplo_1.entidades.Curso;
import ej_jpa_ejemplo_1.entidades.Profesor;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Ej_JPA_Ejemplo_1 {

    public static void main(String[] args) {
        EntityManager em
                = Persistence.createEntityManagerFactory("Ej_JPA_Ejemplo_1PU").createEntityManager();
        
        


Profesor profesor1 =new Profesor();
profesor1.setNombre("Profesor Jirafales");

em.getTransaction().begin();
//Persistimos el objeto
em.persist(profesor1);
//Terminamos la transacción con el método commit. Commit en programación significa confirmar un conjunto de cambios, en este caso persistir el objeto
em.getTransaction().commit();

        //Creamos un objeto Alumno y le asignamos un nombre
Curso curso1 = new Curso();
curso1.setNombreCurso("primero c");
//Iniciamos una transacción con el método getTransaction().begin();
em.getTransaction().begin();
//Persistimos el objeto
em.persist(curso1);
//Terminamos la transacción con el método commit. Commit en programación significa confirmar un conjunto de cambios, en este caso persistir el objeto
em.getTransaction().commit();

    }

}
