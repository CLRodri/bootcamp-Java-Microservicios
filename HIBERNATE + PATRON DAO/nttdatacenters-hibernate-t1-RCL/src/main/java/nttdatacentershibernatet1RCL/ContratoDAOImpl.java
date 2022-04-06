package nttdatacentershibernatet1RCL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class ContratoDAOImpl implements ContratoDAOInter{
private Session session;
	
	public ContratoDAOImpl(Session session) {
		this.session=session;
	}
	@Override
	public void insertContract(ContratoDAO contract) {
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		session.save(contract);
		session.getTransaction().commit();
	}

	
	@Override
	public void deleteContract(ContratoDAO contract) {
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		session.delete(contract);
		session.getTransaction().commit();
	}
	@Override
	public List<ContratoDAO> searchContract() {
		List<ContratoDAO> res = new ArrayList<ContratoDAO>();
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		res = session.createQuery("FROM" + ContratoDAO.class).list();
		
		return res;
	}
}
