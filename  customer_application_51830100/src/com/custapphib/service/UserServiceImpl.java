package com.custapphib.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.custapphib.model.persistence.User;
import com.custapphib.model.persistence.UserDao;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;

	@Override
	public User findUser(String email, String password) {
		// TODO Auto-generated method stub
		return userdao.findUser(email, password);
	}

	@Override
	public void addUser(User user) {
		userdao.addUser(user);

	}

	@Override
	public List<User> getAllUser() {

		return userdao.getAllUser();
	}

}
