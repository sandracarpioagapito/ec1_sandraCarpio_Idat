package EC1.SandraCarpio.Idat.model;

public class Curso {
	
	private Integer IdCurso;
	private String Curso;
	private String descripcion;
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
