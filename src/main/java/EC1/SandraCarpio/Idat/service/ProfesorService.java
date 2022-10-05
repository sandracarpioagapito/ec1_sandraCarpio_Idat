package EC1.SandraCarpio.Idat.service;

import java.util.List;

import EC1.SandraCarpio.Idat.model.Profesor;

public interface ProfesorService {
	void guardar(Profesor profesor);
	void actualizar(Profesor profesor);
	void eliminar(Integer id);
	List<Profesor> listar();
	Profesor obtener(Integer id);

}
