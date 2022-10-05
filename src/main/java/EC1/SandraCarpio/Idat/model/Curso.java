package EC1.SandraCarpio.Idat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name ="curso")
public class Curso {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdCurso;
	private String Curso;
	private String descripcion;
	
	@ManyToMany(mappedBy = "curso",cascade = {CascadeType.MERGE})
	private List<Profesor> profesor = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(
			name="id_malla",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_malla) references mallacurricular(id_malla)"))
			

	private Integer IdMalla;
	
	
	public Integer getIdCurso() {
		return IdCurso;
	}
	public void setIdCurso(Integer idCurso) {
		IdCurso = idCurso;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getIdMalla() {
		return IdMalla;
	}
	public void setIdMalla(Integer idMalla) {
		IdMalla = idMalla;
	}
	
	

}
