package edu.pe.idat.interfaces;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
//Nª3
//la interface que nos permite acceder a las operaciones crud
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.Curso;

@Repository
public interface ICursoRepositorio extends CrudRepository<Curso, Integer>{

	
	
	//
	
	
}
