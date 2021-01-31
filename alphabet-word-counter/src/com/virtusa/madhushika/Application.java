package com.virtusa.madhushika;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
	public static void main(String[] arg) {
		try {

			System.out.println("Please enter a word");
			Scanner scanner = new Scanner(System.in);
			String word = scanner.nextLine().toUpperCase();

			LetterCount letterCount = new LetterCount();
			letterCount.letterforEach(word);

		} catch (NullPointerException e) {
			System.err.print("Please  input a word");
		}
		catch (InputMismatchException e) {
			System.err.print("Invalid Input");
		}

	}

}
