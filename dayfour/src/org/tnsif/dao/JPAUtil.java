package org.tnsif.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager em;
	
	static 
	{
		factory=Persistence.createEntityManagerFactory("JPA-PU");
	}
	//JPA runtime LifeCycle
	public static EntityManager getEntityManger()
	{
		if(em==null || em.isOpen())
		{
			em=factory.createEntityManager();
		}
		return em;
	}

}
