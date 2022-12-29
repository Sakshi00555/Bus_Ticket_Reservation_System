package com.bus.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bus.bean.Customer;

import com.bus.usecases.AddBususecase;
import com.bus.usecases.AdminLoginusecase;
import com.bus.usecases.BookTicketNameusecase;
import com.bus.usecases.CancelTicketNameusecase;
import com.bus.usecases.CusLoginusecase;
import com.bus.usecases.CusSignUpSecondusecase;
import com.bus.usecases.UpdateStatususecase;
import com.bus.usecases.ViewAllTicketsusecase;
import com.bus.usecases.ViewTicketusecase;

public class Main {
    static void AdminOrCustomer() {
        System.out.println( "+---------------------------+" + "\n"
                                                   + "| 1. Login As Administrator |" + "\n"
                                                   + "| 2. Login As Customer      |" + "\n"
                                                   + "| 3. Exit                   |" + "\n"
                                                   + "+---------------------------+" );
        choice();
    }
    
    static void choice() {
        Scanner sc = new Scanner(System.in);
        
        int choice = 0;
        try {
            choice = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Input type should be number");
            AdminOrCustomer();
        }
        
        if (choice == 1) {
            System.out.println("Welcome Admin ! Please Login to your account");
            AdminLogin();
        }
        else if (choice == 2) {
            System.out.println("Welcome Customer !");
            customerLoginOrSignup();
        }
        else if (choice == 3) {
            System.out.println("Thank you ! Visit again");
            System.exit(0);
        }
        else {
            System.out.println("Please choose a number from below options");
            AdminOrCustomer();
        }
    }
    
    static void AdminLogin() {
        
        Boolean result = AdminLoginusecase.AdminLogin();

        if (result) adminMethods();
        else {
            AdminLogin();
        }
    }
    
    static void adminMethods() {
        System.out.println("+--------------------------------+" + "\n"
                         + "| Welcome Admin                  |" + "\n"
                         + "| 1. Add Bus                     |" + "\n"
                         + "| 2. Confirm Tickets of Customer |" + "\n"
                         + "| 3. View All Bookings           |" + "\n"
                         + "| 4. Back                        |" + "\n"
                         + "| 5. Exit                        |" + "\n"
                         + "+--------------------------------+" );
        
        Scanner sc = new Scanner(System.in);
        
        int choice = 0;
        try {
            choice = sc.nextInt();
            if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
                System.out.println("Please choose a number from below options");
                adminMethods();
            }
            else adminChoice(choice);
        }
        catch (InputMismatchException e) {
            
            System.out.println("Input type should be number");
            adminMethods();
        }
    }
    
    static void adminChoice(int choice) {
        
            switch(choice) {
                case 1 : {
                    AddBususecase.AddBus();
                    adminMethods();
                }
                break;
                case 2 : {
                    UpdateStatususecase.updateStatus();
                    adminMethods();
                }
                break;
                case 3 : {
                    ViewAllTicketsusecase.viewAllTicket();
                    adminMethods();
                }
                break;
                case 4 : AdminOrCustomer();
                break;  
                case 5 : {
                    System.out.println("Thank you ! Visit again");
                    System.exit(0);
                }
            }
    }
    
    static void customerLoginOrSignup() {
        System.out.println( "+--------------------------------+" + "\n"
                                                + "| 1. Login to your Account       |" + "\n"
                                                + "| 2. Don't have Account? Sign Up |" + "\n"
                                                + "| 3. Back                        |" + "\n"
                                                + "| 4. Exit                        |" + "\n"
                                                + "+--------------------------------+");
        try {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            
            if (choice == 1) {
                customerLogin();
            }
            else if (choice == 2) {
                customerSignup();
            }
            else if (choice == 3) {
                AdminOrCustomer();
            }
            else if (choice == 4) {
                System.out.println("Thank you ! Visit again");
                System.exit(0);
            }
            else {
                System.out.println("Please choose a number from below options");
                customerLoginOrSignup();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Input type should be number");
            customerLoginOrSignup();
        }
        
    }
    
    static void customerLogin() {
        Customer customer = CusLoginusecase.CusLogin();
        
        if (customer == null) {
            customerLogin();
        }
        else {
            System.out.println("Login Successfull");
            customerMethods(customer);
        }
        
    }
    
    static void customerSignup() {
        boolean flag = CusSignUpSecondusecase.cusSignUp();
        
        if (flag) {
            System.out.println("Login to your Account");
            customerLogin();
        }
        else {
            customerSignup();
        }
    }
    
    static void customerMethods(Customer customer) {
        System.out.println("+--------------------------------+" + "\n"
                         + "| 1. Book Bus Ticket             |" + "\n"
                         + "| 2. Cancel Bus Ticket           |" + "\n"
                         + "| 3. View Status of your Tickets |" + "\n"
                         + "| 4. Back                        |" + "\n"
                         + "| 5. Exit                        |" + "\n"
                         + "+--------------------------------+");
        
        Scanner sc = new Scanner(System.in);
        
        int choice = 0;
        try {
            choice = sc.nextInt();
            if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
                System.out.println("Please choose a number from below options");
                customerMethods(customer);
            }
            else customerChoice(choice, customer);
        }
        catch (InputMismatchException e) {
            
            System.out.println( "Input type should be number");
            customerMethods(customer);
        }
    }
    
    static void customerChoice(int choice, Customer customer) {
        switch(choice) {
        case 1 : {
            BookTicketNameusecase.BookTicketbName(customer);
            customerMethods(customer);
        }
        break;
        case 2 : {
            CancelTicketNameusecase.cancelTicket(customer);
            customerMethods(customer);
        }
        break;
        case 3 : {
            ViewTicketusecase.viewTicket(customer);
            customerMethods(customer);
        }
        break;
        case 4 : {
            customerLoginOrSignup();
        }
        case 5 : {
            System.exit(0);
        }
    }
    }
    

    public static void main(String[] args) {
        
        AdminOrCustomer();
                
    }   

}
