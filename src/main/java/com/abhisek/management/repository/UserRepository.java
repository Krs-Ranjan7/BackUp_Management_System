package com.abhisek.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhisek.management.entity.User;

public interface UserRepository
        extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}