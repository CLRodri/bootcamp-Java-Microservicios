package com.clemen.ejercicio2.service;

import com.clemen.ejercicio2.entities.Pedido;
import com.clemen.ejercicio2.entities.Producto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
@Qualifier("peninsular")
public class ServicePeninsularImpl implements IService{

    @Override
    public Double calcularIva(Pedido pedido) {

        Double precioTotal = 0.0;
        for(Producto producto : pedido.getProductos()){
            precioTotal += producto.getPvd();
        }

        return precioTotal*1.21;
    }
}
