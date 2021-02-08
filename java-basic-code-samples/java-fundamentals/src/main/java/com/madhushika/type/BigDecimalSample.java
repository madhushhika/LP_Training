package com.madhushika.type;
import java.math.BigDecimal; 
public class BigDecimalSample {
	 public static void main(String[] args)  
	    { 
	        // Create two new BigDecimals 
	        BigDecimal bigdecimal1 =  
	               new BigDecimal("124567890.0987654321"); 
	        BigDecimal bigdecimal2 =  
	               new BigDecimal("987654321.123456789"); 
	          
	        // Addition of two BigDecimals 
	        bigdecimal1 = bigdecimal1.add(bigdecimal2); 
	        System.out.println("BigDecimal1 = " + bigdecimal1); 
	  
	        // Multiplication of two BigDecimals 
	        bigdecimal1 = bigdecimal1.multiply(bigdecimal2); 
	        System.out.println("BigDecimal1 = " + bigdecimal1); 
	  
	        // Subtraction of two BigDecimals 
	        bigdecimal1 = bigdecimal1.subtract(bigdecimal2); 
	        System.out.println("BigDecimal1 = " + bigdecimal1); 
	  
	        // Division of two BigDecimals 
	        bigdecimal1 = bigdecimal1.divide(bigdecimal2); 
	        System.out.println("BigDecimal1 = " + bigdecimal1); 
	  
	        // BigDecima1 raised to the power of 2 
	        bigdecimal1 = bigdecimal1.pow(2); 
	        System.out.println("BigDecimal1 = " + bigdecimal1); 
	  
	        // Negate value of BigDecimal1 
	        bigdecimal1 = bigdecimal1.negate(); 
	        System.out.println("BigDecimal1 = " + bigdecimal1); 
	    }     
}
