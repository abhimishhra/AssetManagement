package com.ams.dao;

import java.util.HashMap;

import com.ams.bean.Asset;
import com.ams.bean.Department;

public class DepartmentDaoImp implements DepartmentDao {
	private static HashMap<String,Department> departments=new HashMap<String,Department>();
	@Override
	public Department readDepartment(String Dept_id) {
		Department d=departments.get(Dept_id);
		return d;
	}
	@Override
	public boolean createDepartment(Department d) {
		Department result=departments.putIfAbsent(d.getDept_id(), d);
	    if(result!=null) {
	    	return true;
	    }
		return false;
	}
	@Override
	public boolean updateDepartment(String Dept_id, Department d) {
		Department result = departments.put(Dept_id, d);
		if (result != null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteDepartment(String Dept_id) {
		Department a = departments.remove(Dept_id);
		if (a != null) {
			return true;
		}
		return false;
	}
	public void mockData() {
		this.createDepartment(new Department("KLM1","HR"));
		this.createDepartment(new Department("KLM2","L&D"));
		this.createDepartment(new Department("KLM3","CFWG"));
		this.createDepartment(new Department("KLM4","HR"));
		this.createDepartment(new Department("KLM5","L&D"));
	}
	public void print() {
		System.out.println(departments);
	}
}
