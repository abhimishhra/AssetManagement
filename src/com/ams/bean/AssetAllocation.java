package com.ams.bean;

import java.time.LocalDate;

public class AssetAllocation {
	private String allocationId;
	private String assetId;
	private String Empno;
	private LocalDate Allocation_date;
	private LocalDate Release_date;

	public AssetAllocation() {
		
	}

	public AssetAllocation(String allocationId, String assetId, String empno, LocalDate allocation_date,
			LocalDate release_date) {
		super();
		this.allocationId = allocationId;
		this.assetId = assetId;
		Empno = empno;
		Allocation_date = allocation_date;
		Release_date = release_date;
	}

	public String getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getEmpno() {
		return Empno;
	}

	public void setEmpno(String empno) {
		Empno = empno;
	}

	public LocalDate getAllocation_date() {
		return Allocation_date;
	}

	public void setAllocation_date(LocalDate allocation_date) {
		Allocation_date = allocation_date;
	}

	public LocalDate getRelease_date() {
		return Release_date;
	}

	public void setRelease_date(LocalDate release_date) {
		Release_date = release_date;
	}

	@Override
	public String toString() {
		return "AssetAllocation [allocationId=" + allocationId + ", assetId=" + assetId + ", Empno=" + Empno
				+ ", Allocation_date=" + Allocation_date + ", Release_date=" + Release_date + "]";
	}

	

	}




