package com.tesys.interceptors;

import java.lang.annotation.Annotation;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.resource.ResourceMethod;

import com.tesys.persistence.TransactionRequired;

@Component
@Intercepts(after={LoginInterceptor.class})
public class TransactionInterceptor implements Interceptor {
	private final EntityManager em;

	public TransactionInterceptor(EntityManager em) {
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean accepts(ResourceMethod method) {
		return containsAnnotation(method, Post.class, TransactionRequired.class);
	}
	
	private boolean containsAnnotation(ResourceMethod method, Class<? extends Annotation>... annotations) {
		for (Class<? extends Annotation> annotation : annotations) {
			if (method.getMethod().isAnnotationPresent(annotation)) return true;
		}
		return false;
	}

	@Override
	public void intercept(InterceptorStack stack, ResourceMethod method,
			Object instance) throws InterceptionException {
		
		if (!em.getTransaction().isActive()) {
			em.getTransaction().begin();
		}
		stack.next(method, instance);
		em.getTransaction().commit();
	}
}
