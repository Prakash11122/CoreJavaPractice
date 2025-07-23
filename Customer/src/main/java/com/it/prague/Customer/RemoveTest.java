package com.it.prague.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class RemoveTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("richman");
    	EntityManager manager = factory.createEntityManager();
    	
    	EntityTransaction et = manager.getTransaction();
    	et.begin();
    	
    	System.out.println("Fetching record having 1");
    	Customer cost = manager.find(Customer.class,new Integer(02));
    	
    	System.out.println(cost.getId());
    	System.out.println(cost.getFirstName());
    	manager.remove(cost);
    	et.commit();
    	manager.close();
    	factory.close();


	}

}
