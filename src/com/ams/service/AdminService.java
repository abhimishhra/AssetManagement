package com.ams.service;

import java.util.ArrayList;

import com.ams.bean.Asset;

public interface AdminService {
	public ArrayList assetAvailability();
	public boolean addAsset(Asset a);
	public ArrayList checkRequests();
	public String requestResponce(int requestId);
}
