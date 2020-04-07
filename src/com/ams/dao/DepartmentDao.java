package com.ams.dao;

import com.ams.bean.AssetAllocation;
import com.ams.bean.Department;

public interface DepartmentDao {
	Department readDepartment(String Dept_id);
    boolean createDepartment(Department d);
    boolean updateDepartment(String Dept_id, Department d);
    boolean deleteDepartment(String Dept_id);

}
