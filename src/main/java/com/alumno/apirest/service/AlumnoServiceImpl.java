package com.alumno.apirest.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumno.apirest.Entity.Alumno;
import com.alumno.apirest.dao.AlumnoDao;

 

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoDao AlumnoDAO;
	
	@Override
	public List<Alumno> findAll() {
		List<Alumno> listAlumno= AlumnoDAO.findAll();
		return listAlumno;
	}

	@Override
	public Alumno findById(int id_alumno) {
		Alumno alumno = AlumnoDAO.findById(id_alumno);
		return alumno;
	}

	@Override
	public void save(Alumno alumno) {
		AlumnoDAO.save(alumno);

	}

	@Override
	public void deleteById(int id_alumno) {
		AlumnoDAO.delete(id_alumno);
	}

}