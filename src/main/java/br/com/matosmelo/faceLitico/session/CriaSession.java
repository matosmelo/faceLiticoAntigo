package br.com.matosmelo.faceLitico.session;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
@Component
public class CriaSession implements ComponentFactory<Session>  {

	private SessionFactory factory;
	private Session session;

	public CriaSession(SessionFactory factory) {
		this.factory = factory;
	}

	@PostConstruct
	public void abre() {
		this.session = factory.openSession();
	}

	public Session getInstance() {
		return this.session;
	}

	@PreDestroy
	public void fecha() {
		this.session.close();
	}
////	@Inject
//    private SessionFactory sessionFactory;
////	@Produces @RequestScoped 
//    public Session getSession() {
//        return sessionFactory.openSession();
//    }
//
//    public void close( Session session) {
//        if (session.isOpen()) {
//            session.close();
//        }
//    }
}
