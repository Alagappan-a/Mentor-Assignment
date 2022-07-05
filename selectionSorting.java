package Zsgs.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSorting {
	static int[] selectionSort(int[] sortedArray) {
		for(int i=0;i<sortedArray.length-1;i++) {
			int minimum = sortedArray[i];
			int position = i;
			for(int j=i+1; j<sortedArray.length;j++) {
				if(sortedArray[j] < minimum) {
					minimum = sortedArray[j];
					position = j;
				}
			}
			if(position!=i) {
				sortedArray[position] = sortedArray[i];
				sortedArray[i] = minimum;
			}
		}
		return sortedArray;
	}
	public static void main(String args[]) {
		int unsortedArray[] = {3,1,20,8,2};
		new selectionSorting().selectionSort(unsortedArray);
		System.out.println("Sorted array is:"+ Arrays.toString(new selectionSorting().selectionSort(unsortedArray)));
	}
}
