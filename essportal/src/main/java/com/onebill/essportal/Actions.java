package com.onebill.essportal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import java.util.List;
import java.util.Scanner;

public class Actions {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("ess");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	EmployeeInfo employeeInfo = new EmployeeInfo();
	LeaveActions leaveactions = new LeaveActions();
	ManagerActions manageractions = new ManagerActions();
	EmployeeActions employeeactions =  new EmployeeActions();
	Scanner scanner = new Scanner(System.in);

	public void registerEmployee() {
		try {

			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println("Enter employee details");
			System.out.println("--------------------------------------");
			System.out.print("Employee id : ");
			employeeInfo.setEmployee_id(scanner.nextInt());
			System.out.print("Employee name : ");
			employeeInfo.setEmployee_name(scanner.next());
			System.out.print("Employee type : ");
			employeeInfo.setEmployee_type(scanner.next());
			System.out.print("Employee email : ");
			employeeInfo.setEmail(scanner.next());
			System.out.print("Employee password : ");
			employeeInfo.setPassword(scanner.next());

			transaction.begin();
			manager.persist(employeeInfo);
			transaction.commit();
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println("Registered Successfully..");
			System.out.println("--------------------------------------");
			System.out.println();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("--------------------------------------");
			System.out.println("User already exists");
			System.out.println("--------------------------------------");
		}
	}

	public void login() {
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("Enter employee details");
		System.out.println();
		System.out.print("Employee id : ");
		int loginId = scanner.nextInt();
		System.out.print("Employee password : ");
		String loginPassword = scanner.next();
		Query query = manager.createQuery("select employee_id from EmployeeInfo");
		List<EmployeeInfo> list = query.getResultList();
		boolean contains = list.contains(loginId);
		if (!contains) {
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println("User does not Exists..");
			System.out.println("--------------------------------------");
			System.out.println();
		} else {
			EmployeeInfo find = manager.find(EmployeeInfo.class, loginId);
			String password = find.getPassword();
			boolean equals = password.equals(loginPassword);
			if (equals) {
				System.out.println();
				System.out.println("--------------------------------------");
				System.out.println("Logged in Successfully");
				System.out.println("--------------------------------------");
				System.out.println();

				String employee_type = find.getEmployee_type();
				if (employee_type.equals("employee")) {
					System.out.println("--------------------------------------");
					System.out.println("Welcome employee, " + find.getEmployee_name());
					System.out.println("--------------------------------------");
					System.out.println();

					int choice1;
					do {
						System.out.println("--------------------------------------");
						System.out.println();
						System.out.println("•	Press 1 to show all status of leave requests\n"
								+ "•	Press 2 to request fo a leave\n" + "•	Press 3 to Exit");
						System.out.println();
						System.out.println("--------------------------------------");
						choice1 = scanner.nextInt();

						switch (choice1) {
						case 1:
							employeeactions.showAllStatusOfLeaveRequests(loginId);
							break;

						case 2:
							leaveactions.getLeave(loginId);
							break;
						case 3:
						System.out.println("--------------------------------------");
						System.out.println();
						System.out.println("Welome...");
						System.out.println();
						System.out.println("--------------------------------------");
						default:
							System.out.println("--------------------------------------");
							System.out.println("Enter valid choice");
							System.out.println("--------------------------------------");
							break;
						}

					} while (choice1 != 3);

				} else {
					System.out.println("--------------------------------------");
					System.out.println("Welcome Manager, " + find.getEmployee_name());
					System.out.println("--------------------------------------");

					int choice;
					do {
						System.out.println("--------------------------------------");
						System.out.println();
						System.out.println("•	Press 1 to show all leave requests\n"
								+ "•	Press 2 to Approve/Reject leave request\n" + "•	Press 3 to Exit");
						System.out.println();
						System.out.println("--------------------------------------");
						choice = scanner.nextInt();
						switch (choice) {
						case 1:
							manageractions.showLeaveRequests();
							break;
						case 2:
							manageractions.ApproveOrRejectRequests();
							break;
						case 3:
							System.out.println("--------------------------------------");
							System.out.println();
							System.out.println("Welome...");
							System.out.println();
							System.out.println("--------------------------------------");
							break;
						default:
							System.out.println("--------------------------------------");
							System.out.println("Enter valid choice");
							System.out.println("--------------------------------------");
							break;
						}
					} while (choice != 3);
				}

			} else {
				System.out.println();
				System.out.println("--------------------------------------");
				System.out.println("Incorrect password");
				System.out.println("--------------------------------------");
				System.out.println();

			}
		}

	}
}
