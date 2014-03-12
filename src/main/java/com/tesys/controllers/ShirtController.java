package com.tesys.controllers;

import static br.com.caelum.vraptor.view.Results.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;

import com.tesys.components.LoggedUser;
import com.tesys.models.BaseShirtCanvas;
import com.tesys.models.Shirt;
import com.tesys.persistence.TransactionRequired;
import com.tesys.repositories.ShirtRepository;

@Resource
public class ShirtController {
	private ShirtRepository shirtDAO;
	private Result result;
	private final LoggedUser loggedUser;

	public ShirtController(ShirtRepository shirtDAO, Result result, LoggedUser loggedUser) {
		this.shirtDAO = shirtDAO;
		this.result = result;
		this.loggedUser = loggedUser;
	}
	
	public void form() {
		
	}

	@TransactionRequired
//	@Post
//	@Path("/shirt/")
	public void add(Shirt shirt) {
		shirtDAO.add(shirt);
		this.result.redirectTo(ShirtController.class).list();
	}
	
//	@Get
//	@Path("/shirts")
//	public List<Shirt> listAll() {
//		result.forwardTo(ShirtController.class).list();
//		return this.shirtDAO.list();
//	}
	
//	@Get("/shirts/list")
	public List<Shirt> list() {
		return this.shirtDAO.list(loggedUser.getCompany());
	}
	
//	@Get
//	@Path("/shirt/{id}")
	public Shirt show(Long id) {
		return this.shirtDAO.searchForId(id);	
	}
	
	@Get
	@Path("/baseshirtcanvas/{color}")
	public void showBaseShirtCanvas(String color) {
		BaseShirtCanvas b = shirtDAO.baseShirtCanvas(color);
		result.use(json()).from(b).serialize();
	}
	
//	@TransactionRequired
//	@Post
//	@Path("/shirt/foto")
	public void uploadImage(Shirt shirt, UploadedFile foto) {
	    File fotoSalva = new File(foto.getFileName());   
	    try {
			IOUtils.copyLarge(foto.getFile(), new FileOutputStream(fotoSalva));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //dao.atribui(fotoSalva, perfil);
	    shirt.setLogoFileName(fotoSalva.getAbsolutePath());
	}
}
