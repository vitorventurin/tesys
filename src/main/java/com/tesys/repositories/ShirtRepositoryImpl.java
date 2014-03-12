package com.tesys.repositories;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;

import com.tesys.models.BaseShirtCanvas;
import com.tesys.models.Company;
import com.tesys.models.Shirt;

@Component
public class ShirtRepositoryImpl implements ShirtRepository {

	private final EntityManager em;

	public ShirtRepositoryImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void add(Shirt s) {
		em.persist(s);
	}
	
//	@Override
//	@SuppressWarnings("unchecked")
//	public List<Shirt> list() {
//		return em.createQuery("select s from Shirt s").getResultList();
//	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Shirt> list(Company company){
		return em.createQuery("select s from Shirt s where s.company = :company", Shirt.class).setParameter("company", company).getResultList();
	}
	
	@Override
	public Shirt searchForId(Long id) {
		return (Shirt) em.find(Shirt.class, id);
	}
	
	@Override
	public BaseShirtCanvas baseShirtCanvas(String color) {
		return new BaseShirtCanvas(color);
	}
}
