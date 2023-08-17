package com.dipali.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipali.model.User;
import com.dipali.repository.UserRepository;
import com.dipali.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveuser(User user) {
		User userSaved=userRepository.save(user);
		return userSaved;
	}

}
