package com.ams.bean;

public class AssetForm {
private String empId;
private String managerId;
private String assetName;
private String requestId;
private String status;
 public AssetForm() {
	 
 }
public AssetForm(String empId, String managerId, String assetName) {
	super();
	this.empId = empId;
	this.managerId = managerId;
	this.assetName = assetName;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getManagerId() {
	return managerId;
}
public void setManagerId(String managerId) {
	this.managerId = managerId;
}
public String getAssetName() {
	return assetName;
}
public void setAssetName(String assetName) {
	this.assetName = assetName;
}

public String getRequestId() {
	return requestId;
}
public void setRequestId(String requestId) {
	this.requestId = requestId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "AssetForm [empId=" + empId + ", managerId=" + managerId + ", assetName=" + assetName + ", requestId="
			+ requestId + ", status=" + status + "]";
}

 
}
