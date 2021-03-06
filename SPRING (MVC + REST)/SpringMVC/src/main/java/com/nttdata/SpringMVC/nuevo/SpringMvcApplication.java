package com.nttdata.SpringMVC.nuevo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.SpringMVC.nuevo.entity.Cliente;
import com.nttdata.SpringMVC.nuevo.service.ClienteService;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(SpringMvcApplication.class);
	
	@Autowired
	ClienteService clienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		clienteService.crearDatosDummy();
		clienteService.mostrarTodos();
		
		List<Cliente> clientes = clienteService.buscarNombreApellido("Antonio", "Garcia Rosales");
		logger.debug(clientes.get(0).toString());
	}
}
