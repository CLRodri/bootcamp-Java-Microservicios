package nttdatacentershibernatet1RCL;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Client",schema="nttdata_jdbc_ex")
public class ClientDAO {
	
	@ManyToOne
	private ContratoDAO contrato;
	
	private int id;
		
	private String nombre;
	
	private String primer_apellido;
	
	private String segundo_apellido;
	
	private String dni;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	@Column(name="Nombre")
	public String getNombre() {
		return nombre;
	}
	@Column(name="Primer Apellido")
	public String getPrimerApellido() {
		return primer_apellido;
	}
	@Column(name="Segundo Apellido")
	public String getSegundoApellido() {
		return segundo_apellido;
	}
	@Column(name="DNI", unique = true,nullable=false, length=9)
	public String getDNI() {
		return dni;
	}
	
	
	
}
