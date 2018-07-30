package com.jorge.hiber.service;

import java.util.List;

import com.jorge.hiber.entity.User;

public interface UserService {

	User findById(Integer id) throws Exception;
	List<User> findByAll() throws Exception;
	void save(User user) throws Exception;
	
}
