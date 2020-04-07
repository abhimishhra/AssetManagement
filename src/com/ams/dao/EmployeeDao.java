package com.ams.dao;

import com.ams.bean.Department;
import com.ams.bean.Employee;

public interface EmployeeDao {
	Employee readEmployee(String Employee_no);
    boolean createEmployee(Employee e);
    boolean updateEmployee(String Employee_no,Employee e);
    boolean deleteEmployee(String Employee_no);

}
