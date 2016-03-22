package br.com.matosmelo.faceLitico.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.matosmelo.faceLitico.dao.LiticoDAO;
import br.com.matosmelo.faceLitico.model.Litico;
import br.com.matosmelo.faceLitico.model.Noticias;

@Resource
public class LiticoAdminController {

	private final LiticoDAO liticoDAO;
	private final Result result;

	public LiticoAdminController(LiticoDAO liticoDAO, Result result) {
		this.liticoDAO = liticoDAO;
		this.result = result;
	}

	// Cria novo litico
	@Get("/novoLitico")
	public void novoLitico() {
	}

	// Adicionando litico
	@Post("/litico")
	public void adiciona(Litico litico) {
		liticoDAO.salva(litico);
		result.redirectTo(LiticoAdminController.class).lista();
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
		result.redirectTo(LiticoAdminController.class).lista();
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
		result.redirectTo(LiticoAdminController.class).lista();
	}
}
