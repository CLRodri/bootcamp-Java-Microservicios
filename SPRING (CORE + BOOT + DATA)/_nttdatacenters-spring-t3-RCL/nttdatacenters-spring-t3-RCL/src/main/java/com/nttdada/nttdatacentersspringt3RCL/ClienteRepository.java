package com.nttdada.nttdatacentersspringt3RCL;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository{
	
	Cliente findbyNameAndSecondName(String nombre,String apellido);
}
