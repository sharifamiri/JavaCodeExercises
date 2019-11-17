package day65;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		
	//  Collection 
	    //   Queue Interface  extends Collection interface 
	    //  LinkedList , PriorityQueue
	    
	    Queue<Integer> queue = new LinkedList<>(); 
	    /*
	     * Summary of Queue methods
	                Throws exception  Returns special value
	      Insert     add(e)              offer(e)
	      Remove     remove()              poll()
	      Examine     element()          peek()
	     * 
	     * */  
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(20);
		
		System.out.println(queue);
		
//		System.out.println("REMOVING FROM HEAD: "+queue.remove());
//		System.out.println("REMOVING FROM HEAD: "+queue.remove());
//		System.out.println("REMOVING FROM HEAD: "+queue.remove());
//		System.out.println("REMOVING FROM HEAD: "+queue.remove());
//		System.out.println("REMOVING FROM HEAD: "+queue.remove());
//		//System.out.println("REMOVING FROM HEAD: "+queue.remove()); //throws exception
//		
//		System.out.println("REMOVING FROM HEAD: "+queue.poll()); //prints null if empty
//		System.out.println("DO YOU HAVE NEXT ELEMENT: "+queue.peek()); //prints null if empty
		
		while(!queue.isEmpty()) {
			System.out.println("PROCESSING AND REMOVING "+ queue.poll());
		}

	}

}
