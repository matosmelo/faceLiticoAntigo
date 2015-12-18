package br.com.matosmelo.faceLitico.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.matosmelo.faceLitico.model.Litico;

public class Adicionando {

	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Litico litico = new Litico();
		litico.setNome("Prateleira");

		Transaction tx = session.beginTransaction();
		session.save(litico);
		tx.commit();

	}

}
