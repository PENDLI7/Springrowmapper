package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public interface Employeedao {
	int save(Employee employee);
	int update(Employee employee);
	void delete(int id);
	List<Employee> getallemp();
	Employee getbyid(int id);
	Employee getbyname(String name);
	

}
