package com.jorge.hiber.repository;

import java.util.List;

import com.jorge.hiber.entity.User;

public interface UserRepository {

	User findById(Integer id) throws Exception;
	List<User> findByAll() throws Exception;
	void save(User user) throws Exception;
	
}
