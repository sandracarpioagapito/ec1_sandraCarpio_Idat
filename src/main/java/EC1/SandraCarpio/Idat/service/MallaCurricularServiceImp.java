package EC1.SandraCarpio.Idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC1.SandraCarpio.Idat.model.MallaCurricular;
import EC1.SandraCarpio.Idat.repository.MallaCurricularRepository;
@Service
public class MallaCurricularServiceImp implements MallaCurricularService {
	
	@Autowired
	private MallaCurricularRepository repositorio;

	@Override
	public void guardar(MallaCurricular malla) {
		// TODO Auto-generated method stub
		repositorio.save(malla);

	}

	@Override
	public void actualizar(MallaCurricular malla) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(malla);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<MallaCurricular> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public MallaCurricular obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
