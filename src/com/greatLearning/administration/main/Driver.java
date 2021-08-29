package com.greatLearning.administration.main;

import java.util.Scanner;

import com.greatLearning.administration.credentialService.Service;
import com.greatLearning.administration.model.Employee;

public class Driver {

	public static void main(String[] args) {
		Employee employee = new Employee("Rohina", "Naaz");
		Service service = new Service();
		Scanner sc = new Scanner(System.in);
		int option;
		String dept = "";
		String company = "";
		do {
			System.out.println("Please Enter the department from the following");
			System.out.println("..............................");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.println("..............................");
			option = sc.nextInt();
			System.out.println("Enter the company name");
			System.out.println("..............................");
			
			company = sc.next();

			switch (option) {
			case 1:
				dept = "tech";
				break;
			case 2:
				dept = "admin";
				break;
			case 3:
				dept = "hr";
				break;
			case 4:
				dept = "legal";
				break;
			default:
				System.out.println("Invalid input");
			}
			service.showCredentials(employee, dept, company);
		} while (option != 0);
		sc.close();
	}

}
