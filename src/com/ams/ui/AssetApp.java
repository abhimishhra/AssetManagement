package com.ams.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.ams.bean.Asset;
import com.ams.bean.AssetForm;
import com.ams.service.AdminServiceImpl;
import com.ams.service.AuthenticationServiceImpl;
import com.ams.service.UserServiceImpl;

public class AssetApp {

	public static void main(String[] args) {
		AuthenticationServiceImpl authenticate = new AuthenticationServiceImpl();
		AdminServiceImpl admin = new AdminServiceImpl();
		UserServiceImpl user = new UserServiceImpl();
		Scanner sc =new Scanner(System.in);
		String username;
		String password;
		System.out.println("Enter Username");
		username=sc.nextLine();
		System.out.println("Enter password");
		password=sc.nextLine();
		String validate=authenticate.verify(username,password);
		if(validate=="admin") {
			boolean flag=true;
			do {
				System.out.println("Enter your choice");
				System.out.println("1. Add Assets");
				System.out.println("2. Check Requests");
				System.out.println("3. Check Asset Availability");
				System.out.println("4. Request Response");
				System.out.println("5. Stop");
				int choice = sc.nextInt();
				switch(choice){
					case 1: System.out.println("Enter Asset number");
					String assetNumber = sc.nextLine();
					System.out.println("Enter Asset Name");
					String assetName = sc.next();
					System.out.println("Enter Asset Description");
					String assetDes = sc.next();
					System.out.println("Enter Asset Quantity");
					int assetQuantity = sc.nextInt();
					System.out.println("Enter Asset Status (Available/Not available)");
					String assetStatus = sc.next();
					Asset a = new Asset(assetNumber, assetName, assetDes, assetQuantity, assetStatus);
					admin.addAsset(a);
					break;
					case 2: ArrayList list = admin.checkRequests();
					System.out.println(list);
					break;
					case 3: ArrayList list1 = admin.assetAvailability();
					System.out.println(list1);
					break;
					case 4: System.out.print("Enter Request Id");
					int requestId = sc.nextInt();
					String response = admin.requestResponce(requestId);
					System.out.println(response);
					break;
					case 5: flag = false;
					break;
					default: System.out.println("Enter Correct choice");
					
				}
			}while(flag);
		}
		else if (validate == "Manager"){
			boolean flag = true;
			do{
				System.out.println("Enter your choice");
				System.out.println("1. Raise Request");
				System.out.println("2. Check Status");
				System.out.println("3. Stop");
				int choice = sc.nextInt();
				switch(choice){
					case 1: System.out.println("Enter Employee Id");
					String empId = sc.nextLine();
					System.out.println("Enter Manager Id");
					String managerId = sc.nextLine();
					System.out.println("Enter Asset Name");
					String assetName = sc.next();
					AssetForm form = new AssetForm(empId, managerId, assetName);
					String requestid = user.raiseRequest(form);
					System.out.println("Asset Request Id: "+requestid);
					break;
					case 2: System.out.println("Enter Asset Request Id");
					int requestId = sc.nextInt();
					String status = user.checkStatus(requestId);
					System.out.println("status: "+status);
					case 3: flag = false;
					break;
					default: System.out.println("Enter Correct choice");
				}
					
			}while(flag);
				
		}
		else {
			System.out.println("Invalid Username or Password");
		}
		
	}

}
