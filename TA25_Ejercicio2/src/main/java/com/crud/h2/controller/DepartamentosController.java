package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Departamento;
import com.crud.h2.service.DepartamentoServiceImpl;


@RestController
@RequestMapping("/api")

public class DepartamentosController {
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	//listar departamentos por campo nombre
	@GetMapping("/departamentos/nombre/{nombre}")
	public List<Departamento> listarDepartamentoNombre(@PathVariable(name="nombre") String nombre) {
	    return departamentoServiceImpl.listarDepartamentoNombre(nombre);
	}
	
	
	@PostMapping("/departamentos")
	public Departamento salvarDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	
	@GetMapping("/departamentos/{codigo}")
	public Departamento DepartamentoXID(@PathVariable(name="codigo") int id) {
		
		Departamento departamento_xid= new Departamento();
		
		departamento_xid= departamentoServiceImpl.departamentoXID(id);
		
		System.out.println("Departamento XID: "+departamento_xid);
		
		return departamento_xid;
	}
	
	@PutMapping("/departamentos/{codigo}")
	public Departamento actualizarDepartamento(@PathVariable(name="codigo")int id, @RequestBody Departamento departamento) {
		
		Departamento departamento_seleccionado= new Departamento();
		Departamento departamento_actualizado= new Departamento();
		
		departamento_seleccionado= departamentoServiceImpl.departamentoXID(id);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		departamento_actualizado = departamentoServiceImpl.actualizarDepartamento(departamento_seleccionado);
		
		System.out.println("El Departamento actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamento(@PathVariable(name="codigo")int id) {
		departamentoServiceImpl.eliminarDepartamento(id);
	}
}
