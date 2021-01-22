package com.madhushika.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String args[]) 
    { 
        Queue<String> pq = new PriorityQueue<>(); 
        Queue<String> linkedqueue = new LinkedList<>(); 
      //  Queue<Integer>intqueue = new LinkedList<>();
        pq.add("Madhushika"); 
        pq.add("Madhushika"); 
        pq.add("Madhubahni"); 
        
        linkedqueue.add("Cat");
        linkedqueue.add("Dog");
        linkedqueue.add("Cat");
  
        System.out.println(pq);
        String head = linkedqueue.peek(); 
        System.out.println("head of queue-"
                           + head);
        
        System.out.println(linkedqueue); 
    } 
}
