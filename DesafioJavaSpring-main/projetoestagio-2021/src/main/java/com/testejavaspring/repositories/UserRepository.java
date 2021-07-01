package com.testejavaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testejavaspring.entities.User;

public interface  UserRepository extends JpaRepository<User, Long> {

}
