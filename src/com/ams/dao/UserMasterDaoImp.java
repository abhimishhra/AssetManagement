
package com.ams.dao;

import java.util.HashMap;

import com.ams.bean.AssetAllocation;
import com.ams.bean.Department;
import com.ams.bean.UserMaster;

public class UserMasterDaoImp implements UserMasterDao {
	private static HashMap<String, UserMaster>users = new HashMap<String, UserMaster>();
	@Override
	public UserMaster readUserMaster(String userId) {
		UserMaster u = users.get(userId);
		return u;
	}
	@Override
	public boolean createUserMaster(UserMaster u) {
		UserMaster result=users.putIfAbsent(u.getUserId(), u);
	    if(result!=null) {
	    	return true;
	    }
		return false;
	}
	@Override
	public boolean updateUserMaster(String userId, UserMaster u) {
		UserMaster result = users.put(userId, u);
		if (result != null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteUserMaster(String userId) {
		UserMaster u = users.remove(userId);
		if (u != null) {
			return true;
		}
		return false;
	}
	public void mockData() {
		this.createUserMaster(new UserMaster("123456","admin","987456","Manager"));
		this.createUserMaster(new UserMaster("423456","Samiran","902860@ab","Admin"));
		this.createUserMaster(new UserMaster("523456","Amarsinh","456879@wr","Manager"));
		this.createUserMaster(new UserMaster("923456","Shailesh","Sa12563@hg","Admin"));
		this.createUserMaster(new UserMaster("1823456","Abhinash","Kamla@48","Manager"));
		this.createUserMaster(new UserMaster("923456","Sonu","Kapoor@234","Admin"));
		this.createUserMaster(new UserMaster("723456","Aakash","abhhish@345","Manager"));
	}
	public void print() {
		System.out.println(users);
	}
}
