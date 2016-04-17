package br.com.matosmelo.faceLitico.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.matosmelo.faceLitico.dao.LiticoDAO;
import br.com.matosmelo.faceLitico.dao.NoticiaDAO;
import br.com.matosmelo.faceLitico.model.Litico;
import br.com.matosmelo.faceLitico.model.Noticias;

@Resource
public class NoticiaAdminController {

	private final LiticoDAO liticoDAO;
	private final NoticiaDAO noticiaDAO;
	private final Noticias noticias;
	private final Result result;
	private final Litico litico;

	public NoticiaAdminController(LiticoDAO liticoDAO,NoticiaDAO noticiaDAO,Litico litico,Noticias noticias, Result result) {
		this.liticoDAO = liticoDAO;
		this.noticiaDAO = noticiaDAO;
		this.litico = litico;
		this.noticias = noticias;
		this.result = result;
	}

	// Cria nova noticia
	@Get("/novaNoticia")
	public List<Litico> novaNoticia() {
		return liticoDAO.listaLitico();
	}
	// Adicionando noticia
	@Get("/adicionaNovaNoticia/{id}")
	public void adicionaNovaNoticia(Long id) {
		
		Litico litico = liticoDAO.carrega(id);
		
		//Parse da pagina do RSS
		
		//Cria noticia
//		String tituloNoticia = null;
//		String texto = null;
//		String url = null;
		noticias.setTituloNoticia("Titulo");
		noticias.setTexto("Texto");
		noticias.setTexto("www.url.com");
		noticias.setNegativo(id);
		noticias.setPositivo(id);
		noticias.setNeutro(id);
		noticias.setLitico(litico);
		
		noticiaDAO.salva(noticias, litico);
		
		result.redirectTo(NoticiaAdminController.class).novaNoticia();
	}

	// Lista os liticos
	@Get("/todosLiticos")
	public List<Litico> lista() {
		return liticoDAO.listaLitico();
	}

	// Deleta litico
	@Delete("/litico/{id}")
	public void remove(Long id) {
		Litico litico = liticoDAO.carrega(id);
		liticoDAO.remove(litico);
		result.redirectTo(NoticiaAdminController.class).lista();
	}

	
	// Edita litico Antido
//		@Get("/litico/{id}")
//		public Litico edita(Long id) {
//			System.out.println(id);
//			return liticoDAO.carrega(id);
//		}
		
	// Edita litico
	@Get("/litico/{id}")
	public void edita(Long id) {
		System.out.println(id);
		Litico litico = liticoDAO.carrega(id);
//		System.out.println(litico.getNoticias());
//		for (Noticias l:litico.getNoticias())
//			System.out.println(l.getNome());
		result.include("litico", litico);
//		List<Noticias> noticias = liticoDAO.carrega();
//		result.include("noticia", noticias);
	}

	// Altera litico
	@Put("/litico/{litico.id}")
	public void altera(Litico litico) {
		liticoDAO.atualiza(litico);
		result.redirectTo(NoticiaAdminController.class).lista();
	}
}
