package com.onebill.essportal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;
import java.util.Scanner;

public class LeaveActions {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("ess");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	Scanner scanner = new Scanner(System.in);
	
	public void getLeave(int loggedInId) {
		
		LeaveInfo leaveInfo = new LeaveInfo();
		Query createQuery = manager.createQuery("select employee_id from LeaveInfo");
		List resultList = createQuery.getResultList();
		boolean contains = resultList.contains(loggedInId);
		if(contains) {
			System.out.println("--------------------------------------");
			System.out.println("Leave Applied already..");
			System.out.println("--------------------------------------");
		} else {
			
			leaveInfo.setEmployee_id(loggedInId);
			System.out.println();
			
			System.out.print("Enter the date you want to get leave : ");
			leaveInfo.setLeave_date(scanner.next());
			leaveInfo.setLeave_status("Pending");
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println("leave Applied successfully");
			System.out.println("--------------------------------------");
			transaction.begin();
			manager.persist(leaveInfo);
			transaction.commit();
		}
		} 
		
	
	
}
