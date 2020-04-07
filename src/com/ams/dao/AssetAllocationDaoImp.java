package com.ams.dao;

import java.time.LocalDate;
import java.util.HashMap;

import com.ams.bean.Asset;
import com.ams.bean.AssetAllocation;


public class AssetAllocationDaoImp implements AssetAllocationDao {
	private static HashMap<String, AssetAllocation> allocations = new HashMap<String, AssetAllocation>();
	@Override
	public AssetAllocation readAssetAllocation(String allocationId) {
		AssetAllocation a = allocations.get(allocationId);
		return a;
	}
	@Override
	public boolean createAssetAllocation(AssetAllocation a) {
		AssetAllocation result=allocations.putIfAbsent(a.getAllocationId(), a);
	    if(result!=null) {
	    	return true;
	    }
		return false;
	}
	@Override
	public boolean updateAssetAllocation(String allocationId, AssetAllocation a) {
		AssetAllocation result = allocations.put(allocationId, a);
		if (result != null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteAssetAllocation(String allocationId) {
		AssetAllocation a = allocations.remove(allocationId);
		if (a != null) {
			return true;
		}
		return false;
	}
	public void mockData() {
		this.createAssetAllocation(new AssetAllocation("xyz1","ABC2","123", LocalDate.parse("2020-02-13"), LocalDate.parse("2020-02-27")));
		this.createAssetAllocation(new AssetAllocation("xyz2","ABC4","124", LocalDate.parse("2020-01-01"), LocalDate.parse("2020-01-24")));
		this.createAssetAllocation(new AssetAllocation("xyz3","ABC5","125", LocalDate.parse("2020-01-15"), LocalDate.parse("2020-02-01")));
		this.createAssetAllocation(new AssetAllocation("xyz4","ABC3","126", LocalDate.parse("2020-01-13"), LocalDate.parse("2020-02-21")));
		this.createAssetAllocation(new AssetAllocation("xyz6","ABC1","127", LocalDate.parse("2020-01-20"), LocalDate.parse("2020-02-27")));
	}
	public void print() {
		System.out.println(allocations);
	}
}
