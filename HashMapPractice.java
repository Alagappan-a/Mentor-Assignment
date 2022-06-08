package org.ZohoSchoolGraduateTraining;

import java.beans.Transient;
import java.util.*;

public class HashMapPractice {
	public static void main(String[] args) {
		int count=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int sizeOfArray = input.nextInt();
		int[] numberArray = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print("Enter the value for index " + i + " ");
			numberArray[i] = input.nextInt();
		}
		System.out.println("Enter the target value: \t");
		int target = input.nextInt();

		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < sizeOfArray; i++)
			map.put(numberArray[i], i);

		for (int i = 0; i < sizeOfArray; i++) {
			int requiredValue = target - numberArray[i];
			if (  map.containsKey(requiredValue) && map.get(requiredValue)!=i) {
				result[0] = i;
				result[1] = map.get(target - numberArray[i]);

				System.out.print("sum of the index to achieve target are index: " + i + " & index: " + map.get(requiredValue));
				count++;
				break;
			}
			
		}
		if(count==0) {
			System.out.println("No possible output");
		}

	}

}
