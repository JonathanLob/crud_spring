package edu.pe.idat.serviceinterfaces;
// Nª5
//CursoServicio Implementa una interface ICursoServicio que
//define las operaciones que vamos a realizar en este servicio
import java.util.List;
import java.util.Optional;

import edu.pe.idat.model.Curso;

public interface ICursoServicio {
	// aqui definimos las 5 operaciones CRUD
	public List<Curso> listar();
	
	public Optional<Curso> listarPorId(int id);
	
	public int grabar(Curso curso);
	
	public int actualizar(Curso curso);
	
	public void eliminar(int id);
	
	//
	
}
