package com.example.SpringOnetoOneUni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringOnetoOneUni.model.Employee;
import com.example.SpringOnetoOneUni.repository.EmployeeRepository;

//import com.example.SpringOnetoOneUni.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repo;
	
	
	@GetMapping("/test")
	public String getParam(@RequestParam int id, @RequestParam String name)
	{
		return "id is" +id +"name "+name;
	}
	
	@GetMapping("/test/{name}")
	public String getName(@PathVariable String name)
	{
		return "name is "+name;
	}
	
	@PostMapping("/addemployee")
	public ResponseEntity<String> addingemployee(@RequestBody Employee empdata)
	{
		repo.save(empdata);
		return ResponseEntity.ok("emp details saved");
	}
	
	@PostMapping("/saveemployeelist")
	public ResponseEntity<String> addallEmployee(@RequestBody List<Employee> empdata)
	{
		repo.saveAll(empdata);
		return ResponseEntity.ok("emp list details saved");
	}
	
	@GetMapping("/hi")
	public String sayHello()
	{
		return " helloiii";
	}
	
	

}
