package EC1.SandraCarpio.Idat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="universidad")
public class Universidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	

	private Integer IdUniversidad;
	private String nombreUniversidad;
	
	@OneToOne
	private Integer idMalla;
	
	public Integer getIdUniversidad() {
		return IdUniversidad;
	}
	public void setIdUniversidad(Integer idUniversidad) {
		IdUniversidad = idUniversidad;
	}
	public String getNombreUniversidad() {
		return nombreUniversidad;
	}
	public void setNombreUniversidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}
	
	
	

}
