package com.ams.service;

import com.ams.bean.AssetForm;

public interface UserService {
	public  String raiseRequest(AssetForm form);
	public String checkStatus(int assetRequestId);
}
