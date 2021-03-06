package nttdatacentershibernatet1RCL;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class ContratoDAO {
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="contrato")
	private ClientDAO client;
	
	private int id;
	
	private Date date_Vigencia;
	
	private Date date_Caducidad;
	
	private int precio;
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="Fecha_Vigencia")
	public Date getDate_Vigencia() {
		return date_Vigencia;
	}

	public void setDate_Vigencia(Date date_Vigencia) {
		this.date_Vigencia = date_Vigencia;
	}

	@Column(name="Fecha_Caducidad")
	public Date getDate_Caducidad() {
		return date_Caducidad;
	}

	public void setDate_Caducidad(Date date_Caducidad) {
		this.date_Caducidad = date_Caducidad;
	}

	@Column(name="Precio")
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
