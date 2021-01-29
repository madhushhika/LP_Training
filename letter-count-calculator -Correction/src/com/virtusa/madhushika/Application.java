package com.virtusa.madhushika;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
	public static void main(String[] arg) {
		try {

			System.out.println("Please enter a word");
			Scanner sc = new Scanner(System.in);
			String word = sc.next();
			LetterCount letterCount = new LetterCount();
			letterCount.letterforEach(word);
		} catch (InputMismatchException e) {
			System.err.print("Please check the input word");
		}
		

	}

}
