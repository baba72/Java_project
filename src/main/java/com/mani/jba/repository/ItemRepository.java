package com.mani.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mani.jba.entity.Role;

public interface ItemRepository extends JpaRepository<Role,Integer> {

}
