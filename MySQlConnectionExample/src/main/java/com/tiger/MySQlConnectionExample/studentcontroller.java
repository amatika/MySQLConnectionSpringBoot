package com.tiger.MySQlConnectionExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class studentcontroller 
{
	@Autowired
	studentrepo repo;
	
	@RequestMapping("/add")	
	public @ResponseBody String add() 
	{
		student s=new student();
		s.setForm("one");
		s.setName("kelvin");
		repo.save(s);
		return "student data has been saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<student> getUsers()
	{
		return repo.findAll();
	}
	

}
