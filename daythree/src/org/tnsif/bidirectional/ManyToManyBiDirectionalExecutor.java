package org.tnsif.bidirectional;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToManyBiDirectionalExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Product p=new Product();
		p.setProductid(111);
		p.setProductname("Santoor"); //1111
		p.setPrice(30.20f);

		Product p1=new Product();
		p1.setProductid(222);
		p1.setProductname("Dove");  //2222
		p1.setPrice(30.20f);
		
		Order o=new Order();
		o.setOrderid(2222);
		o.setPurchasedate(new Date());
		
		Order o1=new Order();
		o1.setOrderid(1111);
		o1.setPurchasedate(new Date());
		
		o.addOrder(p1);
		o1.addOrder(p);
		
		em.persist(o);
		em.persist(o1);

		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();

	}

}
