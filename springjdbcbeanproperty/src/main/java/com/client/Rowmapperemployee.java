package com.client;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pojo.Employee;

public class Rowmapperemployee implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee em=new Employee();
		em.setId(rs.getInt("id"));
		em.setName(rs.getString("name"));
		em.setSalary(rs.getDouble("salary"));
		return em;
	}
	

}
