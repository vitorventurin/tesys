package com.tesys.components;

import java.io.Serializable;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

import com.tesys.models.Company;
import com.tesys.models.User;

@SuppressWarnings("serial")
@Component
@SessionScoped
public class LoggedUser implements Serializable{
	private User logado;
	
	public void executaLogin(User user) {
		this.logado = user;
	}
	
	public String getNome() {
		return logado.getUserName();
	}
	
	public Company getCompany() {
		return logado.getCompany();
	}
	
	public boolean isLogado() {
		return logado != null;
	}	
}