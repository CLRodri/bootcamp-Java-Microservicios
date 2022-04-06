package com.nttdada.nttdatacentersspringt3RCL;

import java.util.List;

public interface ClientService {

	void insertClient(Cliente client);

	void deleteClient(Cliente client);

	List<Cliente> searchClient();

}
