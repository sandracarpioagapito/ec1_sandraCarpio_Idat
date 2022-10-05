package EC1.SandraCarpio.Idat.repository;

import java.util.List;

import EC1.SandraCarpio.Idat.model.Curso;


public interface CursoRepository {
	
	void guardar (Curso curso);
	void actualizarr (Curso curso);
	void eliminar (Integer Id);
	List<Curso> listar ();
	Curso obtener(Integer Id);

}
