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
       
        
//        Person user = new Person();  
//        user.setFirstName("Jerry_SAP");
//        user.setLastName("Wang");
//        entityManager.persist(user);  
        
//        TA ta = new TA();
//        ta.setId(3);
//        ta.setName("abcd");
//        entityManager.persist(ta);
//        
//        TB tb = new TB();
//        tb.setId(2);
//        tb.setTA(ta);
//        tb.setName("abcd");
//        entityManager.persist(tb);
        
        TA ta2 = entityManager.find(TA.class, 1);
        TB tb2 = new TB();
        tb2.setId(3);
        tb2.setTA(ta2);
        tb2.setName("ABCD");
        entityManager.persist(tb2);
        
        transaction.commit();  
        entityManager.close();  
        factory.close();  
        
        System.out.println("done");
    }
}