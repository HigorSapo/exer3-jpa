package br.com.fiap.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("exer3-jpa2");
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}
