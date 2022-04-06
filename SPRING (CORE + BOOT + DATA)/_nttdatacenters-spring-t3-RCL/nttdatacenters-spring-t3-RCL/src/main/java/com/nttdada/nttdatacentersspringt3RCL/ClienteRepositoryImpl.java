package com.nttdada.nttdatacentersspringt3RCL;


import org.hibernate.Session;

public class ClienteRepositoryImpl implements ClienteRepository{
	
	
	public Session session;
	@Override
	public Cliente findbyNameAndSecondName(String name,String secondName) {
		Cliente res = new Cliente();
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		res = (Cliente) session.createQuery("FROM" + Cliente.class + "WHERE Nombre =" + name + "AND Primer Apellido =" + secondName);
		
		return res;
	}

}
