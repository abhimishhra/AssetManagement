package com.ams.dao;

import java.time.LocalDate;
import java.util.HashMap;

import com.ams.bean.AssetAllocation;
import com.ams.bean.Department;
import com.ams.bean.Employee;

public class EmployeeDaoImp implements EmployeeDao {
	private static HashMap<String,Employee> employees=new HashMap<String,Employee>();
	@Override
	public Employee readEmployee(String Employee_no) {
		Employee e=employees.get(Employee_no);
		return e;
	}
	@Override
	public boolean createEmployee(Employee e) {
		Employee result=employees.putIfAbsent(e.getEmployee_no(), e);
	    if(result!=null) {
	    	return true;
	    }
		return false;
	}
	@Override
	public boolean updateEmployee(String Employee_no, Employee e) {
		Employee result = employees.put(Employee_no, e);
		if (result != null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteEmployee(String Employee_no) {
		Employee e = employees.remove(Employee_no);
		if (e != null) {
			return true;
		}
		return false;
	}
	public void mockData() {
		this.createEmployee(new Employee("456","Abhishek","Analyst","Rakesh", LocalDate.parse("2010-02-27"),"KLM2"));
		this.createEmployee(new Employee("457","Samiran","Manager","Rakesh", LocalDate.parse("2015-03-15"),"KLM2"));
		this.createEmployee(new Employee("458","Amarsinh","Consultant","Rakesh", LocalDate.parse("2012-02-15"),"KLM2"));
		this.createEmployee(new Employee("459","Shailesh","CEO","Rakesh", LocalDate.parse("2017-03-14"),"KLM2"));
		this.createEmployee(new Employee("450","Sidhharth","Associate","Rakesh", LocalDate.parse("2020-02-27"),"KLM2"));
		this.createEmployee(new Employee("451","Sonu","Director","Rakesh", LocalDate.parse("2009-01-15"),"KLM2"));
		this.createEmployee(new Employee("452","Mukesh","Associate","Rakesh", LocalDate.parse("2013-06-19"),"KLM2"));
		this.createEmployee(new Employee("453","Jay","Analyst","Rakesh", LocalDate.parse("2007-02-17"),"KLM2"));
		this.createEmployee(new Employee("454","Ram","Manager","Rakesh", LocalDate.parse("2018-02-15"),"KLM2"));
		this.createEmployee(new Employee("455","Shyam","Watchman","Rakesh", LocalDate.parse("2007-01-02"),"KLM2"));
		this.createEmployee(new Employee("460","Ghanshyam","Clerk","Rakesh", LocalDate.parse("2002-02-27"),"KLM2"));
	}
	public void print() {
		System.out.println(employees);
	}
}
