package com.onebill.essportal;



import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	 int choice;
    	do {
    		System.out.println("--------------------------------------");
    		System.out.println();
    		System.out.println("•	Press 1 to register employee\r\n" + 
        			"•	Press 2 to login\n"+"•	Press 3 to Exit\n");
        	System.out.println();
        	System.out.println("--------------------------------------");
    		choice = scanner.nextInt();
        	
    		Actions actions = new Actions();
    		switch (choice) {
    		case 1:
    			
    			actions.registerEmployee();
    			break;
    		case 2:
    			
    			actions.login();
    			break;
    		case 3:
    			System.out.println("--------------------------------------");
    			System.out.println("Welome...");
    			System.out.println("--------------------------------------");
    			System.exit(0);
    			break;

			default:
				System.out.println("--------------------------------------");
				System.out.println("Enter valid choice");
				System.out.println("--------------------------------------");
				break;
			}
		}while(choice != 3);
    	
    	
    	


    }
}
