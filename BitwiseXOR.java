package org.ZohoSchoolGraduateTraining;

import java.util.Scanner;

public class BitwiseXOR {
	public static void findMaximumOfTwoNumberByXOR(int[] inputArray, int n) {
		int max = 0;
		int firstElement = 0;
		int secondElement = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int valueOfXOR = inputArray[i] ^ inputArray[j];
				if (valueOfXOR > max) {
					max = valueOfXOR;
					firstElement = inputArray[i];
					secondElement = inputArray[j];
				}
			}
		}
		System.out.println(
				"the maximum XOR value the given array is : " + firstElement + " XOR " + secondElement + " : " + max);
	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the size of array\t:");
		int sizeOfArray = userInput.nextInt();
		int[] inputArray = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print("Enter the value for index " + i + "\t:");
			inputArray[i] = userInput.nextInt();
		}
		findMaximumOfTwoNumberByXOR(inputArray, sizeOfArray);
	}

}
