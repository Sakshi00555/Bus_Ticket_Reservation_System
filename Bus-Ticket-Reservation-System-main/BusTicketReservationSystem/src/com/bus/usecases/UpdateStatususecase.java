package com.bus.usecases;

import java.util.Scanner;

import com.bus.dao.AdminDao;
import com.bus.dao.AdminDaoImpl;

public class UpdateStatususecase {
	
	public static void updateStatus() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer Id");
		int cusId = sc.nextInt();
		
		AdminDao dao = new AdminDaoImpl();
		
		String result = dao.updateStatus(cusId);
		boolean flag = true;
		
		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) == 'n') flag = false;
		}
	
		if (flag) System.out.println(result);
		else System.out.println(result);
		
	}

}
