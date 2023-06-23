//driver class
//program to demonstrate on the joined table inheritance

package org.tnsif.joinedtableinheritence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class joinedtableinheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Vehicle1
		Vehicle v = new Vehicle();
		v.setVehicleNo(123);
		v.setSpeed(60);
		v.setPrice(5700000.04f);
		v.setType("Four-Wheeler");
		em.persist(v);
		
		//Vehicle2
		Vehicle v1 = new Vehicle();
		v1.setVehicleNo(456);
		v1.setSpeed(75);
		v1.setPrice(7800000.04f);
		v1.setType("Four-Wheeler");
		em.persist(v1);
		
		//Car
		Car c = new Car();
		c.setBrandName("Mercedes");
		c.setVehicleNo(789);
		c.setSpeed(45);
		c.setPrice(8800000.04f);
		c.setType("Four-Wheeler");
		em.persist(c);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
