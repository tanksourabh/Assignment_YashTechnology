package com.yash.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.springjdbc.entities.Student;

public class RowMapperimpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		
		student.setId(rs.getInt(1));//column name-1
		student.setName(rs.getString(2));//column name-2
		student.setAge(rs.getInt(3));//column name-3
		student.setAddress(rs.getString(4));//column name-4
		
		return student;
	}
	
}
