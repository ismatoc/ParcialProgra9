package com.alumno.apirest.dao;
import java.util.List;

import com.alumno.apirest.Entity.Alumno;

public interface AlumnoDao {
	public List<Alumno> findAll();
	
	public Alumno findById(int id_alumno);
	
	public void save (Alumno alumno);
	
	public void delete (int id_alumno);
}
