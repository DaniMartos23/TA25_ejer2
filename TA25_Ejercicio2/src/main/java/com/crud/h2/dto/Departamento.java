package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="departamentos")//en caso que la tabala sea diferente
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde codigo final de db
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "presupuesto")
	private int presupuesto;

	@OneToMany
    @JoinColumn(name="coddepartamento")
    private List<Empleado> empleados;
	
	public Departamento() {
		
	}
	
	public Departamento(int codigo, String nombre, int presupuesto) {
		//super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.presupuesto=presupuesto;
	}

	/**
	 * @return codigo
	 */
	
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * 
	 * @param codigo
	 */

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * @return nombre
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	/**
	 * 
	 * @return empleados
	 */
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departamentos")
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	
	/**
	 * 
	 * @param empleados
	 */
	
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nombre=" + nombre +"]";
	}
	
	
	
}
