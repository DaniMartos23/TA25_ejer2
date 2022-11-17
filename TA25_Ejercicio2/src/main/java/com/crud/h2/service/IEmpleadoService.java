package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Empleado;

public interface IEmpleadoService {
	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un empleado CREATE
	
	public Empleado empleadoXID(String dni); //Leer datos de un empleado READ
			
	public List<Empleado> listarEmpleadoNombre(String nombre);//Listar Empleados por campo nombre
			
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
			
	public void eliminarEmpleado(String dni);// Elimina el empleado DELETE
}
