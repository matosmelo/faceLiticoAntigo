package br.com.matosmelo.faceLitico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.com.matosmelo.faceLitico.model.Litico;
import br.com.matosmelo.faceLitico.model.Noticias;

@Component
public class NoticiaDAO {

	private final Session session;

	public NoticiaDAO(Session session) {
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	public List<Noticias> listaNoticias() {
		return this.session.createQuery("select litico from Noticias as litico").list();
	}

	public void salva(Noticias noticia) {
		Transaction tx = this.session.beginTransaction();
		session.save(noticia);
		tx.commit();
	}

	//public void atualiza(Litico litico) {
		//Transaction tx = session.beginTransaction();
		//this.session.update(litico);
		//tx.commit();
	//}

	//public void remove(Litico litico) {
		//Transaction tx = session.beginTransaction();
		//this.session.delete(litico);
		//tx.commit();
	//}

	// Carrega por ID
	//public Litico carrega(Long id) {
		//return (Litico) this.session.get(Litico.class, id);
	//}

	// Obs. Realizar busca só por nome do litico
	@SuppressWarnings("unchecked")
	public List<Litico> carregaString(String string) {
		return this.session.createQuery("select litico from Litico as litico where nome= '" + string + "' or partido= '"
				+ string + "' or cargo= '" + string + "' or cidade= '" + string + "' or estado= '" + string
				+ "' or localFisicoTabalho= '" + string + "' ").list();
	}

	//public void recarrega(Litico litico) {
		//session.refresh(litico);
	//}

}
