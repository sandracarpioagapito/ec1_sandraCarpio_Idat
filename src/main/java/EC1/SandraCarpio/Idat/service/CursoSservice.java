package EC1.SandraCarpio.Idat.service;

import java.util.List;

import EC1.SandraCarpio.Idat.model.Curso;

public interface CursoSservice {
	
	void guardar(Curso curso);
	void actualizar(Curso curso);
	void eliminar(Integer id);
	List<Curso> listar();
	Curso obtener(Integer id);


}
