package org.tnsif.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;
	private static EntityManager em;
	
	//ENtity Manager-CURD methods
	//create->persist(obj);
	//retrieve->find(PK);  (search)
	//update->merge(obj);
	//delete->remove(PK);
	
	//static block to initialize the object
	static 
	{
		factory=Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager() {
		if(em==null || !em.isOpen())
		{
			em=factory.createEntityManager();
		}
		
		return em;
	}
}
