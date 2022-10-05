package EC1.SandraCarpio.Idat.repository;

import java.util.List;

import EC1.SandraCarpio.Idat.model.Profesor;



public interface ProfesorRepository {
	
	void guardar (Profesor profesor);
	void actualizarr (Profesor profesor);
	void eliminar (Integer Id);
	List<Profesor> listar ();
	Profesor obtener(Integer Id);

}
