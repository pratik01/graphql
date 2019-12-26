package com.techshard.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.service.UserService;

@Component
public class UserMutation implements GraphQLMutationResolver {
	
	@Autowired
	private UserService userService;

	public User createUser(User entity) {
		return this.userService.createUser(entity);
	}
}
