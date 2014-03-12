package com.tesys.repositories;

import com.tesys.models.User;

public interface UserRepository {

	public abstract User buscaUsuarioPorLoginESenha(User user);
}