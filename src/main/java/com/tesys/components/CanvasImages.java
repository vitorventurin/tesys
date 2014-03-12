package com.tesys.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.IOUtils;

import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.com.caelum.vraptor.ioc.Component;

import com.tesys.models.Shirt;

@Component
public class CanvasImages {
	private File pastaImagens;

	public CanvasImages(ServletContext context) {
		String caminhoImagens = context.getRealPath("/WEB-INF/uploadedImages");
		pastaImagens = new File(caminhoImagens);
		pastaImagens.mkdir();
	}

	public void salva(UploadedFile imagem, Shirt shirt) {
		File destino = new File(pastaImagens, shirt.getId() + ".imagem");
		try {
			IOUtils.copyLarge(imagem.getFile(), new FileOutputStream(destino));
		} catch (IOException e) {
			throw new RuntimeException("Erro ao copiar imagem", e);
		}
	}
}