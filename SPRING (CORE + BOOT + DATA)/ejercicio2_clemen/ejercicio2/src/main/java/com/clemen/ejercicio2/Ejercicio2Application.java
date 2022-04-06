package com.clemen.ejercicio2;

import com.clemen.ejercicio2.service.IService;
import com.clemen.ejercicio2.service.ServicePeninsularImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio2Application {

    @Autowired
    @Qualifier("peninsular")
    IService servicePeninsular;

    @Autowired
    @Qualifier("insular")
    IService serviceInsular;


    public static void main(String[] args) {

        SpringApplication.run(Ejercicio2Application.class, args);

        //TODO Crear productos
        //TODO Crear 2 pedidos peninsular e insular
        //TODO Calcular iva Pedidos
        
    }

}
