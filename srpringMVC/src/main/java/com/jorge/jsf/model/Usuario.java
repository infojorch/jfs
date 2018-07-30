package com.jorge.jsf.model;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="usuario")
public class Usuario {
	
	private Integer id;
	
	private String nombre = "Jorge Chavez";
	private String apellido = "Mondragon";
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(Integer id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	
	
	
	
	

}
