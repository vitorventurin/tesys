package com.tesys.repositories;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class CompanyRepositoryImpl implements CompanyRepository {
	
//	private final EntityManager em;
//
//	public HibernateCompanyDAO(EntityManager em) {
//		this.em = em;
//	}

//	@Override
//	public Company findCompanyByUser(User user) {
//		Query query = this.session.createQuery("from Company where login = :pLogin and senha = :pSenha");
//		query.setParameter("pLogin", user.getUserName());
//		query.setParameter("pSenha", user.getUserPassword());
//		return (User) query.uniqueResult();
//	}
}
