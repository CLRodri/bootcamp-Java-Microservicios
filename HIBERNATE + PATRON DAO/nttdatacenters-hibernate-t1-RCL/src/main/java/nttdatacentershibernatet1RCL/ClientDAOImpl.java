package nttdatacentershibernatet1RCL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class ClientDAOImpl implements ClientDAOInter{
	
	private Session session;
	
	public ClientDAOImpl(Session session) {
		this.session=session;
	}
	@Override
	public void insertClient(ClientDAO client) {
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		session.save(client);
		session.getTransaction().commit();
	}

	
	@Override
	public void deleteClient(ClientDAO client) {
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		session.delete(client);
		session.getTransaction().commit();
	}
	@Override
	public List<ClientDAO> searchClient() {
		List<ClientDAO> res = new ArrayList<ClientDAO>();
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		res = session.createQuery("FROM" + ClientDAO.class).list();
		
		return res;
	}
}