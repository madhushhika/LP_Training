package com.virtusa.madhushika;


public class LetterCount {
	private int sum;

	public void letterforEach(String word) throws NullPointerException{
		if ("".equals(word)) {
			throw new NullPointerException();	
		}
			
		for (char character : word.toCharArray()) {
			if (character >= 'A' && character<= 'Z') {
				sum += 1 + character - 'A';
			}
		}
		System.out.printf("The sum   is %d%n", sum);
	}

}
