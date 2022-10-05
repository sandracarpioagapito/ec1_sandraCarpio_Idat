package EC1.SandraCarpio.Idat.repository;

import java.util.List;

import EC1.SandraCarpio.Idat.model.MallaCurricular;



public interface MallaCurricularRepository {
	
	void guardar (MallaCurricular mallacurricular);
	void actualizarr (MallaCurricular mallacurricular);
	void eliminar (Integer Id);
	List<MallaCurricular> listar ();
	MallaCurricular obtener(Integer Id);
	

}
