package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UnidirectionalTable {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Customer c = new Customer();
		c.setName("Vaibhavi");
		
		Address a = new Address();
		a.setPincode(401502);
		a.setCity("Washi");
		a.setArea("Shiv Nagar");
		
		c.setAddress(a);
		em.persist(c);
		
		
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();

	}

}
