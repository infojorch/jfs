package com.jorge.jsf.implement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jorge.jsf.model.Usuario;
import com.jorge.jsf.repository.UsuarioRepository;
import com.jorge.jsf.repository.UsuarioRepositoryImpl;
import com.jorge.jsf.service.UsuarioService;


@ManagedBean(name = "usuarioService")
@SessionScoped
public class UsuarioImpl implements UsuarioService{
	

	
	
	private UsuarioRepository usuarioRepositoryImpl;
	
	@Autowired
	public void setUsuarioRepositoryImpl(UsuarioRepository usuarioRepositoryImpl) {
		this.usuarioRepositoryImpl = usuarioRepositoryImpl;
	}
	
	@Override
	@Transactional
	public Usuario findById(Integer id) throws Exception {
		
		
		return null;
	}

	@Override
	public String hola() {
	
		try {
			return this.usuarioRepositoryImpl.saludar();
		} catch (Exception e) {
			return "ERROR";
		}
		
	}

}
