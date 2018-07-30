package com.jorge.hiber.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jorge.hiber.entity.User;
import com.jorge.hiber.repository.UserRepository;
import com.jorge.hiber.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	protected UserRepository repository;
	
	@Override
	@Transactional
	public User findById(Integer id) throws Exception {		
		return repository.findById(id);
	}

	@Override
	@Transactional
	public List<User> findByAll() throws Exception {		
		return repository.findByAll();
	}

	@Override
	@Transactional
	public void save(User user) throws Exception {
		repository.save(user);		
	}

}
