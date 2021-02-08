package com.madhushika.exception.wrapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.virtusa.exception.*;

public class SavePayment{
	
	public  void updateFile()  throws CustomRuntimeException{
			
			try {
			
			  	  File file = new File("E:/hotelDetails.txt");
			      Scanner myReader = new Scanner(file);
			      while (myReader.hasNextLine()) {
			      String data = myReader.nextLine();
			      System.out.println(data);
			      }
			      myReader.close();
			}
			catch(FileNotFoundException  e) { 
				
				 throw new CustomRuntimeException("Cause by file not found"); 
				 
			}
			 
			
		}

   

    
}