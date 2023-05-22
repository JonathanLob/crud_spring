package edu.pe.idat.controller;
//Nª6 
//controller hace uso de ICursoServicio para llevar a cabo las operaciones utilizando patron MVC 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.pe.idat.model.Curso;
import edu.pe.idat.serviceinterfaces.ICursoServicio;

@Controller
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	private ICursoServicio cursoServicio;
	
	//definimos metodo que nos permite obtener el curso y enviarlo hacia una pag
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Curso> listaCursos = cursoServicio.listar();
		//ahora se lo paso hacia mi pag
		model.addAttribute("cursos",listaCursos);
		return "Curso/index";
	}
	
	//Dos Metodo para agregar nuevo curso
	@GetMapping("/nuevo")
	public String nuevo(Model model) {
		model.addAttribute("curso", new Curso());
		return "Curso/form-curso";
	}
	
	@PostMapping("/grabar")
	public String grabar(Curso cur, Model model) {
		cursoServicio.grabar(cur);
		return "redirect:listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Curso> curso = cursoServicio.listarPorId(id);
		model.addAttribute("curso", curso);
		return "Curso/form-curso";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		cursoServicio.eliminar(id);		
		return "redirect:/curso/listar";
	}
	
	// 
	


}
