package com.it.prague.StudentOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class RetriveQueryUpdate {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("GoodBoy");
        EntityManager manager = factory.createEntityManager();
        
        EntityTransaction et = manager.getTransaction();
        et.begin();
        
        Query query = manager.createQuery("UPDATE StudentOne e SET e.firstName = 'sri' WHERE e.id = 1");
        query.executeUpdate();
        
        
        et.commit();
        System.out.println("done...........");
        manager.close();
        factory.close();

	}

}
