package com.nttdata.carritocompra.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.carritocompra.model.Articulo;


public class CarritoCompraServiceImpl implements CarritoCompraService {

	private List<Articulo> cesta = new ArrayList<>();
	
	@Autowired
	private BaseDatos baseDatos;

	@Override
	public void addArticulo(Articulo articulo) {
		cesta.add(articulo);
	}

	@Override
	public int getNumArticulos() {
		return cesta.size();
	}

	@Override
	public List<Articulo> getArticulos() {
		return cesta;
	}

	@Override
	public Double totalPrice() {
		Double precioTotal = 0.0;
		for (int i = 0; i < cesta.size(); i++) {
			precioTotal += cesta.get(i).getPrecio();
		}
		return precioTotal;
	}

	@Override
	public Double calculadorDescuento(double precio, double porcentajeDescuento) {
		return precio - precio * porcentajeDescuento / 100;
	}

	@Override
	public void limpiarCesta() {
		cesta.clear();
		
	}
	
	@Override
	public Double aplicarDescuento(Integer id, Double porcentaje) {
		baseDatos.iniciar();
		Articulo articulo = baseDatos.buscarArticulo(id);
		if(Optional.ofNullable(articulo).isPresent()) {
			return calculadorDescuento(articulo.getPrecio(),porcentaje);
		}else {
			System.out.println("No existe ese articulo");
		}
		return 0D;
	}
}
