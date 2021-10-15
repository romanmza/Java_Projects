package jpa_ejemplo_1;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import jpa_ejemplo_1.entidades.Persona;

public class JPA_Ejemplo_1 {

    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("Persistencia1").createEntityManager();

        Persona p1 = new Persona();

        p1.setNombre("Pepe");
        p1.setEdad(19);

        //Iniciamos una transacción con el método getTransaction().begin();
        em.getTransaction().begin();

        //Persistimos el objeto
        em.persist(p1);

//Terminamos la transacción con el método commit. Commit en programación 
//significa confirmar un conjunto de cambios, en este caso persistir el objeto 
        em.getTransaction().commit();

    }

}
