package Zsgs.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	int[] bubbleSort(int[] unsortedArray) {
		for(int i=0;i<unsortedArray.length;i++) {
			for(int j=0;j<unsortedArray.length - i-1;j++) {
				 if(unsortedArray[j]>unsortedArray[j+1]) {
					 int temp = unsortedArray[j];
					 unsortedArray[j] = unsortedArray[j+1];
					 unsortedArray[j+1] = temp;
				 }
			}

		}
		return unsortedArray;
	}
	public static void main(String args[]) {
		int unsortedArray[] = {3,1,20,8,2};
		new BubbleSort().bubbleSort(unsortedArray);
		System.out.println("Sorted array is:"+ Arrays.toString(new BubbleSort().bubbleSort(unsortedArray)));
	}
}
