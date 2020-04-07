package com.ams.dao;

import com.ams.bean.Asset;

public interface AssetDao {
    Asset readAsset(String AssetId);
    boolean createAsset(Asset a);
    boolean updateAsset(String AssetId, Asset a);
    boolean deleteAsset(String AssetId);
}
