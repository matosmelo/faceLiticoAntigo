package br.com.matosmelo.faceLitico.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.matosmelo.faceLitico.dao.LiticoDAO;
import br.com.matosmelo.faceLitico.model.Litico;

@Resource
public class LiticoController {

	private final LiticoDAO liticoDAO;
	private final Result result;

	public LiticoController(LiticoDAO liticoDAO, Result result) {
		this.liticoDAO = liticoDAO;
		this.result = result;
	}

	// Lista os liticos home
	@Get("/litico")
	public List<Litico> litico() {
		return liticoDAO.listaLitico();
	}
	// Visualiza unico litico
	@Get("/{id}")
	public Litico visualiza(Long id) {
		return liticoDAO.carrega(id);
	}
	// Pesquisa litico
	@Get("/pesquisa")
	public void pesquisa() {
	}
	// Pesquisa litico por nome, partido, cargo, cidade, estado e local de trabalho
	@Get
	@Path("/pesquisa/string")
	public List<Litico> pesquisaLiticoString(String string) {
		System.out.println(string);
		return liticoDAO.carregaString(string);
	}
	

}
