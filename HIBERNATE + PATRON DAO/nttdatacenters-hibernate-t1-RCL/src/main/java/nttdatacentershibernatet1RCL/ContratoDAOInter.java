package nttdatacentershibernatet1RCL;

import java.util.List;

public interface ContratoDAOInter {
	public List<ContratoDAO> searchContract();
	public void deleteContract(ContratoDAO contract);
	public void insertContract(ContratoDAO contact);
}
