package EC1.SandraCarpio.Idat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import EC1.SandraCarpio.Idat.model.Universidad;


@Service
public class UniversidadRepositoryImp implements UniversidadRepository {
	
	List<Universidad> almacenamiento = new ArrayList<>();

	@Override
	public void guardar(Universidad universidad) {
		// TODO Auto-generated method stub
		almacenamiento.add(universidad);

	}

	@Override
	public void actualizarr(Universidad universidad) {
		// TODO Auto-generated method stub
		Universidad existeActualizar = obtener(universidad.getIdUniversidad());
		eliminar(universidad.getIdUniversidad());
		almacenamiento.add(existeActualizar);

	}

	@Override
	public void eliminar(Integer Id) {
		// TODO Auto-generated method stub
		Universidad existeEliminar = obtener(Id);
		almacenamiento.remove(existeEliminar);

	}

	@Override
	public List<Universidad> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public Universidad obtener(Integer Id) {
		// TODO Auto-generated method stub
		return almacenamiento.stream().filter(p->p.getIdUniversidad()==Id).findFirst().orElse(null);
	}

}
