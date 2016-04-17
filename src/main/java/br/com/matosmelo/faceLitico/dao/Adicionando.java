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

		// Pego o litico 
		LiticoDAO liticoDAO = new LiticoDAO(session);
		Litico litico = new Litico();
		litico = liticoDAO.carrega((long) 2);
		
		// Cria a noticia
		Noticias noticias = new Noticias();
		noticias.setTituloNoticia("Teste de noticia com adicao em lista. Agora vaiiii");
		noticias.setTexto("www.noticia.com.br");
		noticias.setLitico(litico);
		
		// Salva a noticia no banco
		Transaction tx = session.beginTransaction();
		session.save(noticias);
		
		// Adiciona noticia na lista do litico
		litico.getNoticias().add(noticias);
		
		tx.commit();
		session.close();
	}

}
