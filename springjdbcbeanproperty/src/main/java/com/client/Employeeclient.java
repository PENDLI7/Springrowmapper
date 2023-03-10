package com.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.Employeecontroller;
import com.pojo.Employee;

public class Employeeclient {

	public static void main(String[] args) {
		List<Employee>emp=new ArrayList<Employee>();
		
     emp.add(new Employee(3, "sachin", 1000.00));
     emp.add(new Employee(45, "rohit", 3000.00));
     emp.add(new Employee(7, "ms dhoni", 5000.00));
    emp.add(new Employee(10, "kholi", 3000.00));


ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
Employeecontroller controller = (Employeecontroller) context.getBean("dao");
Employee geybyid=controller.getbyid(7);
System.out.println(geybyid);
//Employee getbyname = controller.getbyname("kholi");
//
//System.out.println(getbyname);

//List<Employee> getallemp = controller.getallemp();
//for (Employee employee : getallemp) {
//	System.out.println(employee);
//
//}
//for (Employee employee : emp) {
//	System.out.println(employee);
//	controller.save(employee);
	
//}

}

}
