package com.alumno.apirest.dao;
import org.springframework.transaction.annotation.Transactional;

import com.alumno.apirest.Entity.Alumno;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Transactional
@Repository
public class AlumnoDaoImpl implements AlumnoDao {
	
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Alumno> selectQuery = currentSession.createQuery("from alumnos_progra9", Alumno.class);
		List<Alumno> alumno = selectQuery.getResultList();
		return alumno;
	}

	@Override
	public Alumno findById(int id_alumno) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Alumno alumno = currentSession.get(Alumno.class, id_alumno);
		return alumno;
	}

	@Override
	public void save(Alumno alumno) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(alumno);
	}

	@Override
	public void delete(int id_alumno) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Alumno> deleteQuery = currentSession.createQuery("delete from alumnos_progra9 where id_alumno=:idAlumno");
		deleteQuery.setParameter("idAlumno", id_alumno);
		deleteQuery.executeUpdate();

	}

}
