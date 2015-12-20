package com.imobAchat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imobAchat.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
