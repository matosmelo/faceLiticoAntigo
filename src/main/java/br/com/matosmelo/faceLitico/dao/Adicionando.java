package br.com.matosmelo.faceLitico.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.matosmelo.faceLitico.model.Litico;
import br.com.matosmelo.faceLitico.model.Noticias;

public class Adicionando {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		LiticoDAO liticoDAO = new LiticoDAO(session);
		Litico litico = new Litico();
		litico = liticoDAO.carrega((long) 4);
//		System.out.println(litico.getId());
		
		Noticias noticias = new Noticias();
		noticias.setTituloNoticia("Teste de noticia com adicao em lista");
		noticias.setTexto("www.noticia.com.br");
		noticias.setLitico(litico);
		
		Transaction tx = session.beginTransaction();
		session.save(noticias);
		
		//Estou tentando adicionar as noticias na lista
//		Noticias ultimaNoticia = (Noticias) session.get(Noticias.class,(long)12);
//		System.out.println(litico.getNoticias());
//		litico.getNoticias().add(ultimaNoticia);
//		System.out.println(litico.getNoticias());
		
		session.save(litico);
		tx.commit();
		
	}

}
