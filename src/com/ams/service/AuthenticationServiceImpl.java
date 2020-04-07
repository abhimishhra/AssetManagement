
package com.ams.service;

import com.ams.bean.UserMaster;
import com.ams.dao.UserMasterDaoImp;


public class AuthenticationServiceImpl implements AuthenticationService {

	UserMasterDaoImp us=new UserMasterDaoImp();
		public String verify(String username, String password){
			String result = us.verifyDao(username , password);
			return result;
		}
	}


