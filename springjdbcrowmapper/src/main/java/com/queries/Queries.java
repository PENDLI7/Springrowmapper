package com.queries;

public interface Queries {
	 String insert="insert into employee values (?,?,?)";
 String delete="delete from employee where is id = ?";
	 String update="update employee set name=?,salary=? where id=?";
	String getall="select *from employee";
	String getbyid="select * from employee where id=?";
 String getbyname="select * from employee where name=?";
}
