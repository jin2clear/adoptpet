package com.jin2ml.adoptpet.dao;

import java.util.List;

import com.jin2ml.adoptpet.model.User;

public interface UserDAO {
	
	public User selectUserById(Integer id);
	
	public List<User> selectUsersByIds(String ids);

}
