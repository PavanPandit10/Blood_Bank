package com.example.contetoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.repo.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository repo;
	
	
	@PostMapping("/person")
	public Person PersonData (@RequestBody Person theperson)
	{
		return repo.save(theperson);
	}
	
	
	@GetMapping("/{area}")
	public List<Person> PersonData(@PathVariable("area") String area)
	{
		return repo.findByArea(area);
	}
	
	
	@GetMapping("/{age}/{last}")
	public List<Person> PersonData(@PathVariable("age") long age ,
			@PathVariable("last") String last)
	{
		return repo.findByAgeLast(age, last);
	}
	
	
	
}
