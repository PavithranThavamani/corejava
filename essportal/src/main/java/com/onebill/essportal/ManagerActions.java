package com.onebill.essportal;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ManagerActions {

	Scanner scanner = new Scanner(System.in);

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("ess");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	@SuppressWarnings("unchecked")
	public void showLeaveRequests() {
		System.out.println("Here's all the leave requests...");
		System.out.println();
		Query query = manager.createQuery("select leave_status from LeaveInfo leave_status");
		List<LeaveInfo> resultList = query.getResultList();
		for (LeaveInfo leaveInfo : resultList) {
			System.out.println("--------------------------------------");
			System.out.println(leaveInfo);
			System.out.println("--------------------------------------");
		}
		
	}

	public void ApproveOrRejectRequests() {

		System.out.println();
		System.out.print("Enter employee ID to set leave Status : ");
		int statusId = scanner.nextInt();
		Query query = manager.createQuery("select employee_id  from LeaveInfo");
		List<LeaveInfo> resultList = query.getResultList();
		boolean contains = resultList.contains(statusId);
		if (!contains) {
			System.out.println("--------------------------------------");
			System.out.println("No leave requests from Employee id : " + statusId);
			System.out.println("--------------------------------------");
		} else {
			System.out.println();
			System.out.print("Enter the status you want to set : ");
			String status = scanner.next();
			LeaveInfo find = manager.find(LeaveInfo.class, statusId);

			find.setLeave_status(status);
			System.out.println("--------------------------------------");
			System.out.println("Status set successfully");
			System.out.println("--------------------------------------");
			transaction.begin();
			manager.persist(find);
			transaction.commit();
		}

	}
}
