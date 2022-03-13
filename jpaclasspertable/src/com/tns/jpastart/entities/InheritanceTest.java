package com.tns.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//create one employee
//				Employee employee1 = new Employee();
//				employee1.setName("John");
//				employee1.setSalary(5000);
//				em.persist(employee1);
//				
				//create one manager
				Manager manager1 = new Manager();
				manager1.setName("Krish");
				manager1.setSalary(8000);
				manager1.setDepartmentName("C2C");
				em.persist(manager1);
		
		
		
		
		
		
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		/*
		 * em.close(); factory.close();
		 */

	}

}
