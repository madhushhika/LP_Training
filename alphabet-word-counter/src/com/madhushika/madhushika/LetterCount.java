package com.madhushika.madhushika;

import java.util.InputMismatchException;

public class LetterCount {
	private int sum;
	private int wordCount;

	public void letterforEach(String word) throws NullPointerException,InputMismatchException {
		if ("".equals(word)) {
			throw new NullPointerException();
		}

		for (char character : word.toCharArray()) {
			if (!Character.isAlphabetic(character)){
				throw new InputMismatchException();
			}
			if (character >= 'A' && character <= 'Z') {
				sum += 1 + character - 'A';
			}
		}
		System.out.printf("The sum   is %d%n", sum);

		for (char letter = 'A'; letter <= 'Z'; letter++) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == letter) {
					wordCount++;
				}
			}
			if (wordCount > 0) {
				System.out.println(letter + "=" + wordCount);
				wordCount=0;
				
			}
		}
	}

}
