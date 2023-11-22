package com.example.javaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.javaapp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
