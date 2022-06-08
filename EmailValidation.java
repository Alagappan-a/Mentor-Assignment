package org.ZohoSchoolGraduateTraining;

import java.util.Scanner;

public class EmailValidation {
	public static void isEmailId(String emailId) {
		String domain = "@";
		String com = ".com";
		String in = ".in";
		if (emailId.indexOf(domain) == emailId.lastIndexOf(domain) && emailId.indexOf(domain) != 0
				&& emailId.charAt(0) != '.') {
			if (emailId.contains(domain) && (emailId.contains(in) || (emailId.contains(com)))) {
				System.out.println("entered email address is a valid email address");
			} else {
				System.out.println("entered email address is not a valid email address");
			}
		} else {
			System.out.println("entered email address is not a valid email address");
		}
	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the emailID:\t");
		String emailId = userInput.nextLine();
		isEmailId(emailId);
		userInput.close();
	}

}
