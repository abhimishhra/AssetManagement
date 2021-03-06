package com.ams.bean;

public class UserMaster {
	private String userId;
private String username;
private String password;
private String UserType;

public UserMaster() {
	
}

public UserMaster(String userId, String username, String password, String userType) {
	super();
	this.userId = userId;
	this.username = username;
	this.password = password;
	UserType = userType;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getUserType() {
	return UserType;
}

public void setUserType(String userType) {
	UserType = userType;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", UserType=" + UserType
			+ "]";
}


}
