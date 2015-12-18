package br.com.matosmelo.faceLitico.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.matosmelo.faceLitico.dao.LiticoDAO;
import br.com.matosmelo.faceLitico.model.Litico;

@Resource
public class LiticoController {

	private LiticoDAO liticoDAO;

	private Result result;

	public LiticoController(LiticoDAO liticoDAO, Result result) {
		this.liticoDAO = liticoDAO;
		this.result = result;
	}

	// Teste pagina inicial
	@Path("/lit")
	public String litico() {
		return "PORRAAAAA";
	}

	// Cria novo litico
	@Get("/novoLitico")
	public void novoLitico() {
	}

	// Adicionando litico
	@Post("/litico")
	public void adiciona(Litico litico) {
//		System.out.println(litico.getNome());
		liticoDAO.salva(litico);
		result.redirectTo(LiticoController.class).lista();
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
		result.redirectTo(LiticoController.class).lista();
	}
}
