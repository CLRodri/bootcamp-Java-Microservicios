package com.nttdata.carritocompra.service;

import com.nttdata.carritocompra.model.Articulo;

public interface BaseDatos {
	
	public void iniciar();
	
	public Integer insertarArticulo(Articulo a);
	
	public Articulo buscarArticulo(Integer id);
	
	
}
