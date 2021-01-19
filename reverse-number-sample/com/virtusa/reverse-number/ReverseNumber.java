import java.util.Scanner;
import java.util.*;

public class ReverseNumber{
	
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter a number ");
		int number = sc.nextInt();
		int reversedNumber=0;
		
		while(number != 0){
			
			int tempElement = number%10; 
			reversedNumber = reversedNumber* 10 +tempElement ;
			number =number /10;	
		       }
		
		System.out.println("Revered Number = " + reversedNumber);
			
	}
	
	
	
	
	
	
	
}

