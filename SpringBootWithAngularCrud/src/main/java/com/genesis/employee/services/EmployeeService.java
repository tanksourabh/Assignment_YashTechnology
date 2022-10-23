package com.genesis.employee.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.genesis.employee.model.Employee;

public interface EmployeeService {

	ResponseEntity<String> registerEmployee(Employee emp);

	List<Employee> getAllEmpDetails();

	Employee getEmpById(int userId);

	ResponseEntity<String> updateEmpById(Employee emp);

	ResponseEntity<String> deleteEmpById(int userId);

}
