package com.clemen.mvc.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name="Cliente")
@Data
@AllArgsConstructor
public class Cliente {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="fecha")
	private LocalDate fecha;

	@Column(name="dni")
	private String dni;
	
	
	
}
