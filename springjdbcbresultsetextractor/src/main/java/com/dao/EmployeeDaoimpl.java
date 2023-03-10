package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.client.Resultsetextractor;
import com.pojo.Employee;
import com.queries.Queries;

@Repository
public class EmployeeDaoimpl implements Employeedao {
	@Autowired
	private JdbcTemplate jdbctemplate;

	public int save(Employee employee) {
		Object[] p = { employee.getId(), employee.getName(), employee.getSalary() };
		System.out.println(p);
		return jdbctemplate.update(Queries.insert, p);
	}

	public int update(Employee employee) {
		return 0;
	}

	public void delete(int id) {

	}

	public List<Employee> getallemp() {
		return jdbctemplate.query(Queries.getall, new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));

				return emp;
			}
		});

	}

	public Employee getbyname(String name) {
		 Employee employee=jdbctemplate.query(Queries.getbyname, new Object[] {name} ,new Resultsetextractor());
		return employee;

			
	}

	public Employee getbyid(int id) {
		Employee employee=jdbctemplate.queryForObject(Queries.getbyid, new Object[] {id}, new BeanPropertyRowMapper<Employee>(Employee.class));
		return employee;
	}

	

	
}
