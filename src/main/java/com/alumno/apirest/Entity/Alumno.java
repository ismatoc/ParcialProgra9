package com.alumno.apirest.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity(name="alumnos_progra9")
@Table(name="alumnos_progra9")
public class Alumno {
/*PK == Primary Key*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_alumno")
	private int id_alumno;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="carnet")
	private String carnet;

	
	/*parametros nombrados*/
	public Alumno() {}
	public Alumno(int id_alumno, String nombre, String c) {
		this.id_alumno = id_alumno;
		this.nombre = nombre;
		this.carnet = carnet;
	}
	/*GET*/
	
	public int getId_alumno() {
		return this.id_alumno;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCarnet() {
		return this.carnet;
	}

	/*SET*/
	
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	
}
