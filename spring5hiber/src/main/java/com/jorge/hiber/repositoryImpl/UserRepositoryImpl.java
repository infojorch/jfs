package com.jorge.hiber.repositoryImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jorge.hiber.entity.User;
import com.jorge.hiber.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User findById(Integer id) throws Exception {		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findByAll() throws Exception {		
		return (List<User>)sessionFactory.getCurrentSession().createQuery("from User").getResultList();
	}

	@Override
	public void save(User user) throws Exception {
		sessionFactory.getCurrentSession().save(user);

	}

}
