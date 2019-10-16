package com.custapphib.service;

import java.util.List;

import com.custapphib.model.persistence.User;

public interface UserService {
	public User findUser(String email, String password);

	public void addUser(User user);

	public List<User> getAllUser();
}
