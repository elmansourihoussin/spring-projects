package co.elmansouri.springprojects.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.elmansouri.springprojects.entities.User;
import co.elmansouri.springprojects.repository.UserRepository;
import co.elmansouri.springprojects.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User add(User user) {
		if(user != null)
		  return userRepository.save(user);
		else
		  return null;
	}

	@Override
	public User edit(User user) {
		if(user != null)
			return userRepository.save(user);
		else
		    return null;
	}

	@Override
	public void delete(User user) {
		if(user != null)
			userRepository.delete(user);
	}

	@Override
	public List<User> getAll() {
		try {
			List<User> users = userRepository.findAll();
			if(users.isEmpty())
			   return users;
			else 
				return Collections.emptyList();
		} catch (Exception e) {
			LOGGER.error("Erreur {} ", e);
			 return Collections.emptyList();
		}
	}

	@Override
	public Optional<User> find(Long id) {
		return userRepository.findById(id);
	}

}
