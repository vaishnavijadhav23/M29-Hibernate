package org.tnsif.tableperclassinheritence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassIngeritance {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Citizen c = new Citizen();
		c.setAadharNo(123456789123L);
		c.setCity("Pune");
		c.setArea("Shiv Nagar");
		em.persist(c);
		
		Citizen c1 = new Citizen();
		c.setAadharNo(123456789123L);
		c.setCity("Mumbai");
		c.setArea("Gandhi Nagar");
		em.persist(c1);
		
		//Person1
		Person p = new Person();
		p.setAadharNo(123456789123L);
		p.setCity("Pune");
		p.setArea("Shiv Nagar");
		p.setName("Vaishnavi Jadhav");
		p.setContactNo(9407643695L);
		em.persist(p);
		
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();

	}

}
