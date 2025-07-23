package com.it.prague.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("richman");
    	EntityManager manager = factory.createEntityManager();
    	
    	EntityTransaction et = manager.getTransaction();
    	et.begin();
        System.out.println( "Hello World!" );
        Customer cost1 = new Customer(01, "Prague", "kumar");
        Customer cost2 = new Customer(02, "Divesh", "kumar");
        Customer cost3 = new Customer(03, "Giridhari", "kumar");
        Customer cost4 = new Customer(04, "Anil", "roy");
        
        System.out.println("persisting entities......");
        
        manager.persist(cost1);
        manager.persist(cost2);
        manager.persist(cost3);
        manager.persist(cost4);
        
        et.commit();
        manager.close();
        System.out.println("successfully persisted....");
    }
}
