package com.nttdata.SpringMVC.nuevo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.SpringMVC.nuevo.entity.Cliente;
import com.nttdata.SpringMVC.nuevo.service.ClienteService;
import com.nttdata.SpringMVC.nuevo.service.impl.ClienteServiceImpl;

@Controller
public class ControllerClienteImpl{
	

	@Autowired
	private ClienteServiceImpl clienteServiceImpl;
	

	@RequestMapping(path="/mostrar-cliente", method = RequestMethod.GET)
	public String mostrarClientes(Model model) {
		List<Cliente> clientes = clienteServiceImpl.buscarTodos();
		
		model.addAttribute("clientes", clientes);
		
		return "clientes";
	}
	
	@RequestMapping("nuevo-cliente")
	public void addClient() {
		
	}
	
	@RequestMapping(path="/searchByName", method = RequestMethod.GET, params= {"nombre"})
	public String searchByName(Model model) {
		Cliente response =new Cliente();
		
		model.addAttribute("cliente",response);
		
		return "cliente";
	}
	
}
