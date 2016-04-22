package br.com.matosmelo.faceLitico.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.matosmelo.faceLitico.dao.LiticoDAO;
import br.com.matosmelo.faceLitico.dao.NoticiaDAO;
import br.com.matosmelo.faceLitico.model.Litico;
import br.com.matosmelo.faceLitico.model.Noticias;
import br.com.matosmelo.facelitico.service.Parse;

@Resource
public class NoticiaAdminController {

	private final LiticoDAO liticoDAO;
	private final NoticiaDAO noticiaDAO;
	private final Result result;
	private final Litico litico;
	private final Parse parse;

	public NoticiaAdminController(LiticoDAO liticoDAO, NoticiaDAO noticiaDAO, Litico litico, Parse parse,
			Result result) {
		this.liticoDAO = liticoDAO;
		this.noticiaDAO = noticiaDAO;
		this.litico = litico;
		this.parse = parse;
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

		// Parse da pagina do RSS
		Map<String,String> urlRssTituloLink = parse.listaLinkTitulo(litico.getUrlRss());
//		List<String> lista1 = new ArrayList();
//		List<String> lista2 = new ArrayList();
		
		//System.out.println(urlRssTituloLink);
//		for (int i = 0; i < urlRssTituloLink.size()/2; i++) {
//			lista1.add(urlRssTituloLink.get(i));
//		}
//		System.out.println(lista1);
//		int valor;
//		valor = 0;
//		valor = urlRssTituloLink.size()/2;
//		
//		for (int i = 0; i < valor; i++) {
//			lista2.add(urlRssTituloLink.get(i + valor));
//		}
//		System.out.println(lista1.size());
//		System.out.println(lista2.size());
		
		// Cria noticia
		for(Entry<String, String> entry :urlRssTituloLink.entrySet() ) {
			Noticias noticias = new Noticias(); 
			
			noticias.setTituloNoticia(entry.getKey());
			noticias.setUrl(entry.getValue());
			noticias.setTexto("Texto");
			noticias.setNegativo(id);
			noticias.setPositivo(id);
			noticias.setNeutro(id);
			noticias.setLitico(litico);
			
			noticiaDAO.salva(noticias, litico);
		}

		result.redirectTo(NoticiaAdminController.class).novaNoticia();
	}

	// // Lista os liticos
	// @Get("/todosLiticos")
	// public List<Litico> lista() {
	// return liticoDAO.listaLitico();
	// }
	//
	// // Deleta litico
	// @Delete("/litico/{id}")
	// public void remove(Long id) {
	// Litico litico = liticoDAO.carrega(id);
	// liticoDAO.remove(litico);
	// result.redirectTo(NoticiaAdminController.class).lista();
	// }
	//
	//
	// Edita litico Antido
	// @Get("/litico/{id}")
	// public Litico edita(Long id) {
	// System.out.println(id);
	// return liticoDAO.carrega(id);
	// }

	// // Edita litico
	// @Get("/litico/{id}")
	// public void edita(Long id) {
	// System.out.println(id);
	// Litico litico = liticoDAO.carrega(id);
	//// System.out.println(litico.getNoticias());
	//// for (Noticias l:litico.getNoticias())
	//// System.out.println(l.getNome());
	// result.include("litico", litico);
	// List<Noticias> noticias = liticoDAO.carrega();
	// result.include("noticia", noticias);
	// }
	//
	// // Altera litico
	// @Put("/litico/{litico.id}")
	// public void altera(Litico litico) {
	// liticoDAO.atualiza(litico);
	// result.redirectTo(NoticiaAdminController.class).lista();
	// }
}
