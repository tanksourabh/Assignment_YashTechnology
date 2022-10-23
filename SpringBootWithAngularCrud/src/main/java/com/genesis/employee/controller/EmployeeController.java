package com.genesis.employee.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.genesis.employee.model.Employee;
import com.genesis.employee.services.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	Logger logger = Logger.getLogger("logger");
    
	@PostMapping("/register")
	public ResponseEntity<String>  registerUser(@RequestBody Employee emp){
		
		logger.info("Inside registerEmp Method of controller");
		
		return empService.registerEmployee(emp);
	}
	
	@GetMapping("/get-all-emp-details")
	public List<Employee> getAllEmpDetails() {

		logger.info("Inside getAllEmpDetails method of controller");

		return empService.getAllEmpDetails();
	}
	
	@GetMapping("/get-emp-by-Id")
	public Employee getEmpById(@RequestParam int userId){
		
		logger.info("Inside getEmpById method of controller");
		
		return empService.getEmpById(userId);
	}
    
	@PostMapping("/update-emp")
	public ResponseEntity<String> updateEmpById(@RequestBody Employee emp){
		logger.info("Inside updateEmpById method of controller");
		return empService.updateEmpById(emp);
	}
	
	@GetMapping("/delete-emp-by-Id")
	public ResponseEntity<String> deleteEmpById(@RequestParam int userId){
		
		logger.info("Inside deleteEmpById method of controller");
		
		return empService.deleteEmpById(userId);
	}
	
}




















