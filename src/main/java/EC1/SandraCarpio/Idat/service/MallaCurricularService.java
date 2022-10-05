package EC1.SandraCarpio.Idat.service;

import java.util.List;

import EC1.SandraCarpio.Idat.model.MallaCurricular;

public interface MallaCurricularService {
	
	void guardar(MallaCurricular malla);
	void actualizar(MallaCurricular malla);
	void eliminar(Integer id);
	List<MallaCurricular> listar();
	MallaCurricular obtener(Integer id);

}
