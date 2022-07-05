package Zsgs.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	static int[] insertionSort(int[] sortedArray) {
		for(int i=1;i<sortedArray.length;i++) {
			for(int j=0;j<i;j++) {
				if(sortedArray[j]>sortedArray[i]) {
					int temp = sortedArray[i];
					for(int k=i;k>j;k--) {
						sortedArray[k] = sortedArray[k-1];
					}
					sortedArray[j] = temp;
				}
			}

		}
			
		return sortedArray;
	}
	public static void main(String args[]) {
			int unsortedArray[] = {3,1,20,8,2};
 			insertionSort(unsortedArray);
 			System.out.println("Sorted array is:"+Arrays.toString(insertionSort(unsortedArray)));

		}

}

