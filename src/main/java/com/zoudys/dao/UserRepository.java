package com.zoudys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoudys.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
