package com.tesys.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;

import com.tesys.models.User;

@Component
public class UserRepositoryImpl implements UserRepository {
	private final EntityManager em;

	public UserRepositoryImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public User buscaUsuarioPorLoginESenha(User user) {
		return this.em.createQuery("from User where username = :pLogin and userpassword = :pSenha", User.class)
		.setParameter("pLogin", user.getUserName())
		.setParameter("pSenha", user.getUserPassword()).getSingleResult();
	}	
}
