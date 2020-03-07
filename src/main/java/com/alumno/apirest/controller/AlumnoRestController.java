package com.alumno.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.alumno.apirest.Entity.Alumno;
import com.alumno.apirest.service.AlumnoService;
//Indiciamos que es un controlador rest
@RestController
@RequestMapping("/progra9") //esta sera la raiz de la url, es decir http://127.0.0.1:8080/api/

public class AlumnoRestController {
	
	//Inyectamos el servicio para poder hacer uso de el
	@Autowired
	private AlumnoService alumnoService;

	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
	http://127.0.0.1:8080/api/users*/
	@GetMapping("/alumnos")
	public List<Alumno> findAll(){
		//retornará todos los usuarios
		return alumnoService.findAll();
	}
	
	@GetMapping("/alumnos/{IdAlumno}")
	public Alumno getAlumno(@PathVariable int IdAlumno) {
	Alumno alumno = alumnoService.findById(IdAlumno);
	if (alumno == null) {
	throw new ResponseStatusException(
	HttpStatus.NOT_FOUND, "No Existe el alumno registrado en el curso de Progra 9");
	}
	return alumno;
	}
	///agregar usuarios
	@PostMapping("/alumnos")
	public Alumno addAlumno(@RequestBody Alumno alumno) {
	alumno.setId_alumno(0);
	alumnoService.save(alumno);
	return alumno;
	}
	
	@PutMapping("/alumnos/{IdAlumno}")
	public Alumno updateAlumno(@RequestBody Alumno alumno, @PathVariable int IdAlumno) {
	alumno.setId_alumno(IdAlumno);
	alumnoService.save(alumno);
	return alumno;
	}
	
	@DeleteMapping("/alumnos/{IdAlumno}")
	  void deleteAlumno(@PathVariable int IdAlumno) {
	    alumnoService.deleteById(IdAlumno);
	  }
	
	
	
}