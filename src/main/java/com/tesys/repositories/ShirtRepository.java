package com.tesys.repositories;

import java.util.List;

import com.tesys.models.BaseShirtCanvas;
import com.tesys.models.Company;
import com.tesys.models.Shirt;

public interface ShirtRepository {
	public abstract void add(Shirt s);

//	public abstract void atualiza(Produto p);
//
	public abstract Shirt searchForId(Long id);
//
//	public abstract void remove(Produto p);
//
//	public abstract List<Produto> listaPorId(List<Produto> produtos);
//
//	public abstract void remove(List<Produto> produtos);

//	public abstract List<Shirt> list();
	
	public abstract List<Shirt> list(Company c);
	
	public abstract BaseShirtCanvas baseShirtCanvas(String color);
}
