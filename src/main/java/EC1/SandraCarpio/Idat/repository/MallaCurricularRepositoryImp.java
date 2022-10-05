package EC1.SandraCarpio.Idat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import EC1.SandraCarpio.Idat.model.MallaCurricular;


@Service
public class MallaCurricularRepositoryImp implements MallaCurricularRepository {
	
	List<MallaCurricular> almacenamiento = new ArrayList<>();

	@Override
	public void guardar(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub
		almacenamiento.add(mallacurricular);

	}

	@Override
	public void actualizarr(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub
		MallaCurricular existeActualizar = obtener(mallacurricular.getIdMalla());
		eliminar(mallacurricular.getIdMalla());
		almacenamiento.add(existeActualizar);

	}

	@Override
	public void eliminar(Integer Id) {
		// TODO Auto-generated method stub
		MallaCurricular existeEliminar = obtener(Id);
		almacenamiento.remove(existeEliminar);

	}

	@Override
	public List<MallaCurricular> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public MallaCurricular obtener(Integer Id) {
		// TODO Auto-generated method stub
		return almacenamiento.stream().filter(p->p.getIdMalla()==Id).findFirst().orElse(null);
	}

}
