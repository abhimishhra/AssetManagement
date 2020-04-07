package com.ams.dao;

import java.util.ArrayList;

import com.ams.bean.AssetForm;

public interface AssetFormDao {
	public ArrayList<AssetForm> readAssetforms();
	public String update(AssetForm form);
	public String checkStatusDao(int assetRequestId);
}
