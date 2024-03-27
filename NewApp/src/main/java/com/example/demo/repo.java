package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface repo extends JpaRepository<student, Integer>{

	List<student> findByname(String name);
	List<student> findByid(int id);
	
}
