package br.com.matosmelo.faceLitico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.com.matosmelo.faceLitico.model.Litico;

@Component
public class LiticoDAO {

	private final Session session;

	public LiticoDAO(Session session) {
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	public List<Litico> listaLitico() {
		return this.session.createQuery("select litico from Litico as litico").list();
	}

	public void salva(Litico litico) {
		Transaction tx = this.session.beginTransaction();
		session.save(litico);
		tx.commit();
	}

	public void atualiza(Litico litico) {
		Transaction tx = session.beginTransaction();
		this.session.update(litico);
		tx.commit();
	}

	public void remove(Litico litico) {
		Transaction tx = session.beginTransaction();
		this.session.delete(litico);
		tx.commit();
	}
	// Carrega por ID
	public Litico carrega(Long id) {
		return (Litico) this.session.get(Litico.class, id);
	}
	// Carrega por nome
	public Litico carregaNome(String nome) {
		return (Litico) this.session.get(Litico.class, nome);
	}

	public void recarrega(Litico litico) {
		session.refresh(litico);
	}

}
