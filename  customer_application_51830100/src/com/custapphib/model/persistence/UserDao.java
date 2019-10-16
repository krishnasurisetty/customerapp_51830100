package com.custapphib.model.persistence;
import java.util.*;
public interface UserDao {
		public User findUser(String email,String password);
		public void addUser(User user);
		public List<User> getAllUser();
	}


