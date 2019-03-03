package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.add("NY");
		queue.add("PA");
		queue.add("FL");
		queue.add("CA");

		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		System.out.println(queue.element());

	}
}
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */




