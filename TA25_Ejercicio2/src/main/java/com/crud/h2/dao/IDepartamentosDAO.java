package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Departamento;

public interface IDepartamentosDAO extends JpaRepository<Departamento, Integer> {
	
	//Listar fabricantes por campo nombre
		public List<Departamento> findByNombre(String nombre);
}
