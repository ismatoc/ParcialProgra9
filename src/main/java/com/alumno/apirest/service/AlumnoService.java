package  com.alumno.apirest.service;

import java.util.List;

import com.alumno.apirest.Entity.Alumno;

public interface AlumnoService {
	
	public List<Alumno> findAll();
	
	public Alumno findById(int id_alumno);
	
	public void save (Alumno alumno);
	
	public void deleteById (int id_alumno);

}
