package com.userAuthentication.repository;

import com.userAuthentication.model.UserType;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<UserType, Long>{
}
