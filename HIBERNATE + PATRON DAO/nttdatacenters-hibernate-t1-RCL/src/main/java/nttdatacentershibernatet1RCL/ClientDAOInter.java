package nttdatacentershibernatet1RCL;

import java.util.List;

public interface ClientDAOInter {
	public List<ClientDAO> searchClient();
	public void insertClient(ClientDAO client);
	public void deleteClient(ClientDAO client);
}
