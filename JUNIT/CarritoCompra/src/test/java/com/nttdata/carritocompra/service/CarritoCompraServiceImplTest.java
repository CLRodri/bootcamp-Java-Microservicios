package com.nttdata.carritocompra.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.nttdata.carritocompra.model.Articulo;

@ExtendWith(MockitoExtension.class)
class CarritoCompraServiceImplTest {

	@InjectMocks
	private CarritoCompraServiceImpl cesta = new CarritoCompraServiceImpl();
	@Mock
	BaseDatos baseDatos;
	
	@Test
	public void testLimpiarCesta() {
		Articulo art = new Articulo("platanos",10);
		cesta.addArticulo(art);
		cesta.limpiarCesta();
		assertTrue(cesta.getArticulos().isEmpty());
	}

	@Test
	public void testAddArticulo(){
		Articulo art = new Articulo("platanos",10);
		cesta.addArticulo(art);
		assertFalse(cesta.getArticulos().isEmpty());
	}

	@Test
	public void testGetNumArticulos() {
		Articulo art = new Articulo("platanos",10);
		Articulo art2 = new Articulo("zapatillas",300);
		Articulo art3 = new Articulo("camisetas",30);
		cesta.addArticulo(art);
		cesta.addArticulo(art2);
		cesta.addArticulo(art3);
		assertEquals(3,cesta.getNumArticulos(),0);
	}

	@Test
	public void testGetArticulos() {
		Articulo art = new Articulo("platanos",10);
		Articulo art2 = new Articulo("zapatillas",300);
		Articulo art3 = new Articulo("camisetas",30);
		cesta.addArticulo(art);
		cesta.addArticulo(art2);
		cesta.addArticulo(art3);
		assertFalse(cesta.getArticulos().isEmpty());
	}

	@Test
	public void testTotalPrice() {
		Articulo art = new Articulo("platanos",10);
		Articulo art2 = new Articulo("zapatillas",300);
		Articulo art3 = new Articulo("camisetas",30);
		cesta.addArticulo(art);
		cesta.addArticulo(art2);
		cesta.addArticulo(art3);
		assertEquals(340,cesta.totalPrice(),0);
	}

	@Test
	public void testCalculadorDescuento() {
		assertEquals(Double.valueOf(90D),cesta.calculadorDescuento(100D, 10D));
	}
	
	@Test
	public void testAplicarDescuento() {
		Articulo art = new Articulo("Camiseta",20.00);
		when(baseDatos.buscarArticulo(1)).thenReturn(art);
		Double res = cesta.aplicarDescuento(1, 10D);
		assertEquals(Double.valueOf(18D),res);
				
	}
}
