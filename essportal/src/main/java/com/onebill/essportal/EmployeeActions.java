package com.onebill.essportal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeActions {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("ess");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public void showAllStatusOfLeaveRequests(int loginId) {
		Query createQuery = manager.createQuery("from LeaveInfo");
		List<LeaveInfo> resultList = createQuery.getResultList();
		for (LeaveInfo leaveInfo : resultList) {
			if(leaveInfo.getEmployee_id() == loginId) {
				System.out.println("--------------------------------------");
				System.out.println(leaveInfo);
				System.out.println("--------------------------------------");
			}
		}
	}
}
