package com.ams.service;

import java.util.ArrayList;

import com.ams.bean.Asset;

public class AdminServiceImpl implements AdminService {
	
		public ArrayList assetAvailability(){
			ArrayList list = assetAvailability();
			return list;
		}
		public boolean addAsset(Asset a){
			boolean result = addAsset(a);
			return result;
		}
		
		public ArrayList checkRequests(){
			ArrayList list = checkRequests();
			return list;
		}
		
		public String requestResponce(int requestId){
			String result = requestResponce(requestId);
			return result;
		}

}
