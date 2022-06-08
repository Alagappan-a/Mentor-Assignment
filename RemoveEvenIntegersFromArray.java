package org.ZohoSchoolGraduateTraining;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveEvenIntegersFromArray {
	static Scanner input = new Scanner(System.in);
	
	int[] removeEvenNumbers() {
		System.out.print("Enter the total number of inputs\t:");
		int size = input.nextInt();
		int[] arr = new int[size];
		int oddSize = 0;
		int arrayPosition=0;
		for (int i = 0; i < size; i++) {
			System.out.print("enter the number " + (i + 1) + "\t:");
			arr[i] = input.nextInt();
			if (arr[i] % 2 != 0) {
				oddSize++;
			}
		}
		int[] odd = new int[oddSize];
		for (int i = 0; i < size; i++) {
			if(arr[i]%2!=0) {
				odd[arrayPosition++]=arr[i];
				
			}
			
		}
	return odd;	
	}
	public static void main(String[] args) {
		RemoveEvenIntegersFromArray removeEvenNumberObject =new RemoveEvenIntegersFromArray();
		
		System.out.println(Arrays.toString(removeEvenNumberObject.removeEvenNumbers()));
	}

}
