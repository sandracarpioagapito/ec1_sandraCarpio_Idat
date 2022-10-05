package EC1.SandraCarpio.Idat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import EC1.SandraCarpio.Idat.model.Curso;


@Service
public class CursoRepositoryImp implements CursoRepository {
	
	List<Curso> almacenamiento = new ArrayList<>();

	@Override
	public void guardar(Curso curso) {
		// TODO Auto-generated method stub
		almacenamiento.add(curso);

	}

	@Override
	public void actualizarr(Curso curso) {
		// TODO Auto-generated method stub
		Curso existeActualizar = obtener(curso.getIdCurso());
		eliminar(curso.getIdCurso());
		almacenamiento.add(existeActualizar);

	}

	@Override
	public void eliminar(Integer Id) {
		// TODO Auto-generated method stub
		Curso existeEliminar = obtener(Id);
		almacenamiento.remove(existeEliminar);

	}

	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}
	

	@Override
	public Curso obtener(Integer Id) {
		// TODO Auto-generated method stub
		return almacenamiento.stream().filter(p->p.getIdCurso()==Id).findFirst().orElse(null);
	}

}
