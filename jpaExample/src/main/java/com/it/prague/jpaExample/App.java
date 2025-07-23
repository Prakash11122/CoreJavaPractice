package com.it.prague.jpaExample;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s = new Student();
    	
    	s.setId(8);
    	s.setName("pradhan");
    	
    	
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefas");
       EntityManager em = emf.createEntityManager();
       
       em.getTransaction().begin();
       em.persist(s);
       em.getTransaction().commit();
       System.out.println(s);
    		   
    }
}
