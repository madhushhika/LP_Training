package com.madhushika.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("Madhushika");
		list.add("Nethmi");
		list.add("Kavini");
		System.out.println("Printing List: " + list);
		System.out.println("Printing List: " + list.get(1));
		for (String Name : list)
			System.out.println(Name);
		
		
		ListIterator<String> itr=list.listIterator();    
        System.out.println("Traversing elements in forward direction");    
        while(itr.hasNext()){    
              
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
        }    
        System.out.println("Traversing elements in backward direction");    
        while(itr.hasPrevious()){    
          
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
        }   

	}
}
