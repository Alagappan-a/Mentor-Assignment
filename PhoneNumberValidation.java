package org.ZohoSchoolGraduateTraining;

import java.util.Scanner;

public class PhoneNumberValidation {
	public static void isPhoneNumber(String phNo) {
		try {
			long phoneNum = Long.parseLong(phNo);
			if (phNo.length() == 10&&phNo.charAt(0)>'5') {
				System.out.println("Valid mobile number");
			} else {
				System.out.println("You have entered wrong input");
			}
		} catch (Exception e) {
			System.out.println("You have entered wrong input");
		}
	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the phoneNumber:\t");
		String phoneNumber = userInput.nextLine();
		isPhoneNumber(phoneNumber);
		userInput.close();
	}

}
