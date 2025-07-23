package com.it.prague.StudentOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("GoodBoy");
        EntityManager manager = factory.createEntityManager();
        
        EntityTransaction et = manager.getTransaction();
        et.begin();
        
        StudentOne so1 = new StudentOne("Sundar", "Kumar", "sundar@gmail.com");
        StudentOne so2 = new StudentOne("Anil", "Kumar", "anil@gmail.com");
        StudentOne so3 = new StudentOne("Rakesh", "Kumar", "rakesh@gmail.com");
        StudentOne so4 = new StudentOne("Rakeshh", "Kumar", "rakesh@gmail.com");
        
        System.out.println("Persisting entities.....");
        
        manager.persist(so1);
        manager.persist(so2);
        manager.persist(so3);
          manager.persist(so4);
        et.commit();
        manager.close();
        factory.close();
        System.out.println("Successfully persisted.");
    }
}
