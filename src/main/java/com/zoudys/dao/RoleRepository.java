package com.zoudys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoudys.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
