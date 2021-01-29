package com.virtusa.madhushika;

import java.util.InputMismatchException;


public class LetterCount {

	public void letterforEach(String word) {
		try {
			char[] wordArray = word.toCharArray();
			for (int i = 0; i < wordArray.length; i++) {
				if (Character.isLetter(word.charAt(i)))
					i++;
				//chars().distinct().count()
			
			}
		} catch (InputMismatchException e) {

			throw new InputMismatchException("Caused by letter Count ");
		}

	}

}
