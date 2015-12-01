package com.mani.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mani.jba.entity.Role;
import com.mani.jba.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
