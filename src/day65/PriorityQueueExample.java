package day65;

import java.util.*;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		Comparator<Integer> revAgeCom = Comparator.reverseOrder();
		Queue<Integer> pQue = new PriorityQueue<>();
		pQue.offer(10);
		pQue.offer(50);
		pQue.offer(30);
		pQue.offer(40);
		pQue.offer(5);
		
		System.out.println(pQue);
		
		while (!pQue.isEmpty()) {
			System.out.println(pQue.poll());
		}
		
		

	}

}
