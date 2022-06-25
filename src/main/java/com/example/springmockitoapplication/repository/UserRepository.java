package com.example.springmockitoapplication.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springmockitoapplication.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {
	
	List<User> findByAddress(String address);

}
