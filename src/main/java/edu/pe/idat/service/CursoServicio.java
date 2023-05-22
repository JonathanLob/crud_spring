package edu.pe.idat.service;
//Nª4
//el servicio nos brinda la implementacion de cada uno de los metodos que vamos a utilizar
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.interfaces.ICursoRepositorio;
import edu.pe.idat.model.Curso;
import edu.pe.idat.serviceinterfaces.ICursoServicio;



@Service
public class CursoServicio implements ICursoServicio {
	
	@Autowired
	private ICursoRepositorio cursoRepositorio;
	
	@Override
	public List<Curso> listar() {
		return (List<Curso>) cursoRepositorio.findAll();
	}

	@Override
	public Optional<Curso> listarPorId(int id) {
		
		return cursoRepositorio.findById(id);
	}

	@Override
	public int grabar(Curso curso) {
		int resultado = 0;
		Curso cur = cursoRepositorio.save(curso);
		if(!cur.equals(null))
			resultado = 1;
		return resultado;
	}

	@Override
	public int actualizar(Curso curso) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void eliminar(int id) {
		cursoRepositorio.deleteById(id);

	}
	
	//
	

}
