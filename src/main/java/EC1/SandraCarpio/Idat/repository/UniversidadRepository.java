package EC1.SandraCarpio.Idat.repository;

import java.util.List;

import EC1.SandraCarpio.Idat.model.Universidad;



public interface UniversidadRepository {
	
	void guardar (Universidad universidad);
	void actualizarr (Universidad universidad);
	void eliminar (Integer Id);
	List<Universidad> listar ();
	Universidad obtener(Integer Id);

}
