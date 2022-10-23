package com.genesis.employee.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.genesis.employee.model.Employee;
import com.genesis.employee.repository.EmployeeRepo;
import com.genesis.employee.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	Logger logger = Logger.getLogger("loggeer");

	@Autowired
	EmployeeRepo empRepo;

	@Override
	public ResponseEntity<String> registerEmployee(Employee emp) {

		try {
			empRepo.save(emp);
			return new ResponseEntity<>("emp details saved successfully", HttpStatus.OK);
		} catch (Exception ex) {
			logger.severe("emp details not saved");
			return new ResponseEntity<>("emp details not saved " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@Override
	public List<Employee> getAllEmpDetails() {

		return empRepo.findAll();
	}

	@Override
	public Employee getEmpById(int userId) {

		return empRepo.findEmpByUserId(userId);
	}

	@Override
	public ResponseEntity<String> updateEmpById(Employee emp) {
		Employee empEntity = empRepo.findEmpByUserId(emp.getUserId());

		if (empEntity.equals(" ")) {
			return null;
		} else {
			empEntity.setFirstName(emp.getFirstName());
			empEntity.setLastName(emp.getLastName());
			empEntity.setDepartment(emp.getDepartment());
			empEntity.setAddress(emp.getAddress());
			empEntity.setPhone(emp.getPhone());
		
			try {
				empRepo.save(empEntity);
				return new ResponseEntity<>("emp details update successfully", HttpStatus.OK);
			} catch (Exception ex) {
				logger.severe("emp details not updated");
				return new ResponseEntity<>("emp details not updated " + ex.getMessage(),
						HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}

	}

	@Override
	public ResponseEntity<String> deleteEmpById(int userId) {
		try {
			empRepo.deleteById(userId);
		} catch (Exception ex) {
			logger.severe("emp details not delete");
		}
		
		 return new ResponseEntity<>("Delete successfully. " , HttpStatus.OK);
	}

}
