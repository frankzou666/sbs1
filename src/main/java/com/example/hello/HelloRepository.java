package com.example.hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;
	Map<String ,Object> getUserById(String id){
		//SQL statements
		String query="select * from  employee where id = ?";
		//use jdbc template to query , your should  to remember the queryuFormap() method
		Map<String ,Object> employees = jdbcTemplate.queryForMap(query, id);
		return employees;
		
		
	}

}
