package com.it.prague.StudentOne;

import java.util.Iterator;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class RetriveQueryTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("GoodBoy");
        EntityManager manager = factory.createEntityManager();
        
        EntityTransaction et = manager.getTransaction();
        et.begin();
        
//        Query query = manager.createQuery("SELECT e FROM StudentOne e");
        Query query = manager.createQuery("SELECT e FROM StudentOne e WHERE e.id=2");
        
        //Query query = manager.createQuery("SELECT e FROM StudentOne e WHERE 1 and 2 ");
        List<StudentOne> list = (List<StudentOne>)query.getResultList();
        Iterator i =list.iterator();
        while (i.hasNext()) {
			StudentOne sts = (StudentOne) i.next();
			System.out.println(sts.getId());
			System.out.println(sts.getFirstName());
			System.out.println(sts.getLastName());
			System.out.println(sts.getEmail());
			
		}
        
        et.commit();
        manager.close();
        factory.close();

	}

}
