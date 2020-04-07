package com.ams.service;

import java.util.ArrayList;

import com.ams.bean.Asset;
import com.ams.bean.AssetForm;
import com.ams.dao.AssetDaoImp;
import com.ams.dao.AssetFormDao;
import com.ams.dao.AssetFormDaoImp;

public class AdminServiceImpl implements AdminService {
	AssetDaoImp asset=new AssetDaoImp();
	AssetFormDaoImp a= new AssetFormDaoImp();
		public ArrayList assetAvailability(){
			ArrayList list = a.readAssetforms();
			return list;
		}
		public boolean addAsset(Asset a){
			asset.mockData();
			boolean result = asset.createAsset(a);
			return result;
		}
		
		public ArrayList checkRequests(){
			ArrayList list = a.readAssetforms();
			return list;
		}
		
		public String requestResponce(int requestId){
			String result = requestResponce(requestId);
			return result;
		}

}
