package com.madhushika.loop;


public class LoopForwardReverse {

	
	    public static void main(String[] args) {
	 
	        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	        System.out.println("_---------------Reverse --------------------");
	        for (int i = months.length - 1; i >= 0; i--) {//REVERSE LOOP 
	            System.out.println(months[i]);
	        }
	        System.out.println("_---------------Forward --------------------");
	        for (int i = 0; i < months.length; i++) {
	            System.out.println(months[i]); //forward
	        }
	    }
	

}
