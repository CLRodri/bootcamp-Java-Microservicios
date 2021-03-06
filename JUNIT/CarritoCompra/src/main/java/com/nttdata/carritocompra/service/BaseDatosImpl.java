package com.nttdata.carritocompra.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.nttdata.carritocompra.model.Articulo;

@Service
public class BaseDatosImpl implements BaseDatos{

	private Map<Integer,Articulo> baseDatos; 
	
	@Override
	public void iniciar() {
		baseDatos = new HashMap<>();
		baseDatos.put(1,new Articulo("Camiseta",20.00));
		baseDatos.put(2,new Articulo("Pantalon",21.00));
		baseDatos.put(3,new Articulo("Jersey",15.00));
		baseDatos.put(4,new Articulo("Chaqueta",35.00));
		baseDatos.put(5,new Articulo("Falda",30.00));	
	}

	@Override
	public Integer insertarArticulo(Articulo a) {
		baseDatos.put(baseDatos.size()+1, a);
		return baseDatos.size();
	}

	@Override
	public Articulo buscarArticulo(Integer id) {
		return baseDatos.get(id);
	}

	

}
