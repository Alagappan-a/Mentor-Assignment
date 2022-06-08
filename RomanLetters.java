package org.ZohoSchoolGraduateTraining;

import java.util.HashMap;
import java.util.Map;

public class RomanLetters {
	public static void convertRomanLetters(String letters) {
		char[] romanSymbols = letters.toCharArray();
		int sizeOfArray = romanSymbols.length;
		int integerValue = 0;
		for (int i = 0; i < sizeOfArray; i++) {
			if (romanSymbols[i] == 'M') {
				integerValue += 1000;
			} else if (romanSymbols[i] == 'D') {

				integerValue += 500;
			} else if (romanSymbols[i] == 'C') {
				if (i < sizeOfArray - 1) {
					if (romanSymbols[i + 1] == 'M') {
						integerValue += 900;
						i++;
					} else if (romanSymbols[i + 1] == 'D') {
						integerValue += 400;
						i++;
					} else {
						integerValue += 100;
					}
				} else {
					integerValue += 100;
				}

			} else if (romanSymbols[i] == 'L') {

				integerValue += 50;
			} else if (romanSymbols[i] == 'X') {
				if (i < sizeOfArray - 1) {
					if (romanSymbols[i + 1] == 'C') {
						integerValue += 90;
						i++;
					} else if (romanSymbols[i + 1] == 'L') {
						integerValue += 40;
						i++;
					} else {
						integerValue += 10;
					}
				} else {
					integerValue += 10;
				}

			} else if (romanSymbols[i] == 'V') {

				integerValue += 5;
			} else if (romanSymbols[i] == 'I') {
				if (i < sizeOfArray - 1) {
					if (romanSymbols[i + 1] == 'X') {
						integerValue += 9;
						i++;
					} else if (romanSymbols[i + 1] == 'V') {
						integerValue += 4;
						i++;
					} else {
						integerValue += 1;
					}
				} else {
					integerValue += 1;
				}
			}

		}
		System.out.println("the numerical value of given roman letter is:" + integerValue);

	}

	public static void convertRomanLettersUsingHashMap(String letters) {
		char[] romanSymbols = letters.toCharArray();
		int sizeOfArray = romanSymbols.length;
		int integerValue = 0;
		Map<Character, Integer> romanLetters = new HashMap<>();
		romanLetters.put('I', 1);
		romanLetters.put('V', 5);
		romanLetters.put('X', 10);
		romanLetters.put('L', 50);
		romanLetters.put('C', 100);
		romanLetters.put('D', 500);
		romanLetters.put('M', 1000);
		for (int i = 0; i < sizeOfArray; i++) {
			if((i+1)<sizeOfArray) {
			if (romanLetters.get(romanSymbols[i]) < romanLetters.get(romanSymbols[i + 1])) {

				integerValue += (romanLetters.get(romanSymbols[i + 1]) - romanLetters.get(romanSymbols[i]));
				i++;
			}
			else {
				integerValue += (romanLetters.get(romanSymbols[i]));
				
			}
			} else {
				integerValue += (romanLetters.get(romanSymbols[i]));
				
			}
		}
		System.out.println("the numerical value of given roman letter is:" + integerValue);
	}

	public static void main(String[] args) {
		String letters = "MCMXCLX";
		//convertRomanLetters(letters);
		convertRomanLettersUsingHashMap(letters);

	}

}
