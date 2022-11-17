package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="empleados")//en caso que la tabala sea diferente
public class Empleado {

	
	@Id
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@ManyToOne()
    @JoinColumn(name = "coddepartamento")
    Departamento coddepartamento;
	
	public Empleado() {
		
	}
	
	
	
	public Empleado(String dni, String nombre, String apellido, Departamento coddepartamento) {
		//super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.coddepartamento = coddepartamento;
	}



	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Departamento getDepartamentos() {
		return coddepartamento;
	}

	public void setDepartamentos(Departamento coddepartamento) {
		this.coddepartamento = coddepartamento;
	}



	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", departamentos="
				+ coddepartamento + "]";
	}

	
	
}
