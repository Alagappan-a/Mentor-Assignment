package org.ZohoSchoolGraduateTraining;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementsProducts {
	static Scanner input = new Scanner(System.in);

	int[] findProductOfOtherElementsInArray() {
		System.out.print("Enter the total number of inputs\t:");
		int size = input.nextInt();
		int[] arr = new int[size];
		int[] result = new int[size];
		int product = 1;
		for (int i = 0; i < size; i++) {
			System.out.print("enter the number " + (i + 1) + "\t:");
			arr[i] = input.nextInt();
			product *= arr[i];
		}

		for (int i = 0; i < size; i++) {
			result[i] = product / arr[i];
		}
		return result;

	}

	public static void main(String[] args) {
		ArrayElementsProducts ArrayElement = new ArrayElementsProducts();
		System.out.println(Arrays.toString(ArrayElement.findProductOfOtherElementsInArray()));
	}
}
