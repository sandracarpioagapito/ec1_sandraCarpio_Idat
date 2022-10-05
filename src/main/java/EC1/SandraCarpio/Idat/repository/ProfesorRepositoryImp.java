package EC1.SandraCarpio.Idat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import EC1.SandraCarpio.Idat.model.Profesor;


@Service
public class ProfesorRepositoryImp implements ProfesorRepository {
	
	List<Profesor> almacenamiento = new ArrayList<>();

	@Override
	public void guardar(Profesor profesor) {
		// TODO Auto-generated method stub
		almacenamiento.add(profesor);

	}

	@Override
	public void actualizarr(Profesor profesor) {
		// TODO Auto-generated method stub
		Profesor existeActualizar = obtener(profesor.getIdProfesor());
		eliminar(profesor.getIdProfesor());
		almacenamiento.add(existeActualizar);

	}

	@Override
	public void eliminar(Integer Id) {
		// TODO Auto-generated method stub
		Profesor existeEliminar = obtener(Id);
		almacenamiento.remove(existeEliminar);


	}

	@Override
	public List<Profesor> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public Profesor obtener(Integer Id) {
		// TODO Auto-generated method stub
		return almacenamiento.stream().filter(p->p.getIdProfesor()==Id).findFirst().orElse(null);
	}

}
