package com.jorge.jsf.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jorge.jsf.model.Usuario;
import com.jorge.jsf.util.HibernateUtil;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

	private static Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public Usuario finById(Integer id) throws Exception {
		if (!session.isOpen())
			session = session.getSessionFactory().openSession();

		Query query = session.createQuery("from Usuario");

		return (Usuario) query.list().get(0);
	}

	@Override
	public String saludar() throws Exception {
		// TODO Auto-generated method stub
		return "SDDDDDDDFFFF";
	}

}
