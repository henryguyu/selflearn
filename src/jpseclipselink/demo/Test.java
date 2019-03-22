package jpseclipselink.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
public static void main(String[] args) {
        
        String persistenceUnitName = "jpseclipselink";  
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(persistenceUnitName);  
        EntityManager entityManager = factory.createEntityManager();  
        EntityTransaction transaction = entityManager.getTransaction();  
        transaction.begin();  
       
        Person user = new Person();  
        user.setFirstName("Jerry_SAP");
        user.setLastName("Wang");
        entityManager.persist(user);  
        
        transaction.commit();  
        entityManager.close();  
        factory.close();  
        
        System.out.println("done");
    }
}