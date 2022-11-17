package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IDepartamentosDAO;
import com.crud.h2.dto.Departamento;



@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
		@Autowired
		IDepartamentosDAO iDepartamentosDAO;
		
	@Override
	public List<Departamento> listarDepartamentos() {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public Departamento departamentoXID(int id) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findById(id).get();
	}

	@Override
	public List<Departamento> listarDepartamentoNombre(String nombre) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findByNombre(nombre);
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(int id) {
		// TODO Auto-generated method stub
		iDepartamentosDAO.deleteById(id);
	}

}
