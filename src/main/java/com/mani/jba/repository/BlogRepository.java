package com.mani.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mani.jba.entity.Blog;



public interface BlogRepository extends JpaRepository<Blog,Integer> {

}
