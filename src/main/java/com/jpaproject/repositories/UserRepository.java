package com.jpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
