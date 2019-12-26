package com.techshard.graphql.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techshard.graphql.dao.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
