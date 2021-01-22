package com.madhushika.loop;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				
				continue;// it will skip the rest statement. do not print 5
			}
			System.out.println(i);
		}
	}

}
