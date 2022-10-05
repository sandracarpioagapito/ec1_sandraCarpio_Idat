package EC1.SandraCarpio.Idat.service;

import java.util.List;

import EC1.SandraCarpio.Idat.model.Universidad;

public interface UniversidadService {
	void guardar(Universidad universidad);
	void actualizar(Universidad universidad);
	void eliminar(Integer id);
	List<Universidad> listar();
	Universidad obtener(Integer id);

}
