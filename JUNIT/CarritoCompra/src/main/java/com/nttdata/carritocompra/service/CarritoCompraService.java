package com.nttdata.carritocompra.service;

import java.util.List;

import com.nttdata.carritocompra.model.Articulo;

public interface CarritoCompraService {

	public void limpiarCesta();
	
	public void addArticulo(Articulo articulo);
	
	public int getNumArticulos();
	
	public List<Articulo> getArticulos();
	
	public Double totalPrice();
	
	public Double calculadorDescuento(double precio, double porcentajeDescuento);
	
	public Double aplicarDescuento(Integer id, Double porcentaje);
}
