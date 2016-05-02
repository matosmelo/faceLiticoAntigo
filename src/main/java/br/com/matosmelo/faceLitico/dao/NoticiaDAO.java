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
	public List<Noticias> listaTodasNoticias() {
		String hql = "select litico from Noticias as litico";
		return session.createQuery(hql).list();
	}

	public void salva(Noticias noticia, Litico litico) {
		String hql = "from Noticias n where n.url = :url";
		List result = session.createQuery(hql).setParameter("url", noticia.getUrl()).list();
		System.out.println(result);
		if (result.size() > 0){
		   System.out.println("Já existe...");;
		}else {
			
			// Adiciona noticia na lista do litico
			litico.getNoticias().add(noticia);
			Transaction tx = this.session.beginTransaction();
			session.save(noticia);
			tx.commit();
		}
	}
//	public String verificaExisteNoticia(String string) {
//		System.out.println("Verificando se a noticia existe");
//		return (string) this.session.createQuery("select url from Noticias where url= ' string '");
//	}
//	
//	public void adicionaNoticia(Long id, String tituloNoticia, String texto, String url, String urlRss){
//		//AnnotationConfiguration configuration = new AnnotationConfiguration();
//		//configuration.configure();
//		//SessionFactory factory = configuration.buildSessionFactory();
//		//Session session = factory.openSession();
//
//		// Pego o litico 
//		LiticoDAO liticoDAO = new LiticoDAO(session);
//		Litico litico = new Litico();
//		litico = liticoDAO.carrega((long)id);
//		
//		//Parse da pagina do RSS
//		
//		
//		// Cria a noticia
//		Noticias noticias = new Noticias();
//		noticias.setTituloNoticia(tituloNoticia);
//		noticias.setTexto(texto);
//		noticias.setTexto(url);
//		noticias.setLitico(litico);
//		
//		// Salva a noticia no banco
//		Transaction tx = this.session.beginTransaction();
//		session.save(noticias);
//		
//		// Adiciona noticia na lista do litico
//		litico.getNoticias().add(noticias);
//		
//		tx.commit();
//		
//	}

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
