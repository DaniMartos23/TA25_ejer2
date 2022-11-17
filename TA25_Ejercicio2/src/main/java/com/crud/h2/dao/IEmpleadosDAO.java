package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Empleado;

public interface IEmpleadosDAO extends JpaRepository<Empleado, String> {
	//Listar articulos por campo nombre
			public List<Empleado> findByNombre(String nombre);
}
