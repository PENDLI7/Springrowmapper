package com.client;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.pojo.Employee;

public class Resultsetextractor implements ResultSetExtractor<Employee>{

	public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
		Employee em=new Employee();
		while (rs.next()) {
		em.setId(rs.getInt("id"));
		em.setName(rs.getString("name"));
		em.setSalary(rs.getDouble("salary"));
		}
		return em;
	}

	

}
