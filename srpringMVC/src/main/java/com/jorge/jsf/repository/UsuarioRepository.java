package com.jorge.jsf.repository;

import com.jorge.jsf.model.Usuario;

public interface UsuarioRepository {
 
	Usuario finById(Integer id) throws Exception;
	
	String saludar() throws Exception;
	
}
