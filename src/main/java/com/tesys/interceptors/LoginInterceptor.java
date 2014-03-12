package com.tesys.interceptors;

import com.tesys.components.LoggedUser;
import com.tesys.controllers.LoginController;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;

@Intercepts
public class LoginInterceptor implements Interceptor{
	private LoggedUser usuarioLogado;
	private Result result;
	
	public LoginInterceptor(LoggedUser usuarioLogado, Result result) {
		super();
		this.usuarioLogado = usuarioLogado;
		this.result = result;
	}

	@Override
	public void intercept(InterceptorStack stack, ResourceMethod resourceMethod,
			Object instance) throws InterceptionException {
		if (!usuarioLogado.isLogado()) {
			result.redirectTo(LoginController.class).formulario();
		} else {
			stack.next(resourceMethod, instance);
		}
	}
	
	@Override
	public boolean accepts(ResourceMethod resourceMethod) {
		return (!resourceMethod.getResource().getType().isAssignableFrom(LoginController.class));
	}

}
