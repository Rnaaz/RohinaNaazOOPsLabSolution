package com.greatLearning.administration.credentialService;

import java.util.Random;

import com.greatLearning.administration.model.Employee;

public class Service {
	
	static char[] generatePassword(int len) {

		// Generate a random password which will contain number, capital letter, small letter & special character
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";

		String values = Capital_chars + Small_chars + numbers + symbols;

		// Using random method
		Random random = new Random();

		char[] password = new char[len];

		for (int i = 0; i < len; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;

	}

	public String generateEmailAddress(Employee employee, String dept, String company) {

		return employee.getFirstName() + employee.getLastName() + "." + dept + "@" + company + ".com";
	}

	public void showCredentials(Employee employee, String dept, String company) {
		System.out.println("Dear " + employee.getFirstName() + " your generaterd credentials are as follows");
		System.out.println("Email--->" + generateEmailAddress(employee, dept, company));
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Password---> ");
		stringBuilder.append(generatePassword(8));
		System.out.println(stringBuilder.toString());
	}

}