package com.techshard.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.service.UserService;

@Component
public class UserQuery implements GraphQLQueryResolver {

	@Autowired
	private UserService userService;

	public List<User> getUsers(final int count) {
		return this.userService.getUsers(count);
	}

	public Optional<User> getUser(final int id) {
		return this.userService.getUser(id);
	}

}
