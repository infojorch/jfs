package com.jorge.jsf.service;

import java.io.Serializable;

import com.jorge.jsf.model.Usuario;

public interface UsuarioService{
	
	Usuario findById(Integer id) throws Exception;
	String hola();

}
