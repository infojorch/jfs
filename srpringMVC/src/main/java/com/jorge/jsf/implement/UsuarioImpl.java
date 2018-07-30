package com.jorge.jsf.implement;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jorge.jsf.model.Usuario;
import com.jorge.jsf.repository.UsuarioRepository;
import com.jorge.jsf.service.UsuarioService;
import com.jorge.jsf.util.HibernateUtil;

@Service
public class UsuarioImpl implements UsuarioService{	

	private static Session session = HibernateUtil.getSessionFactory().openSession();
	
	@Autowired
	private UsuarioRepository  repository;
	
	@Override	
	public Usuario findById(Integer id) throws Exception {
		
		
		
		
		return this.repository.finById(id);
	}

	@Override
	public String hola() {
	
		try {
			return "";
		} catch (Exception e) {
			return "ERROR";
		}
		
	}

}
