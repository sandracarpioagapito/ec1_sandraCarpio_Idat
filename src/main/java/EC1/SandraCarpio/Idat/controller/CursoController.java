package EC1.SandraCarpio.Idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import EC1.SandraCarpio.Idat.model.Curso;
import EC1.SandraCarpio.Idat.repository.CursoRepository;

@RestController
@RequestMapping ("/curso/v1")
public class CursoController {
	
	@Autowired
	private CursoRepository repository;
	
	@RequestMapping(path ="/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Curso>> listar(){
		return new ResponseEntity<List<Curso>>(repository.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(path="guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar (@RequestBody Curso curso) {
		repository.guardar(curso);
		return new ResponseEntity <Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path ="/listar/{id}")
	public ResponseEntity<Curso> obtenerPorId(@PathVariable Integer Id){
		
		Curso curso = repository.obtener(Id);
		
		if(curso != null) {
			return new ResponseEntity<Curso>(curso, HttpStatus.OK);
		}else {
			return new ResponseEntity<Curso>(HttpStatus.NOT_FOUND);
		}
	}
	

}















































