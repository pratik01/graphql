package com.techshard.graphql.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.dao.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public User createUser(User entity) {
		return userRepo.save(entity);
	}

	public List<User> getUsers(int count) {
		return userRepo.findAll().stream().limit(count).collect(Collectors.toList());
	}

	public Optional<User> getUser(int id) {
		return userRepo.findById(id);
	}

}
