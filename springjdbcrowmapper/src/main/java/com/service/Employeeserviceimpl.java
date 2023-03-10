package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDaoimpl;
import com.pojo.Employee;
@Service
public class Employeeserviceimpl implements Employeeservice{
	@Autowired
	EmployeeDaoimpl employeedaoimpl;

	public int save(Employee employee) {
		
		return employeedaoimpl.save(employee);
	}

	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<Employee> getallemp() {
		
		return employeedaoimpl.getallemp();
	}

	public ArrayList<Employee> getbyid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getbyname(String name) {
		return employeedaoimpl.getbyname(name);
	}

	

	

}
