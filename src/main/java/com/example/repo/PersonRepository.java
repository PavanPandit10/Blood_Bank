package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	
	List<Person> findByAge(long age);
	
	List<Person> findByAgeLast(long age , String last);
	
	List<Person> findByArea(String area);
	
	
}
 