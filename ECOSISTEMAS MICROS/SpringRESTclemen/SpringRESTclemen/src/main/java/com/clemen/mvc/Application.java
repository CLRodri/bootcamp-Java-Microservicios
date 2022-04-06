package com.clemen.mvc;


import com.clemen.mvc.entity.Cliente;
import com.clemen.mvc.service.impl.ClienteServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context  = SpringApplication.run(Application.class, args);

	}


}
