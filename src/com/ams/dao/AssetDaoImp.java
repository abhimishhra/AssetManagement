package com.ams.dao;

import java.util.HashMap;

import com.ams.bean.Asset;


public class AssetDaoImp implements AssetDao {
private static HashMap<String,Asset> assets=new HashMap<String,Asset>();
@Override
public Asset readAsset(String AssetId) {
	Asset a=assets.get(AssetId);
	return a;
}
@Override
public boolean createAsset(Asset a) {
	Asset result=assets.putIfAbsent(a.getAssetId(), a);
    if(result!=null) {
    	return true;
    }
	return false;
}
@Override
public boolean updateAsset(String AssetId, Asset a) {
	Asset result = assets.put(AssetId, a);
	if (result != null) {
		return true;
	}
	return false;
}
@Override
public boolean deleteAsset(String AssetId) {
	Asset a = assets.remove(AssetId);
	if (a != null) {
		return true;
	}
	return false;
}
public void mockData() {
	this.createAsset(new Asset("ABC1","Monitor","Company:Lenovo c19-10,Screen:47cms",1,"Confirmed"));
	this.createAsset(new Asset("ABC2","Mouse","Company:Dell",1,"Rejected"));
	this.createAsset(new Asset("ABC3","Printer","Company:HP,Black Original Laser Jet ",1,"Accepted"));
	this.createAsset(new Asset("ABC4","Laptop","Company:Dell,RAM:4GB",1,"Rejected"));
	this.createAsset(new Asset("ABC5","CPU","Company:Lenovo,RAM:8GB,HDD:1TB",2,"Accepted"));
}
public void print() {
	System.out.println(assets);
}
}
