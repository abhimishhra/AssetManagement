package com.ams.dao;

import com.ams.bean.Asset;
import com.ams.bean.AssetAllocation;

public interface AssetAllocationDao {
	AssetAllocation readAssetAllocation(String allocationId);
    boolean createAssetAllocation(AssetAllocation a);
    boolean updateAssetAllocation(String allocationId, AssetAllocation a);
    boolean deleteAssetAllocation(String allocationId);
}
