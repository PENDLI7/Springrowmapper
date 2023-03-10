package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pojo.Employee;
import com.service.Employeeserviceimpl;
@Controller("dao")
public class Employeecontroller {
	@Autowired
	Employeeserviceimpl employeeserviceimpl;
	
	public int save(Employee employee) {
		return employeeserviceimpl.save(employee);	
	}
	public List<Employee> getallemp(){
		return employeeserviceimpl.getallemp();
		
	}
	public ArrayList<Employee> getbyid(int id){
		return employeeserviceimpl.getbyid(id);
		
	}
	public Employee getbyname(String name){
		return employeeserviceimpl.getbyname(name);
		
	}

}
