package com.it.prague.employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("knowlege");
        EntityManager manager = factory.createEntityManager();
        
        EntityTransaction et = manager.getTransaction();
        et.begin();
        
        Employee emp1 = new Employee("jhilik", 10001);
        Employee emp2 = new Employee("abhisek", 14001);
        Employee emp3 = new Employee("nigam", 100051);
        Employee emp4 = new Employee("deepak", 105001);
        
        System.out.println("persisting entities...........");
        
        manager.persist(emp1);
        manager.persist(emp2);
        manager.persist(emp3);
        manager.persist(emp4);
        
        et.commit();
        manager.close();
        factory.close();
        System.out.println("successfully persisted......");
        
    }
}
