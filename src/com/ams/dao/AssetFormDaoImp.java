package com.ams.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.ams.bean.AssetForm;

public class AssetFormDaoImp implements AssetFormDao {
	private static HashMap<String, AssetForm>forms = new HashMap<String, AssetForm>();
	@Override
	public ArrayList<AssetForm> readAssetforms() {
		List<AssetForm> result = forms.values().stream().collect(Collectors.toList()); 
		return new ArrayList<AssetForm>(result);
	}
	
	public String update(AssetForm form){
		AssetForm result=forms.putIfAbsent(form.getRequestId(), form);
	    return form.getRequestId();
	}
	public String checkStatusDao(int assetRequestId){
		AssetForm a = forms.get(assetRequestId);
		return a.getStatus();
	}
}
