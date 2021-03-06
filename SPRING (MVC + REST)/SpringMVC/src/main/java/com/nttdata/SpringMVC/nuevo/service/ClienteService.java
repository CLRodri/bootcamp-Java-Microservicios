package com.nttdata.SpringMVC.nuevo.service;

import java.util.List;

import com.nttdata.SpringMVC.nuevo.entity.Cliente;

public interface ClienteService {
	
	void guardar(Cliente cliente);
	List<Cliente> buscarTodos();
	List<Cliente> buscarNombreApellido(String nombre, String apellido);
	void borrar(Cliente cliente);
	void crearDatosDummy();
	List<Cliente> mostrarTodos();
}
