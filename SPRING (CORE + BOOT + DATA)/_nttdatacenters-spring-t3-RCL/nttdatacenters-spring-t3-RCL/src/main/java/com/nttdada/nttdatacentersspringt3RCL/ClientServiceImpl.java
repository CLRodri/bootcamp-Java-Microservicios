package com.nttdada.nttdatacentersspringt3RCL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class ClientServiceImpl implements ClientService{
	
	private Session session;
	
	public ClientServiceImpl(Session session) {
		this.session=session;
	}
	@Override
	public void insertClient(Cliente client) {
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		session.save(client);
		session.getTransaction().commit();	
	}

	
	@Override
	public void deleteClient(Cliente client) {
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		session.delete(client);
		session.getTransaction().commit();
	}
	@Override
	public List<Cliente> searchClient() {
		List<Cliente> res = new ArrayList<Cliente>();
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		res = session.createQuery("FROM" + Cliente.class).list();
		
		return res;
	}
	
	public Cliente findbyNameandSecondName(String name,String secondName) {
		Cliente res = new Cliente();
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		res = (Cliente) session.createQuery("FROM" + Cliente.class + "WHERE Nombre =" + name + "AND Primer Apellido =" + secondName);
		
		return res;
	}
}
