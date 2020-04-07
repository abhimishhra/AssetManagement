package com.ams.dao;

import com.ams.bean.Department;
import com.ams.bean.UserMaster;

public interface UserMasterDao {
	UserMaster readUserMaster(String userId);
    boolean createUserMaster(UserMaster u);
    boolean updateUserMaster(String userId, UserMaster u);
    boolean deleteUserMaster(String userId);

}
