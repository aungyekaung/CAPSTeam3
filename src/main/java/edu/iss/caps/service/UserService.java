package edu.iss.caps.service;

import java.util.ArrayList;

import edu.iss.caps.model.User;

public interface UserService {

	ArrayList<User> findAllUsers();
	
	User authenticate(String uname, String pwd);

}