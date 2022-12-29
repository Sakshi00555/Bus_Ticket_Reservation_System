package com.bus.usecases;

import java.util.InputMismatchException;
import java.util.Scanner;


import com.bus.dao.CustomerDao;
import com.bus.dao.CustomerDaoImpl;

public class CusSignUpSecondusecase {
public static boolean cusSignUp() {
        
    boolean flag = false;
    
    try {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Username");
        String username = sc.next();
        
        System.out.println("Enter Password");
        String password = sc.next();
        
        System.out.println("Enter First Name");
        String firstName = sc.next();
        
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        
        sc.nextLine();
        System.out.println("Enter Address");
        String address = sc.nextLine();
        
        System.out.println("Enter Mobile");
        String mobile = sc.next();
        
        CustomerDao dao = new CustomerDaoImpl();
        
        String result = dao.cusSignUp(username, password, firstName, lastName, address, mobile);
        
        
        if (result == "Sign up Successfull") {
            System.out.println(result);
            flag = true;
            }
        else {
            System.out.println(result);
        }
        
    }
    catch (InputMismatchException e) {
        System.out.println("Invalid Input");
    }
    
    return flag;
}

}
