package collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Object> pq=new PriorityQueue<>();
		
		pq.add(19);
		pq.add(32);
		pq.add(65);
		pq.add(21);
		pq.add(47);
		pq.add(21);
		pq.add(19);
		
		System.out.println(pq);
		
		System.out.println("\nUse of element() :->  "+pq.element());//returns the top element
		
		System.out.println("\nUse of peek() Method :-> "+pq.peek());//same as element()..
		
		System.out.println("\nUse of remove() Method:-> "+pq.remove());//removes the first element which is stored first...
		
		System.out.println("\nUse of poll() Method:-> "+pq.poll());//same as remove()
		
		
		
		System.out.println("\ntraversing the elements...");
		Iterator<Object> it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//---------------------------------------------------------------------------------------------------------
		System.out.println("\nAdd elements of user object into queue...");
		User u=new User(1, "HS", 47);
		User u1=new User(2, "Vishal", 21);
		
		PriorityQueue<User> pqu=new PriorityQueue<>();
		pqu.add(u);
		pqu.add(u1);
		pqu.add(new User(3, "Jaydip", 19));
		pqu.add(new User(4, "KH", 42));
		
		System.out.println(pqu);
		
		System.out.println("\ntraversing by for each loop...");
		for(Object o:pqu) {
			System.out.println(o);
		}
	}
}


/*
It follows the FIFO manner..
Queue supports all methods of collection interface..
It not maintain the insertion order..
*/