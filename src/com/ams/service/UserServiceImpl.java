package com.ams.service;

import java.util.HashMap;

import com.ams.bean.AssetForm;
import com.ams.dao.AssetFormDao;

public class UserServiceImpl implements UserService{
	private static HashMap<String, AssetForm>forms = new HashMap<String, AssetForm>();
	public String raiseRequest(AssetForm form){
		String assetRequestId = update(form);
		return assetRequestId;
	 
	}
	public String update(AssetForm form){
		AssetForm result=forms.putIfAbsent(form.getRequestId(), form);
	    return form.getRequestId();
	}
	
	public String checkStatus(int assetRequestId)
	{
		String result = checkStatus(assetRequestId);
		return result;
		
	}

}
