package com.tesys.controllers;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.tesys.components.LoggedUser;
import com.tesys.models.User;
import com.tesys.repositories.UserRepository;

@Resource
public class LoginController {
	private final LoggedUser loggedUser;
	private UserRepository userDAO;
	private Result result;

	public LoginController(LoggedUser loggedUser, UserRepository userDAO,
			Result result) {
		super();
		this.loggedUser = loggedUser;
		this.userDAO = userDAO;
		this.result = result;
	}

	public void formulario() {
		
	}	
	
	//@Post @Path("/login")
	public void autentica(User user) {
		User correctUser = userDAO.buscaUsuarioPorLoginESenha(user);
		
		if (correctUser == null) {
			result.redirectTo(LoginController.class).formulario();
		} else {
			this.loggedUser.executaLogin(correctUser);
			result.redirectTo(IndexController.class).index();
		}
	}
}
