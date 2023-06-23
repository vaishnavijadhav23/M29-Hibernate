package org.tnsif.singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//driver class
//Program to demonstrate on single table inheritance
public class SingleTableInheritsnceExecuter {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//CREATE EMPLOYEE-1
		Employee emp=new Employee();
		emp.setEmpName("Vaishnavi Jadhav");
		emp.setSalary(50000.5f);
		em.persist(emp);
		
		//CREATE EMPLOYEE-1
		Employee emp1=new Employee();
		emp1.setEmpName("Ankita Yadav");
		emp1.setSalary(534500.5f);
		em.persist(emp1);
		
		//CREATE EMPLOYEE-1
		Manager m=new Manager();
		m.setEmpName("Shiwani K");
		m.setSalary(897000.5f);
		m.setDepName("Human Resource");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
	}
	
	
	

}
