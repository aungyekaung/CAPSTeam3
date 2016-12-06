package edu.iss.caps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.caps.model.User;
import edu.iss.caps.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserRepository userRepository;
	
	/* (non-Javadoc)
	 * @see edu.iss.caps.service.UserService#findAllUsers()
	 */
	@Override
	@Transactional
	public ArrayList<User> findAllUsers() {
		ArrayList<User> ulist = (ArrayList<User>) userRepository.findAll();
		return ulist;
	}
	
	@Transactional
	public User authenticate(String uname, String pwd) {
		User u = userRepository.findUserByNamePwd(uname, pwd);
		return u;
	}
}
