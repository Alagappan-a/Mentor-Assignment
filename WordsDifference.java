package org.ZohoSchoolGraduateTraining;

import java.util.Scanner;

public class WordsDifference {
	public static void removeCharacther(String firstWord, String secondWord) {
		String outPut = "";
		char firstWordCharacters[] = firstWord.toCharArray();
		char secondWordCharacters[] = secondWord.toCharArray();

		for (int i = 0; i < firstWordCharacters.length; i++) {
			for (int j = 0; j < secondWordCharacters.length; j++) {
				if (firstWordCharacters[i] == secondWordCharacters[j]) {
					firstWordCharacters[i] = '0';
					secondWordCharacters[j] = '0';
				}
			}
			if (firstWordCharacters[i] != '0') {
				outPut += firstWordCharacters[i];
			}
		}
		System.out.println("The given word after removing given characters are:\t'" + outPut + "'");
	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the first string:\t");
		String firstWord = userInput.nextLine();
		System.out.println("Enter the second string:\t");
		String secondWord = userInput.nextLine();
		removeCharacther(firstWord, secondWord);

	}

}
