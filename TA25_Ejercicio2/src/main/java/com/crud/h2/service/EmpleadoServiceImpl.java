package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IEmpleadosDAO;
import com.crud.h2.dto.Empleado;


@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IEmpleadosDAO iEmpleadosDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(String dni) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findById(dni).get();
	}

	@Override
	public List<Empleado> listarEmpleadoNombre(String nombre) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findByNombre(nombre);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		
		iEmpleadosDAO.deleteById(dni);
		
	}
	
	

}
