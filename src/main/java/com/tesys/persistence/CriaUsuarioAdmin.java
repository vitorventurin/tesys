package com.tesys.persistence;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.tesys.models.Company;
import com.tesys.models.User;

public class CriaUsuarioAdmin {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("default").createEntityManager();
		
		em.getTransaction().begin();
		
		//Criando usuario admin
		
		Company company1 = new Company("Bla", "End, 723", "(27) 3112.1032", "contato@bla.com", "bla@bla.com");
		Company company2 = new Company("Darwin", "Rua dos Smurfs, 666", "(27) 3234.4285", "contato@darwin.com.br", "efwreg@darwin.com.br");
		Company company3 = new Company("Unimed", "Av Gwegwe Gsg , 123", "(27) 3211.1013", "contato@unimed.com.br", "wewegg@unimed.com.br");
				
		User user1 = new User();
		user1.setUserName("vitor1");
		user1.setUserPassword("vitor1");
		user1.setCompany(company1);
		
		User user2 = new User();
		user2.setUserName("vitor2");
		user2.setUserPassword("vitor2");
		user2.setCompany(company2);
		
		User user3 = new User();
		user3.setUserName("vitor3");
		user3.setUserPassword("vitor3");
		user3.setCompany(company3);
		
		User user4 = new User();
		user4.setUserName("vitor4");
		user4.setUserPassword("vitor4");
		user4.setCompany(company3);
		
//		Shirt shirt = new Shirt();
//		shirt.setCompany(company);
//		shirt.setSize(Size.GG);
//		shirt.setArm(Arm.SHORT);
//		shirt.setStyle(Style.POLO);
		
		em.persist(company1);
		em.persist(company2);
		em.persist(company3);
		em.persist(user1);
		em.persist(user2);
		em.persist(user3);
		em.persist(user4);
//		session.save(shirt);
		
		em.getTransaction().commit();
	}
}